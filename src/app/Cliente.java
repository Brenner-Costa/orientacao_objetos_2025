import java.util.ArrayList;
import java.util.List;


public class Cliente extends Pessoa {
    // Vai ter um ou mais eventos que vai fazer parte
    // nome, email, idade (verificar idade para comprar eventos de maior) - vão ser herdadas de pessoa.
    // Get para ver os eventos do cliente
    // id do cliente -> posso gerar com números aleatórios
    
    private Integer id;
    private List<Ingresso> ingressos = new ArrayList<>(); //Ingressos que fazem parte de eventos.


    Cliente(Integer _id, String _nome, String _email, Integer _idade) {
        super(_nome, _email, _idade);
        this.id = _id;
    }

    
    public void getIngressos() {
        //mostrar os ingressos que um cliente tem.
        Integer quantidadeIngresso = this.ingressos.size();

        for(int i = 0; i < quantidadeIngresso; i++) {
            System.out.println(ingressos.get(i));
        }
    }

    //Funçao para comprar ingressos
    public void comprarIngresso(Integer quantidadeIngressos) {
        if()
    }
    
    public void atualizarNome(String _novoNome) {
        System.out.println("Atualizando nome do cliente...");
        setNome(_novoNome);
        System.out.println("Nome atualizado com sucesso!");
    }
    
    public void atualizarEmail(String _novoEmail) {
        System.out.println("Atualizando Email do cliente...");
        setEmail(_novoEmail);
        System.out.println("Email atualizado com sucesso!");
    }
    
    public void atualizarIdade(Integer _novaIdade) {
        System.out.println("Atualizando Idade do cliente...");
        setIdade(_novaIdade);
        System.out.println("Idade atualizada com sucesso!");
    }
    
    @Override
    public void exibirInfo() {
        System.out.println("Exibindo dados do cliente...");
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Idade: " + getIdade());

        System.out.println("----- Ingressos -----");
        getIngressos();
    }
}
