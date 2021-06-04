package handler;

import java.util.ArrayList;
import Classes.Produto;

public class ProdutoHandler {

    ArrayList<String> lines = new ArrayList<String>();
    ArrayList<Produto> produtos = new ArrayList<Produto>();
    
    public ProdutoHandler(){

    }

    public void carregarProduto(){
        FileHandler.readFile("produtos");
    }

}
