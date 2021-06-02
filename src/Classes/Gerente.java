package Classes;

public class Gerente extends Funcionario {

    private float lucroObtidoMes;

    public Gerente(String nome, String cpf, float salario, float lucroObtidoMes) {
        super(nome, cpf, salario);
        this.lucroObtidoMes = lucroObtidoMes;
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
    public String getNome() {
        return super.getNome();
    }
    
    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public float getSalario() {
        return super.getSalario();
    }

    @Override
    public void setSalario(float salario) {
        super.setSalario(salario);
    }

    public float getLucroObtidoMes() {
        return lucroObtidoMes;
    }
    public void setLucroObtidoMes(float lucroObtidoMes) {
        this.lucroObtidoMes = lucroObtidoMes;
    }

}
