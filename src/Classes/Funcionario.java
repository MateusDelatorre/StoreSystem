package Classes;

public class Funcionario extends Pessoa{
    
    private float salario;
    
    public Funcionario(String nome, String cpf, float salario) {
        super(nome, cpf);
        this.salario = salario;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }
    @Override
    public void setNome(String nome) {
        super.setNome(nome);;
    }
    @Override
    public String getCpf() {
        return super.getCpf();
    }
    @Override
    public void setCpf(String cpf) {
        super.setCpf(cpf);;
    }

    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    

}
