public class IngressoOnline extends Ingresso {
    // Ingresso online para evento online
    private String linkAcesso;
    private String codigoValidacao;

    public IngressoOnline(int id, Cliente cliente, Evento evento) {
        super(id, cliente, evento);
        this.linkAcesso = gerarLinkAcesso();
        this.codigoValidacao = gerarCodigoValidacao();
    }

    private String gerarLinkAcesso() {
        return "https://evento.com/acesso/" + id;
    }

    private String gerarCodigoValidacao() {
        return "VAL" + id + "-" + cliente.getId();
    }

    @Override
    public double calcularValor() {
        return evento.getValorIngresso() * 0.9; // 10% de desconto por ser online
    }

}