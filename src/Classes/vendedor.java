package Classes;

public class vendedor extends Funcionario {
    private float vendasMes;
    
    

    public vendedor(float cpf, String nome, float salario, float vendasMes) {
        super(cpf, nome, salario);
        this.vendasMes = vendasMes;
    }

    public float getVendasMes() {
        return vendasMes;
    }

    public void setVendasMes(float vendasMes) {
        this.vendasMes = vendasMes;
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
        //tentando fazer os 10%  ao salario
        float x;
        x=(getVendasMes()*10)/100;
        super.setSalario(salario+x);
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
