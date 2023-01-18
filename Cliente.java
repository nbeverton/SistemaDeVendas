package br.com.oo.composicao.SistemaVendas;

import java.util.ArrayList;

public class Cliente {

    final ArrayList<Compra> compras = new ArrayList<>();
    final    String nome;

    Cliente(String nome){
        this.nome = nome;
    }

    double obterValorTotal(){
        double total = 0;
        for (Compra compra: compras){
            total = compra.obterValorTotal();
        }
        return total;

    }

}
