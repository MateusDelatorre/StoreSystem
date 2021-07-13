package handler;

import java.util.ArrayList;

public class LojaHandler {
    private static final String file_name = "Loja";
    private static Double patrimonio;
    
    //construtores
    private LojaHandler() {}

    //get e set

    public static Double getPatrimonio() {
        return patrimonio;
    }

    public static void Stonks(Double income) {
        patrimonio += income;
    }

    public static void NotStonks(Double outgoing) {
        patrimonio -= outgoing;
    }

    public static void carregarPatrimonio(){
        ArrayList<String> lines = FileHandler.readFile(file_name);
        toArrayList(lines);
    }

    public static void salvarPatrimonio(){
        ArrayList<String> lines = toArrayList();
        FileHandler.writeFile(file_name, lines);
    }

    private static void toArrayList(ArrayList<String> lines){
        patrimonio = Double.parseDouble(lines.get(0));
    }

    private static ArrayList<String> toArrayList(){
        ArrayList<String> lines = new ArrayList<String>();
        lines.add(String.valueOf(patrimonio));
        return lines;
    }
}
