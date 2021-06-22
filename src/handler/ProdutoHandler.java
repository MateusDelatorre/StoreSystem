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
    /** 
    * return a produto
    */
    public static Produto getproduto(int index){
        return produtos.get(index);
    }

    public static void printaProdutos(){
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println(produtos.get(i).toString());
        }
    }

    public static void carregarProduto(){
        ArrayList<String> lines = FileHandler.readFile(file_name);
        toArrayProduto(lines);
    }

    public static void salvarProdutos(){
        ArrayList<String> lines = toArrayString();
        FileHandler.writeFile(file_name, lines);
    }

    private static void toArrayProduto(ArrayList<String> lines){
        // if(produtos.size() != 0){
        // }
        for (int i = 0; i < lines.size(); i+= 7){
            produtos.add(new Produto(Integer.parseInt(lines.get(i)), lines.get(i + 1), lines.get(i + 2), lines.get(i + 3), Double.parseDouble(lines.get(i + 4)), Double.parseDouble(lines.get(i + 5)), Integer.parseInt(lines.get(i + 6))));
        }
    }

    private static ArrayList<String> toArrayString(){
        ArrayList<String> lines = new ArrayList<String>();
        for (int i = 0; i < produtos.size(); i++) {
            lines.addAll(produtos.get(i).toArrayList());
        }
        return lines;
    }
}