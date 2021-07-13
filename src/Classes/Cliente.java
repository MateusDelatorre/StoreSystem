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

}
