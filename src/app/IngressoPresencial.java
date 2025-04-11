public class IngressoPresencial extends Ingresso {
    private String assento;
    private double taxaServico;

    public IngressoPresencial(int id, Cliente cliente, Evento evento) {
        super(id, cliente, evento);
        this.taxaServico = 5.00;
        this.assento = "Setor A - Assento " + id; // exemplo aleatório
    }

    @Override
    public double calcularValor() {
        return evento.getValorIngresso() + taxaServico;
    }


}