package handler;

import java.util.ArrayList;
import Classes.Produto;

/** 
* This class handler all the produtos methods
*/

public final class ProdutoHandler {

    private static final String file_name = "produtos";
    private static ArrayList<Produto> produtos = new ArrayList<Produto>();
    
    private ProdutoHandler(){

    }

    public static Boolean perderProduto(int codigo, int quantidade) {
        Produto produto = getProdutoByCodigo(codigo);
        if (produto != null){
            if(produto.getquantidade_em_estoque() >= quantidade){
                produto.setquantidade_em_estoque(produto.getquantidade_em_estoque() - quantidade);
                return true;
            }
        }
        return false;
    }

    public static Boolean checarDisponibilidade(int codigo, int quantidade){
        Produto produto = getProdutoByCodigo(codigo);
        if (produto != null){
            if(produto.getquantidade_em_estoque() >= quantidade){
                return true;
            }
        }
        return false;
    }

    public static int isProduto(int index){
        try {
            if(produtos.get(index) != null){
                return index;
            }
        } catch (Exception e) {
            //TODO: handle exception
            return -1;
        }
        return -1;
    }

    /** 
    * return a produto
    */
    public static Produto getProdutoByCodigo(int codigo){
        for (int i = 0; i < produtos.size(); i++) {
            if(produtos.get(i).getCodigo() == codigo){
                return produtos.get(i);
            }
        }
        return null;
    }

    public static int getSize(){
        return produtos.size();
    }

    public static String[][] toArray(){
        String[][] data = new String[produtos.size()][];
        for (int i = 0; i < produtos.size(); i++) {
            ArrayList<String> row = produtos.get(i).toArrayList();
            data[i] = row.toArray(new String[row.size()]);
        }
        return data;
    }

    public static void printaProdutos(){
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println(produtos.get(i).toString());
        }
    }

    public static void carregarProduto(){
        ArrayList<String> lines = FileHandler.readFile(file_name);
        toArrayList(lines);
    }

    public static void salvarProdutos(){
        ArrayList<String> lines = toArrayList();
        FileHandler.writeFile(file_name, lines);
    }

    public static int reporProduto(int codigo, int quantidade){
        var produto = getProdutoByCodigo(codigo);
        if(produto != null){
            produto.setquantidade_em_estoque(produto.getquantidade_em_estoque() + quantidade);
            return 1;
        }
        return 0;
    }

    private static void toArrayList(ArrayList<String> lines){
        // if(produtos.size() != 0){
        // }
        for (int i = 0; i < lines.size(); i+= 7){
            produtos.add(new Produto(Integer.parseInt(lines.get(i)), lines.get(i + 1), lines.get(i + 2), lines.get(i + 3), Double.parseDouble(lines.get(i + 4)), Double.parseDouble(lines.get(i + 5)), Integer.parseInt(lines.get(i + 6))));
        }
    }

    private static ArrayList<String> toArrayList(){
        ArrayList<String> lines = new ArrayList<String>();
        for (int i = 0; i < produtos.size(); i++) {
            lines.addAll(produtos.get(i).toArrayList());
        }
        return lines;
    }
    public static String[][] getData() {
        return toArray();
    }
}