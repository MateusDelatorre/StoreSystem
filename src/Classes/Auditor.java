package Classes;

public class Auditor extends Funcionario {

    public Auditor(String cpf, String nome, float salario) {
        super(cpf, nome, salario);
    }

    @Override
    public void setCpf(String cpf) {
        super.setCpf(cpf);
    }
    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }
    @Override
    public void setSalario(float salario) {
        super.setSalario(salario);
    }

    @Override
    public String getCpf() {
        return super.getCpf();
    }

    @Override
    public String getNome(String nome) {
        return super.getNome(nome);
    }

    @Override
    public float getSalario() {
        return super.getSalario();
    }
}
