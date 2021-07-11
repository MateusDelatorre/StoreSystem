package Classes;

import java.util.ArrayList;

public class Gerente extends Funcionario {

    private Double lucroObtidoMes;

    public Gerente(String nome, String cpf, Double salario, Double lucroObtidoMes) {
        super(nome, cpf, salario);
        this.lucroObtidoMes = lucroObtidoMes;
    }

    public Double getLucroObtidoMes() {
        return lucroObtidoMes;
    }
    public void setLucroObtidoMes(Double lucroObtidoMes) {
        this.lucroObtidoMes = lucroObtidoMes;
    }

    public String toString(){
        return "Nome: " + this.getNome() + "\n" + "CPF: " + this.getCpf() + "\n" + "Salario: " + this.getSalario() + "\n" + "Lucro obitido mês: " + this.getLucroObtidoMes();
    }

    public ArrayList<String> toArrayList(){
        ArrayList<String> lines = new ArrayList<String>();
        lines.add(this.getNome());
        lines.add(String.valueOf(this.getCpf()));
        lines.add(String.valueOf(this.getSalario()));
        lines.add(String.valueOf(this.getLucroObtidoMes()));
        return lines;
    }

}
