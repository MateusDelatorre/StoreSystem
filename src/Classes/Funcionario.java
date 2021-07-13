package Classes;

import java.util.ArrayList;

public class Funcionario extends Pessoa{
    
    private Double salario;

    public Funcionario() {
        
    }

    public Funcionario(String nome, String cpf) {
        super(nome, cpf);
    }

    public Funcionario(String nome, String cpf, Double salario) {
        super(nome, cpf);
        this.salario = salario;
    }
    
    public Double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public ArrayList<String> toArrayList() {
        ArrayList<String> lines = new ArrayList<String>();
        lines.add(getNome());
        lines.add(getCpf());
        lines.add(String.valueOf(getSalario()));
        return lines;
    }

    

}
