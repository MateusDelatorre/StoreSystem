package handler;

import java.util.ArrayList;
import Classes.Produto;

public class ProdutoHandler {

    static ArrayList<String> lines = new ArrayList<String>();
    static ArrayList<Produto> produtos = new ArrayList<Produto>();
    
    private ProdutoHandler(){

    }

    public void carregarProduto(){
        FileHandler.readFile("produtos");
    }

    public static void toArrayString(){
        for (int i = 0; i < produtos.size(); i++) {
            
        }
    }

}