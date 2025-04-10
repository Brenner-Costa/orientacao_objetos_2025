import java.util.ArrayList;
import java.util.List;

public class Evento {
    
    private int id;
    private String nome;
    private String local;
    private String data;
    private int capacidade;
    private static List<Ingresso> ingressos = new ArrayList<>(); // Precisa ser global para conseguir manipular

    //Colocar um array com uma quantidade X de ingressos no construtor do Evento. 
    //Colocar a mesma quantidade de ingresso na mesma capacidade do evento.
        // Se mexer na 
    //Instanciar os ingressos aqui no evento

    //Como os ingressos são atributos estáticos, a cada ingresso criado, posso somar 1 até dar a capacidade do evento
    //ACABAR TODOS OS INGRESSOS DO EVENTO.

    public Evento(int id, String nome, String local, String data, int capacidade) {
        this.id = id;
        this.nome = nome;
        this.local = local;
        this.data = data;
        this.capacidade = capacidade;
    }

    public String getNome() {
        return nome;
    }

    public String getLocal() {
        return local;
    }

    public String getData() {
        return data;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void exibirInfo() {
        System.out.println("Exibindo informações do evento...");
        System.out.println("Nome: " + getNome());
        System.out.println("Local: " + getLocal());
        System.out.println("Data: " + getData());
        System.out.println("Capacidade: " + getCapacidade());
    }



}
