package Classes;

public class Cliente extends Pessoa{
    private String senioridade;
    private float totalComprado;

    public Cliente(String nome, String cpf, String senioriade, float totalComprado) {
        super(nome, cpf);
        this.senioridade = senioriade;
        this.totalComprado = totalComprado;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }
    
    @Override
    public void setNome(String nome) {
        super.setNome(nome);;
    }

    @Override
    public String getCpf() {
        return super.getCpf();
    }

    @Override
    public void setCpf(String cpf) {
        super.setCpf(cpf);;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }

    public float getTotalComprado() {
        return totalComprado;
    }

    public void setTotalComprado(float totalComprado) {
        this.totalComprado = totalComprado;
    }

}
