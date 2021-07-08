package Classes;

import Interface.AuditoresGui;

public class Auditor extends Funcionario implements Auditores_funcao{

    public Auditor(String nome, String cpf, float salario) {
        super(nome, cpf, salario);
    }

    //funcao
    public AuditoresGui(String nome, String cpf,float valor_pagar,float renda){
        float x;
        x = valor_pagar-renda;
        return System.out.println("O VALOR DE %f FOI PAGO COM A RENDA %f. RENDA ATUAL DA LOJA: %f",valor_pagar,renda,x);
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
