package br.com.oo.composicao.SistemaVendas;

import java.util.ArrayList;

public class Item {

    final Produto produto;
    final int quantidade;

    Item(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }

}
