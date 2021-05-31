package Classes;

public class caixa extends Funcionario {
    
     public caixa(float cpf, String nome, float salario) {
        super(cpf, nome, salario);
    }


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
    public char getNome(String nome) {
        return super.getNome(nome);
    }

    @Override
    public float getSalario() {
        return super.getSalario();
    }

}
