package Classes;

import java.util.ArrayList;

public class Vendedor extends Funcionario {
    private Double vendasMes;

    public Vendedor(String nome, String cpf, Double salario, Double vendasMes) {
        super(nome, cpf, salario);
        this.vendasMes = vendasMes;
    }

    public Double getVendasMes() {
        return vendasMes;
    }

    public void setVendasMes(float vendasMes) {
        this.vendasMes = (double) vendasMes;
    }

    public String toString(){
        return "Nome: " + this.getNome() + "\n" + "CPF: " + this.getCpf() + "\n" + "Salario: " + this.getSalario() + "\n" + "Vendas mês: " + this.getVendasMes();
    }

    public ArrayList<String> toArrayList(){
        ArrayList<String> lines = new ArrayList<String>();
        lines.add(this.getNome());
        lines.add(String.valueOf(this.getCpf()));
        lines.add(String.valueOf(this.getSalario()));
        lines.add(String.valueOf(this.getVendasMes()));
        return lines;
    }

}