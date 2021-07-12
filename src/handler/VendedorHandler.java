package handler;

import java.util.ArrayList;
import Classes.Vendedor;

/** 
* This class handler all the vendedor methods
*/

public final class VendedorHandler {

    private static final String file_name = "vendedores";
    private static ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();
    
    private VendedorHandler(){

    }
    /** 
    * return a vendedor
    */
    public static Vendedor getaVendedor(int index){
        return vendedores.get(index);
    }

    public static void printaVendedor(){
        for (int i = 0; i < vendedores.size(); i++) {
            System.out.println(vendedores.get(i).toString());
        }
    }

    public static void carregarVendedor(){
        ArrayList<String> lines = FileHandler.readFile(file_name);
        toArrayVendedor(lines);
    }

    public static void salvarVendedor(){
        ArrayList<String> lines = toArrayString();
        FileHandler.writeFile(file_name, lines);
    }

    private static void toArrayVendedor(ArrayList<String> lines){
        // if(caixas.size() != 0){
        // }
        for (int i = 0; i < lines.size(); i+= 4){
            vendedores.add(new Vendedor(lines.get(i), lines.get(i + 1), Double.parseDouble(lines.get(i + 2)), Double.parseDouble(lines.get(i + 3))));
        }
    }

    private static ArrayList<String> toArrayString(){
        ArrayList<String> lines = new ArrayList<String>();
        for (int i = 0; i < vendedores.size(); i++) {
            lines.addAll(vendedores.get(i).toArrayList());
        }
        return lines;
    }
}