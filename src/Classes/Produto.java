package Classes;

import java.util.ArrayList;

public class Produto {

    private int codigo;
    private String categoria;
    private String descricao;
    private String nome;
    private int preco_compra;
    private int preco_venda;
    private int quantidade_em_estoque;

    //construtor Produto
    public Produto (int codigo, String nome, String descricao, String categoria, int preco_venda, int preco_compra, int quantidade_em_estoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoria;
        this.preco_compra = preco_compra;
        this.preco_venda = preco_venda;
        this.quantidade_em_estoque = quantidade_em_estoque;
        this.descricao = descricao;
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
    public int getpreco_compra() {
        return this.preco_compra;
    }
    public void setpreco_compra(int precomp) {
        this.preco_compra = precomp;
    }
    public int getpreco_venda() {
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

    public ArrayList<String> toArrayList(){
        ArrayList<String> lines = new ArrayList<String>();
        lines.add(categoria);
        lines.add(String.valueOf(codigo));
        lines.add(descricao);
        lines.add(nome);
        lines.add(String.valueOf(preco_compra));
        lines.add(String.valueOf(preco_venda));
        lines.add(String.valueOf(quantidade_em_estoque));
        return lines;
    }
}