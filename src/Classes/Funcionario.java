package Classes;

public class Funcionario extends Pessoa{
    
    private Double salario;

    public Funcionario() {
        
    }

    public Funcionario(String nome, String cpf) {
        super(nome, cpf);
    }

    public Funcionario(String nome, String cpf, Double salario) {
        super(nome, cpf);
        this.salario = salario;
    }
    
    public Double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    

}
