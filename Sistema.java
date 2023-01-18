package br.com.oo.composicao.SistemaVendas;

public class Sistema {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Everton");

        Compra c1 = new Compra();
        c1.adicionarItem("Caneta", 1.99, 100);
        c1.adicionarItem("Caderno", 15, 5);

        Compra c2 = new Compra();
        c2.adicionarItem("Agenda", 12.99, 1);
        c2.adicionarItem("Impressora", 899.90, 2);

        cliente.compras.add(c1);
        cliente.compras.add(c2);

        System.out.println(cliente.obterValorTotal());

    }
}
