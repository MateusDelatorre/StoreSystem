package Classes;

public class Cliente extends Pessoa{
    private String senioridade;
    private float totalComprado;

    public Cliente(String cpf, String nome, String senioriade, float totalComprado) {
        super(cpf, nome);
        this.senioridade = senioriade;
        this.totalComprado = totalComprado;
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

    @Override
    public String getNome(String nome) {
        return super.getNome(nome);
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
        super.setCpf(cpf);;
    }
}
