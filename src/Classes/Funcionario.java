package Classes;

public class Funcionario {
    private float cpf = 88899955566f;
    private String nome = "Jose Da Silva";
    private float salario = 1200f;
    
    
    //construtor de funcionario
    public Funcionario(float cpf, String nome, float salario) {
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
    }

    //metodos
    public float getCpf() {
        return cpf;
    }
    public void setCpf(float cpf) {
        this.cpf = cpf;
    }
    public char getNome(String nome) {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

}
