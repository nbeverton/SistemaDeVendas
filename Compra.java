package br.com.oo.composicao.SistemaVendas;

import java.util.ArrayList;

public class Compra {
    final ArrayList<Item> itens = new ArrayList<>();

    void adicionarItem(String nome, double preco, int qtde){
        var produto = new Produto(preco, nome);
        this.itens.add(new Item(produto, qtde));
    }

    double obterValorTotal(){
        double total = 0;

        for (Item item: itens){
            total += item.quantidade * item.produto.preco;
        }
        return total;
    }
}
