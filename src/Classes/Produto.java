package Classes;

import java.util.ArrayList;

public class Produto {

    private int codigo;
    private String categoria;
    private String descricao;
    private String nome;
    private double preco_compra;
    private double preco_venda;
    private int quantidade_em_estoque;

    //construtor Produto
    public Produto (int codigo, String categoria, String descricao, String nome, double preco_compra, double preco_venda, int quantidade_em_estoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoria;
        this.preco_compra = preco_compra;
        this.preco_venda = preco_venda;
        this.quantidade_em_estoque = quantidade_em_estoque;
        this.descricao = descricao;
    }

    public Produto(Produto produto) {
        this.codigo = produto.getCodigo();
        this.nome = produto.getNome();
        this.categoria = produto.getCategoria();
        this.preco_compra = produto.getpreco_compra();
        this.preco_venda = produto.getpreco_venda();
        this.quantidade_em_estoque = produto.getquantidade_em_estoque();
        this.descricao = produto.getDescricao();
    }

    //Gets-Sets

    public int getCodigo() {
        return this.codigo;
    }
    public void setCodigo(int c) {
        this.codigo = c;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String n) {
        this.nome = n;
    }
    public String getCategoria() {
        return this.categoria;
    }
    public void setCategoria(String categ) {
        this.categoria = categ;
    }
    public double getpreco_compra() {
        return this.preco_compra;
    }
    public void setpreco_compra(int precomp) {
        this.preco_compra = precomp;
    }
    public double getpreco_venda() {
        return this.preco_venda;
    }
    public void setpreco_venda(int prevend) {
        this.preco_venda = prevend;
    }
    public int getquantidade_em_estoque() {
        return this.quantidade_em_estoque;
    }
    public void setquantidade_em_estoque(int quant) {
        this.quantidade_em_estoque = quant;
    }
    public String getDescricao() {
        return this.descricao;
    }
    public void setDescricao(String d) {
        this.descricao = d;
    }

    public String toString(){
        return "Categoria: " + this.categoria + "\n" + "Codigo: " + this.codigo + "\n" + "Descrição: " + this.descricao  + "\n" + "Nome: " + this.nome + "\n" + "Preço de Compra: " + this.preco_compra + "\n" + "Preço de Venda: " + this.preco_venda + "\n" + "quantidade_em_estoque: " + this.quantidade_em_estoque;
    }

    public ArrayList<String> toArrayList(){
        ArrayList<String> lines = new ArrayList<String>();
        lines.add(String.valueOf(codigo));
        lines.add(categoria);
        lines.add(descricao);
        lines.add(nome);
        lines.add(String.valueOf(preco_compra));
        lines.add(String.valueOf(preco_venda));
        lines.add(String.valueOf(quantidade_em_estoque));
        return lines;
    }
}