package Classes;

import java.util.ArrayList;

public class Caixa extends Funcionario {
    
    public Caixa(String nome, String cpf, Double salario) {
        super(nome, cpf, salario);
    }

    public Caixa(String nome, String cpf) {
        super(nome, cpf);
    }

    public String toString(){
        return "Nome: " + this.getNome() + "\n" + "CPF: " + this.getCpf() + "\n" + "Salario: " + this.getSalario();
    }

    public ArrayList<String> toArrayList(){
        ArrayList<String> lines = new ArrayList<String>();
        lines.add(this.getNome());
        lines.add(String.valueOf(this.getCpf()));
        lines.add(String.valueOf(this.getSalario()));
        return lines;
    }

}
