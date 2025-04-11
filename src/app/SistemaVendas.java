import java.util.ArrayList;
import java.util.List;

public class SistemaVendas implements IVenda {
    private List<Cliente> clientes = new ArrayList<>();    // lista de clientes (Agregação)
    private List<Evento> eventos = new ArrayList<>();      // lista de eventos (Agregação)
    private List<Ingresso> ingressos = new ArrayList<>();  // lista de ingressos (Agregação)
    private static int totalVendas = 0;                    // Atributos estáticos: compartilhado entre instâncias

    // cadastro de clientes
    public void cadastrarCliente(Cliente c) {
        clientes.add(c); // Adiciona à coleção
    }

    // cadastro de eventos
    public void cadastrarEvento(Evento e) {
        eventos.add(e); // Adiciona à coleção
    }

    // comprar ingressos. Podendo ser online ou presencial
    public void comprarIngresso(int clienteId, int eventoId) {
        Cliente cliente = buscarCliente(clienteId);
        Evento evento = buscarEvento(eventoId);
        if (cliente != null && evento != null && evento.getIngressosDisponiveis() > 0) {
            int codigo = ingressos.size() + 1;
            Ingresso ingresso;
    
            if (evento.isOnline()) {
                ingresso = new IngressoOnline(codigo, cliente, evento);
            } else {
                ingresso = new IngressoPresencial(codigo, cliente, evento);
            }
    
            ingressos.add(ingresso);           // Composição
            evento.reduzirIngressos(1);        // Atualiza disponibilidade
            totalVendas++;                     // Atributo estático
        }
    }

    // Método para auditar ingressos disponíveis
    public int auditarIngressosDisponiveis(int eventoId) {
        Evento evento = buscarEvento(eventoId);
        return (evento != null) ? evento.getIngressosDisponiveis() : 0;
    }

    @Override // Sobrescrita: implementação do método da interface
    public double calcularReceita() {
        double total = 0;
        for (Ingresso i : ingressos) { 
            total += i.getEvento().getValorIngresso();
        }
        return total;
    }

    // Sobrecarga: versão do método com parâmetro específico
    public double calcularReceita(int eventoId) {
        double total = 0;
        for (Ingresso i : ingressos) { // Polimorfismo: itera sobre coleção de ingressos
            if (i.getEvento().getId() == eventoId) {
                total += i.getEvento().getValorIngresso();
            }
        }
        return total;
    }

    // Método para buscar cliente
    private Cliente buscarCliente(int id) {
        return clientes.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
    }

    // Método para buscar evento
    private Evento buscarEvento(int id) {
        return eventos.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
    }

    // Método estático para acessar o total de vendas
    public static int getTotalVendas() {
        return totalVendas;
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }
}