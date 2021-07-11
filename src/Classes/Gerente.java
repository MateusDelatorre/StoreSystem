package Classes;

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

}
