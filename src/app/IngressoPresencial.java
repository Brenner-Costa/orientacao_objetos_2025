public class IngressoPresencial extends Ingresso { // Herda a classe Ingresso
    private String assento;
    private double taxaServico;

    public IngressoPresencial(int id, Cliente cliente, Evento evento) {
        super(id, cliente, evento);
        this.taxaServico = 5.00;
        this.assento = "Setor A - Assento " + id; // Apenas para exemplificar
    }

    @Override
    public double calcularValor() {
        return evento.getValorIngresso() + taxaServico;
    }


}