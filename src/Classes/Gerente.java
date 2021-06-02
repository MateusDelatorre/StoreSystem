package Classes;

public class Gerente extends Funcionario {

    private float lucroObtidoMes;

    public Gerente(String cpf, String nome, float salario, float lucroObtidoMes) {
        super(cpf, nome, salario);
        this.lucroObtidoMes = lucroObtidoMes;
    }


    public float getLucroObtidoMes() {
        return lucroObtidoMes;
    }
    public void setLucroObtidoMes(float lucroObtidoMes) {
        this.lucroObtidoMes = lucroObtidoMes;
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
    public String getNome() {
        return super.getNome();
    }

    @Override
    public float getSalario() {
        return super.getSalario();
    }


    
}
