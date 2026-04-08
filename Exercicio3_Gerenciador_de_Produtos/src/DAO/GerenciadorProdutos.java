package DAO;

import DTO.Produto;
import java.util.ArrayList;

public class GerenciadorProdutos {
    ArrayList<Produto> Lista = new ArrayList<>();
    
    public void adicionarProduto(Produto p){
        Lista.add(p);
    }
    
    public String listarProdutos() {
        String resultado = "";

        for (Produto p : Lista) {
            resultado += "Nome: " + p.getNome() +
                         "\nPreço: " + p.getPreco() +
                         "\nQuantidade: " + p.getQuantidade() +
                         "\n----------------------\n";
        }
        return resultado;
    }
}
