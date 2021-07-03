package Classes;

public class Caixa extends Funcionario implements Caixa_funcao {
    
    public Caixa(String nome, String cpf, float salario) {
        super(nome, cpf, salario);
    }

    public Caixa(String nome, String cpf) {
        super(nome, cpf);
    }

    //função
    public Caixa_funcao(String nome, String cpf, float dinheiro_recebido, float renda){
          renda = dinheiro_recebido;  
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
    public String getCpf() {
        return super.getCpf();
    }

    @Override
    public void setCpf(String cpf) {
        super.setCpf(cpf);
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
