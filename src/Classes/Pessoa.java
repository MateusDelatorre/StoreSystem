package Classes;

public class Pessoa {

    protected String cpf;
    protected String nome;
    
    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }
    
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome(String nome) {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

}
