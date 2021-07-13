package Classes;

import java.util.ArrayList;

public class Cliente extends Pessoa{
    private String senioridade;
    private Double totalComprado;
    ArrayList<Produto> carrinho;
    private Boolean chekado;

    public Cliente(String nome, String cpf, String senioriade, Double totalComprado) {
        super(nome, cpf);
        this.senioridade = senioriade;
        this.totalComprado = totalComprado;
        carrinho = new ArrayList<Produto>();
        this.chekado = false;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }

    public Double getTotalComprado() {
        return totalComprado;
    }

    public void setTotalComprado(Double totalComprado) {
        this.totalComprado = totalComprado;
    }

    public Boolean getChekado() {
        return chekado;
    }

    public void setChekado(Boolean check) {
        this.chekado = check;
    }

    public ArrayList<String> toArrayList(){
        ArrayList<String> lines = new ArrayList<String>();
        lines.add(getNome());
        lines.add(getCpf());
        lines.add(getSenioridade());
        //lines.add(String.valueOf(getTotalComprado()));
        return lines;
    }

    public ArrayList<Produto> getCarrinho(){
        return carrinho;
    }

    public void clearCarrinho(){
        carrinho = new ArrayList<Produto>();
    }

    public Double getTotalDaCompra(){
        double total_da_compra = 0.0;
        for (Produto produto : carrinho) {
            total_da_compra += (produto.getpreco_venda() * produto.getquantidade_em_estoque());
        }
        return total_da_compra;
    }

}
