package Funcoes;

abstract class Renda_da_loja {
    private static float renda;
    
    //construtores
    public Renda_da_loja() {
        
    }

    //get e set

    public static float getRenda() {
        return renda;
    }

    public void setRenda(float renda) {
        this.renda = renda;
    }
}
