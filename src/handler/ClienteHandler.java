package handler;

import java.util.ArrayList;
import Classes.Cliente;
import Classes.Produto;

public class ClienteHandler {
    private static final String file_name = "cliente";
    private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    
    public void addCart(int index, Produto produto){
        clientes.get(index).getCarrinho().add(produto);
    }

    public static int getClienteByLogin(String login){
        carregarCliente();
        for (int i = 0; i < clientes.size(); i++) {
            if(clientes.get(i).getNome().equals(login)){
                return i;
            }
        }
        return -1;
    }

    public static Cliente getCliente(int index){
        return clientes.get(index);
    }

    public static void printaClientes(){
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(clientes.get(i).toString());
        }
    }

    public static void carregarCliente(){
        ArrayList<String> lines = FileHandler.readFile(file_name);
        toArrayList(lines);
    }

    public static void salvarCliente(){
        ArrayList<String> lines = toArrayList();
        FileHandler.writeFile(file_name, lines);
    }

    private static void toArrayList(ArrayList<String> lines){
        // if(produtos.size() != 0){
        // }
        for (int i = 0; i < lines.size(); i+= 4){
            clientes.add(new Cliente(lines.get(i), lines.get(i + 1), lines.get(i + 2), Double.parseDouble(lines.get(i + 3))));
        }
    }

    private static ArrayList<String> toArrayList(){
        ArrayList<String> lines = new ArrayList<String>();
        for (int i = 0; i < clientes.size(); i++) {
            lines.addAll(clientes.get(i).toArrayList());
        }
        return lines;
    }
}
