public class IngressoOnline extends Ingresso { // Herda a classe abstrata ingresso
    private String linkAcesso;
    private String codigoValidacao;

    public IngressoOnline(int id, Cliente cliente, Evento evento) {
        super(id, cliente, evento);
        this.linkAcesso = gerarLinkAcesso();
        this.codigoValidacao = gerarCodigoValidacao();
    }

    // Método para gerar link de acesso para o usuário que comprou o ingresso online
    private String gerarLinkAcesso() {
        return "https://evento.com/acesso/" + id;
    }

    //Método para gerar o código de validação do ingresso online
    private String gerarCodigoValidacao() {
        return "VAL" + id + "-" + cliente.getId();
    }

    @Override
    public double calcularValor() {
        return evento.getValorIngresso() * 0.9; // 10% de desconto por ser online
    }

}