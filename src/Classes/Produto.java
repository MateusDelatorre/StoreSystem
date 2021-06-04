package Classes;

public class Produto {

    private int codigo;
    private String nome;
    private String categoria;
    private int preco_compra;
    private int preco_venda;
    private int quantida_estoque;
    private String descricao;

    //construtor Produto
    public Produto (int codigo, String nome, String descricao, String categoria, int preco_venda, int preco_compra, int quantida_estoque) {
        this.codigo = Codigo;
        this.nome = Nome;
        this.categoria = Categoria;
        this.preco_compra = Preco_Compra;
        this.preco_venda = Preco_venda;
        this.quantidade_estoque = Quantidade_Estoque;
        this.descricao = Descricao;
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
    public int getquantidade_estoque() {
        return this.quantidade_estoque;
    }
    public void setquantidade_estoque(int quant) {
        this.quantidade_estoque = quant;
    }
    public String getDescricao() {
        return this.descricao;
    }
    public void setDescricao(String d) {
        this.descricao = d;
    }
}