package Classes;

public class Vendedor extends Funcionario {
    private float vendasMes;
    
    

    public Vendedor(String nome, String cpf, float salario, float vendasMes) {
        super(nome, cpf, salario);
        this.vendasMes = vendasMes;
    }

    public float getVendasMes() {
        return vendasMes;
    }

    public void setVendasMes(float vendasMes) {
        this.vendasMes = vendasMes;
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
    
}
