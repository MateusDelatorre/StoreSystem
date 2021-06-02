package Classes;

public class Auditor extends Funcionario {

    public Auditor(String nome, String cpf, float salario) {
        super(nome, cpf, salario);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public String getCpf() {
        return super.getCpf();
    }

    @Override
    public void setCpf(String cpf) {
        super.setCpf(cpf);
    }

    @Override
    public float getSalario() {
        return super.getSalario();
    }

    @Override
    public void setSalario(float salario) {
        super.setSalario(salario);
    }
    
}
