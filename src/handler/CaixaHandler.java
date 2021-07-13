package handler;

import java.util.ArrayList;
import Classes.Caixa;
import Classes.Cliente;

/** 
* This class handler all the caixa methods
*/

public final class CaixaHandler {

    private static final String file_name = "caixas";
    private static ArrayList<Caixa> caixas = new ArrayList<Caixa>();
    
    private CaixaHandler(){
    }

    public static Cliente hasCliente() {
        return ClienteHandler.getClienteChekados();
    }

    /** 
    * return a caixa
    */
    public static Caixa getaCaixa(int index){
        return caixas.get(index);
    }

    public static void printaCaixa(){
        for (int i = 0; i < caixas.size(); i++) {
            System.out.println(caixas.get(i).toString());
        }
    }

    public static void carregarCaixa(){
        ArrayList<String> lines = FileHandler.readFile(file_name);
        toArrayCaixa(lines);
    }

    public static void salvarCaixa(){
        ArrayList<String> lines = toArrayString();
        FileHandler.writeFile(file_name, lines);
    }

    private static void toArrayCaixa(ArrayList<String> lines){
        // if(caixas.size() != 0){
        // }
        for (int i = 0; i < lines.size(); i+= 3){
            caixas.add(new Caixa(lines.get(i), lines.get(i + 1), Double.parseDouble(lines.get(i + 2))));
        }
    }

    private static ArrayList<String> toArrayString(){
        ArrayList<String> lines = new ArrayList<String>();
        for (int i = 0; i < caixas.size(); i++) {
            lines.addAll(caixas.get(i).toArrayList());
        }
        return lines;
    }

    public static void cadastrarCaixa(String name, String cpf, Double salario){
        caixas.add(new Caixa(name, cpf, salario));
    }

    public static void removerCaixa(String cpf){
        int i = 0;
        while ( i < caixas.size()) {
            if(caixas.get(i).getCpf() == cpf){
                caixas.remove(i);
                break;
            }else{
                i++;
            }
        }
    }
}