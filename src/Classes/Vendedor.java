package Classes;

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

}