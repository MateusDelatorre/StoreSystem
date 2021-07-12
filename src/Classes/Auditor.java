package Classes;

import java.util.ArrayList;

public class Auditor extends Funcionario /*implements Auditores_funcao*/{

    public Auditor(String nome, String cpf, Double salario) {
        super(nome, cpf, salario);
    }

    public String toString(){
        return "Nome: " + this.getNome() + "\n" + "CPF: " + this.getCpf() + "\n" + "Salario: " + this.getSalario();
    }
    //funcao
    // public AuditoresGui(String nome, String cpf,float valor_pagar,float renda){
    //     float x;
    //     x = valor_pagar-renda;
    //     return System.out.println("O VALOR DE %f FOI PAGO COM A RENDA %f. RENDA ATUAL DA LOJA: %f",valor_pagar,renda,x);
    // }

    public ArrayList<String> toArrayList(){
        ArrayList<String> lines = new ArrayList<String>();
        lines.add(this.getNome());
        lines.add(String.valueOf(this.getCpf()));
        lines.add(String.valueOf(this.getSalario()));
        return lines;
    }

}
