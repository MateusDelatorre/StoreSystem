package Classes;

public class Produto {

    private int codigo;
    private String nome;
    private String descricao;

    //construtor Produto
    public Produto (int Codigo, String Nome, String Descricao) {
        this.codigo = Codigo;
        this.nome = Nome;
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
    public String getDescricao() {
        return this.descricao;

    }
    public void setDescricao(String d) {
        this.descricao = d;

    }
}