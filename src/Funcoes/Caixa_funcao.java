package Funcoes;

import Classes.Caixa;

public class Caixa_funcao extends Caixa {
    private float dinheiro_recebido;

    //construtor
     public Caixa_funcao(String nome, String cpf, float dinheiro_recebido,float setRenda) {
        super(nome, cpf);
        this.dinheiro_recebido = dinheiro_recebido;
        setRenda = dinheiro_recebido;
    }

    

    

    //get e set
    public float getDinheiro_recebido() {
        return dinheiro_recebido;
    }

    public void setDinheiro_recebido(float dinheiro_recebido) {
        this.dinheiro_recebido = dinheiro_recebido;
    }
    
    
}
