public abstract class Pessoa {
    protected String nome;
    protected String email;
    protected Integer idade;

    public Pessoa(String _nome, String _email, Integer _idade) {
        this.nome = _nome;
        this.email = _email;
        this.idade = _idade;
    }

    
    public String getNome() {
        return nome;
    }
    
    public String getEmail() {
        return email;
    }

    public Integer getIdade() {
        return idade;
    }
    
    public void setNome(String _nomeNovo) {
        this.nome = _nomeNovo;
    }
    public void setEmail(String _emailNovo) {
        this.email = _emailNovo;
    }
    
    public void setIdade(Integer _idadeNova) {
        this.idade = _idadeNova;
    }
    
    public abstract void exibirInfo();
}