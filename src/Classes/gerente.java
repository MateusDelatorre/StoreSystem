package Classes;

public class gerente extends Funcionario {

    private float lucroObtidoMes;

    public gerente(float cpf, String nome, float salario, float lucroObtidoMes) {
        super(cpf, nome, salario);
        this.lucroObtidoMes = lucroObtidoMes;
    }


    public float getLucroObtidoMes() {
        return lucroObtidoMes;
    }
    public void setLucroObtidoMes(float lucroObtidoMes) {
        this.lucroObtidoMes = lucroObtidoMes;
    }

    ///////////////////
    @Override
    public void setCpf(float cpf) {
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
    public float getCpf() {
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
