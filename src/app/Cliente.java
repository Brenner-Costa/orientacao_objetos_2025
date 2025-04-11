public class Cliente extends Pessoa { //Cliente usa a classe abstrata pessoa
    private Integer id;


    Cliente(Integer _id, String _nome, String _email, Integer _idade) {
        super(_nome, _email, _idade);
        this.id = _id;
    }

    public int getId() { return id; }
    
    //Função para atualizar o nome do cliente
    public void atualizarNome(String _novoNome) {
        System.out.println("Atualizando nome do cliente...");
        setNome(_novoNome);
        System.out.println("Nome atualizado com sucesso!");
    }
    
    //Função para atualizar o email do cliente
    public void atualizarEmail(String _novoEmail) {
        System.out.println("Atualizando Email do cliente...");
        setEmail(_novoEmail);
        System.out.println("Email atualizado com sucesso!");
    }
    
    //Função para atualizar a idade do cliente
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
    }
}
