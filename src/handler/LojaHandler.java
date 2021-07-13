package handler;

public class LojaHandler {
    private static Double patrimonio;
    
    //construtores
    private LojaHandler() {}

    //get e set

    public static Double getPatrimonio() {
        return patrimonio;
    }

    public static void Stonks(Double incomme) {
        patrimonio = incomme;
    }
}
