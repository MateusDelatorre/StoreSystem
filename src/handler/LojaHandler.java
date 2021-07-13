package handler;

public class LojaHandler {
    private static float renda;
    
    //construtores
    private LojaHandler() {
        
    }

    //get e set

    public static float getRenda() {
        return renda;
    }

    public static void setRenda(float incomme) {
        renda = incomme;
    }
}
