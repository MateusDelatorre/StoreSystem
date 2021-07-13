package handler;

import java.util.ArrayList;
import Classes.Auditor;
import Classes.Caixa;
import Classes.Funcionario;
import Classes.Gerente;
import Classes.Vendedor;

/** 
* This class handler all the gerente methods
*/

public final class GerenteHandler {

    private static final String file_name = "gerentes";
    private static ArrayList<Gerente> gerentes = new ArrayList<Gerente>();
    private static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    
    private GerenteHandler(){

    }

    public static String[][] toArray(){
        String[][] data = new String[funcionarios.size()][];
        for (int i = 0; i < funcionarios.size(); i++) {
            ArrayList<String> row = funcionarios.get(i).toArrayList();
            data[i] = row.toArray(new String[row.size()]);
        }
        return data;
    }

    public static void carregarFuncionarios(){
        AuditorHandler.carregarAuditor();
        CaixaHandler.carregarCaixa();
        VendedorHandler.carregarVendedor();
        funcionarios.addAll(AuditorHandler.getAuditorArray());
        funcionarios.addAll(CaixaHandler.getCaixaArray());
        funcionarios.addAll(VendedorHandler.getVendedorArray());
    }

    // public static void salvarFuncionarios(){
    //     for (Funcionario funcionario : funcionarios) {
    //         if (funcionarios.get(getFuncionarioIndexByCpf(cpf)) instanceof Caixa) {
    //             CaixaHandler.removerCaixa(cpf);
    //         }
    //         if (funcionarios.get(getFuncionarioIndexByCpf(cpf)) instanceof Vendedor) {
    //             VendedorHandler.removerVendedor(cpf);
    //         }
    //         if (funcionarios.get(getFuncionarioIndexByCpf(cpf)) instanceof Auditor) {
    //             AuditorHandler.removerAuditor(cpf);
    //         }
    //     }
    // }

    public static boolean demitirFuncionarios(String cpf){
        if (funcionarios.get(getFuncionarioIndexByCpf(cpf)) != null){
            if (funcionarios.get(getFuncionarioIndexByCpf(cpf)) instanceof Caixa) {
                CaixaHandler.removerCaixa(cpf);
            }
            if (funcionarios.get(getFuncionarioIndexByCpf(cpf)) instanceof Vendedor) {
                VendedorHandler.removerVendedor(cpf);
            }
            if (funcionarios.get(getFuncionarioIndexByCpf(cpf)) instanceof Auditor) {
                AuditorHandler.removerAuditor(cpf);
            }
            funcionarios.remove(getFuncionarioIndexByCpf(cpf));
            return true;
        }
        return false;
    }

    public static int getFuncionarioIndexByCpf(String cpf){
        for (int i = 0; i < funcionarios.size(); i++) {
            if(funcionarios.get(i).getCpf().equals(cpf)){
                return i;
            }
        }
        return -1;
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

    public static boolean contratarFuncionario(String tipo, String nome, String cpf, String salario) {
        try {
            switch (tipo) {
                case "Auditor":
                    Auditor auditor_contratado = new Auditor(nome, cpf, Double.parseDouble(salario));
                    funcionarios.add(auditor_contratado);
                    AuditorHandler.cadastrarAuditor(auditor_contratado);
                    break;
                
                case "Caixa":
                    Caixa caixa_ontratado = new Caixa(nome, cpf, Double.parseDouble(salario));
                    funcionarios.add(caixa_ontratado);
                    CaixaHandler.cadastrarCaixa(caixa_ontratado);
                    break;
                case "Vendedor":
                    Vendedor vendedor_contratado = new Vendedor(nome, cpf, Double.parseDouble(salario), 0.0);
                    funcionarios.add(vendedor_contratado);
                    VendedorHandler.cadastrarVendedor(vendedor_contratado);
                    break;
            
                default:
                    break;
            }
            return true;
        } catch (Exception e) {
            //TODO: handle exception
            return false;
        }
    }
}