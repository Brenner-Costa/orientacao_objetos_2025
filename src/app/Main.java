public class Main {
    public static void main(String[] args) {

        SistemaVendas sistema = new SistemaVendas();

        // Criando clientes
        Cliente cliente1 = new Cliente(1, "Brenner", "brenner@email.com", 23);
        Cliente cliente2 = new Cliente(2, "Ana", "ana@email.com", 28);
        Cliente cliente3 = new Cliente(3, "Carlos", "carlos@email.com", 35);
        Cliente cliente4 = new Cliente(4, "Julia", "julia@email.com", 22);
        Cliente cliente5 = new Cliente(5, "Pedro", "pedro@email.com", 30); // usaremos para testar evento lotado

        sistema.cadastrarCliente(cliente1);
        sistema.cadastrarCliente(cliente2);
        sistema.cadastrarCliente(cliente3);
        sistema.cadastrarCliente(cliente4);
        sistema.cadastrarCliente(cliente5);

        // Criando eventos
        Evento eventoPresencial = new Evento(1, "Show de Pagode", "Circo Voador", "17/09/2025", 100, 100.0, 50, false);
        Evento eventoOnline = new Evento(2, "Palestra de Tech", "Zoom", "20/09/2025", 1000, 30.0, 1000, true);

        sistema.cadastrarEvento(eventoPresencial);
        sistema.cadastrarEvento(eventoOnline);

        // Compras para evento presencial
        sistema.comprarIngresso(1, 1); // cliente1
        sistema.comprarIngresso(2, 1); // cliente2
        sistema.comprarIngresso(3, 1); // cliente3
        sistema.comprarIngresso(5, 1); // cliente5 - evento lotado

        // Compras para evento online
        sistema.comprarIngresso(4, 2); // cliente4
        sistema.comprarIngresso(5, 2); // cliente5

        // Relatórios
        System.out.println("\n Relatório de Vendas:");

        System.out.println("Ingressos disponíveis (Evento Presencial): " + sistema.auditarIngressosDisponiveis(1));
        System.out.println("Ingressos disponíveis (Evento Online): " + sistema.auditarIngressosDisponiveis(2));

        System.out.println("Receita total: R$ " + sistema.calcularReceita());
        System.out.println("Receita do Evento 1 (Presencial): R$ " + sistema.calcularReceita(1));
        System.out.println("Receita do Evento 2 (Online): R$ " + sistema.calcularReceita(2));

        System.out.println("Total de vendas realizadas: " + SistemaVendas.getTotalVendas());
    }
}
