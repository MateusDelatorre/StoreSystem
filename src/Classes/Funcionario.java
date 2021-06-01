package Classes;

public class Funcionario extends Pessoa{
    
    private float salario;
    
    public Funcionario(String cpf, String nome, float salario) {
        super(nome, cpf);
        this.salario = salario;
    }


    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }


    @Override
    public String getCpf() {
        return super.getCpf();
    }

    @Override
    public void setCpf(String cpf) {
        super.setCpf(cpf);;
    }

    @Override
    public String getNome(String nome) {
        return super.getNome(nome);
    }
    
    @Override
    public void setNome(String nome) {
        super.setNome(nome);;
    }

}
