public abstract class Ingresso implements IPagamento {
    protected int id;
    protected Cliente cliente;
    protected Evento evento;

    public Ingresso(int id, Cliente cliente, Evento evento) {
        this.id = id;
        this.cliente = cliente;
        this.evento = evento;
    }

    public Evento getEvento() { return evento; }
    public Cliente getCliente() { return cliente; }
    public int getCodigo() { return id; } // Levando em consideração que o ID é único para cada ingresso, usei o próprio ID como código do ingresso.
}