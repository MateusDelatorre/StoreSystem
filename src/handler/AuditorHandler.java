package handler;

import java.util.ArrayList;
import Classes.Auditor;

/** 
* This class handler all the auditor methods
*/

public final class AuditorHandler {

    private static final String file_name = "auditores";
    private static ArrayList<Auditor> auditores = new ArrayList<Auditor>();
    
    private AuditorHandler(){

    }
    /** 
    * return a auditor
    */
    public static Auditor getaAuditor(int index){
        return auditores.get(index);
    }

    public static void printaAuditor(){
        for (int i = 0; i < auditores.size(); i++) {
            System.out.println(auditores.get(i).toString());
        }
    }

    public static void carregarAuditor(){
        ArrayList<String> lines = FileHandler.readFile(file_name);
        toArrayAuditor(lines);
    }

    public static void salvarAuditor(){
        ArrayList<String> lines = toArrayString();
        FileHandler.writeFile(file_name, lines);
    }

    private static void toArrayAuditor(ArrayList<String> lines){
        // if(auditores.size() != 0){
        // }
        for (int i = 0; i < lines.size(); i+= 3){
            auditores.add(new Auditor(lines.get(i), lines.get(i + 1), Double.parseDouble(lines.get(i + 2))));
        }
    }

    private static ArrayList<String> toArrayString(){
        ArrayList<String> lines = new ArrayList<String>();
        for (int i = 0; i < auditores.size(); i++) {
            lines.addAll(auditores.get(i).toArrayList());
        }
        return lines;
    }

    public static void cadastrarAuditor(String name, String cpf, Double salario){
        auditores.add(new Auditor(name, cpf, salario));
    }

    public static void removerAuditor(String cpf){
        int i = 0;
        while ( i < auditores.size()) {
            if(auditores.get(i).getCpf() == cpf){
                auditores.remove(i);
                break;
            }else{
                i++;
            }
        }
    }

    
}