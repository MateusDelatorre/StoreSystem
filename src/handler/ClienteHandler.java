package handler;

import java.util.ArrayList;
import Classes.Cliente;
import Classes.Produto;

public class ClienteHandler {
    private static final String file_name = "cliente";
    private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    
    public static void addCart(int index, Produto produto, int quantidade){
        Produto pro = new Produto(produto);
        pro.setquantidade_em_estoque(quantidade);
        clientes.get(index).getCarrinho().add(pro);
    }

    public static Boolean checarCliente(String NomeDoCliente){
        Cliente cliente = clientes.get(getClienteByLogin(NomeDoCliente));
        if(checarProdutoDoCliente(cliente)){
            if(receberProduto(cliente)){
                cliente.setChekado(true);
            }
        }
        return false;
    }

    private static Boolean checarProdutoDoCliente(Cliente cliente){
        for(Produto currentProduto: cliente.getCarrinho() ) {
            return ProdutoHandler.checarDisponibilidade(currentProduto.getCodigo(), currentProduto.getquantidade_em_estoque());
        }
        return false;
    }

    private static Boolean receberProduto(Cliente cliente){
        for(Produto currentProduto: cliente.getCarrinho() ) {
            return ProdutoHandler.perderProduto(currentProduto.getCodigo(), currentProduto.getquantidade_em_estoque());
        }
        return false;
    }

    public static int getClienteByLogin(String login){
        for (int i = 0; i < clientes.size(); i++) {
            if(clientes.get(i).getNome().equals(login)){
                return i;
            }
        }
        return -1;
    }

    public static String[][] getClientesWithCart(){
        ArrayList<Cliente> clientes_com_compras = new ArrayList<Cliente>();
        for (int i = 0; i < clientes.size(); i++) {
            if(clientes.get(i).getCarrinho() != null){
                clientes_com_compras.add(clientes.get(i));
            }
        }
        return toArray(clientes_com_compras);
    }

    public static String[][] getClientesChekados(){
        ArrayList<Cliente> clientes_chekados = new ArrayList<Cliente>();
        for (int i = 0; i < clientes.size(); i++) {
            if(clientes.get(i).getChekado() == true){
                clientes_chekados.add(clientes.get(i));
            }
        }
        return toArray(clientes_chekados);
    }

    public static String[][] toArray(ArrayList<Cliente> clientes){
        String[][] data = new String[clientes.size()][];
        for (int i = 0; i < clientes.size(); i++) {
            ArrayList<String> row = clientes.get(i).toArrayList();
            data[i] = row.toArray(new String[row.size()]);
        }
        return data;
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

    public static void cadastrarCliente(String name, String cpf, String senioriade){
        clientes.add(new Cliente(name, cpf, senioriade, 0.0));
    }
}
