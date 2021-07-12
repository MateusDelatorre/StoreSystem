package handler;

import java.util.ArrayList;
import Classes.Gerente;

/** 
* This class handler all the gerente methods
*/

public final class GerenteHandler {

    private static final String file_name = "gerentes";
    private static ArrayList<Gerente> gerentes = new ArrayList<Gerente>();
    
    private GerenteHandler(){

    }
    /** 
    * return a gerente
    */
    public static Gerente getaGerente(int index){
        return gerentes.get(index);
    }

    public static void printaGerente(){
        for (int i = 0; i < gerentes.size(); i++) {
            System.out.println(gerentes.get(i).toString());
        }
    }

    public static void carregarGerente(){
        ArrayList<String> lines = FileHandler.readFile(file_name);
        toArrayGerente(lines);
    }

    public static void salvarGerente(){
        ArrayList<String> lines = toArrayString();
        FileHandler.writeFile(file_name, lines);
    }

    private static void toArrayGerente(ArrayList<String> lines){
        // if(caixas.size() != 0){
        // }
        for (int i = 0; i < lines.size(); i+= 4){
            gerentes.add(new Gerente(lines.get(i), lines.get(i + 1), Double.parseDouble(lines.get(i + 2)), Double.parseDouble(lines.get(i + 3))));
        }
    }

    private static ArrayList<String> toArrayString(){
        ArrayList<String> lines = new ArrayList<String>();
        for (int i = 0; i < gerentes.size(); i++) {
            lines.addAll(gerentes.get(i).toArrayList());
        }
        return lines;
    }
}