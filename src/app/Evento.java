public class Evento {
    
    private int id;
    private String nome;
    private String local;
    private String data;
    private int capacidade;
    private boolean online;
    private double valorIngresso; // Encapsulamento: valor do ingresso
    private int ingressosDisponiveis;

    public Evento(int id, String nome, String local, String data, int capacidade, double _valorIngresso, int _ingressosDisponiveis, boolean _online) {
        this.id = id;
        this.nome = nome;
        this.local = local;
        this.data = data;
        this.capacidade = capacidade;
        this.valorIngresso = _valorIngresso;
        this.ingressosDisponiveis = _ingressosDisponiveis;
        this.online = _online;
    }
    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getLocal() { return local; }
    public String getData() { return data; }
    public Integer getCapacidade() { return capacidade; }
    public double getValorIngresso() { return valorIngresso; }
    public int getIngressosDisponiveis() { return ingressosDisponiveis; }

    public void reduzirIngressos(int quantidade) {
        if (quantidade <= ingressosDisponiveis) {
            ingressosDisponiveis -= quantidade;
        }
    }

    public boolean isOnline() {
        return online;
    }

    public void exibirInfo() {
        System.out.println("Exibindo informações do evento...");
        System.out.println("Nome: " + getNome());
        System.out.println("Local: " + getLocal());
        System.out.println("Data: " + getData());
        System.out.println("Capacidade: " + getCapacidade());
    }

}
