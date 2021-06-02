package Classes;

public class Caixas extends Funcionario {
    
    public Caixas(String cpf, String nome, float salario) {
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
    public String getNome() {
        return super.getNome();
    }

    @Override
    public float getSalario() {
        return super.getSalario();
    }

}
