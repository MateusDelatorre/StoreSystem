package Classes;

import java.util.ArrayList;

public class Caixa extends Funcionario {
import Interface.CaixasGui;

public class Caixa extends Funcionario implements Caixa_funcao {
    
    public Caixa(String nome, String cpf, Double salario) {
        super(nome, cpf, salario);
    }

    public Caixa(String nome, String cpf) {
        super(nome, cpf);
    }

    public String toString(){
        return "Nome: " + this.getNome() + "\n" + "CPF: " + this.getCpf() + "\n" + "Salario: " + this.getSalario();
    //função
    public CaixasGui(String nome, String cpf, float dinheiro_recebido, float renda){
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

    public ArrayList<String> toArrayList(){
        ArrayList<String> lines = new ArrayList<String>();
        lines.add(this.getNome());
        lines.add(String.valueOf(this.getCpf()));
        lines.add(String.valueOf(this.getSalario()));
        return lines;
    }

}
