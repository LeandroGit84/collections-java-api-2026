package main.java.list.OperacoesBasicas.Carrinho;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item>  itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome,preco,quantidade);
        this.itemList.add(item);

    }

    public void removerItem(String nome) {
        List<Item> itemsParaRemover = new ArrayList<>();
        for (Item i : itemList) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itemsParaRemover.add(i);
            }
        }
        itemList.removeAll(itemsParaRemover);
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;

            for (Item item : itemList) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal = valorTotal + valorItem;
            }
            return valorTotal;
    }

    public void exibirItens() {
        if (!itemList.isEmpty()) {
            System.out.println(this.itemList);

        }else {
            System.out.println("A lista está vazia!");
        }
    }



    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.exibirItens();
        System.out.println("=======================");
        carrinho.adicionarItem("mesa", 2d, 10);
//        carrinho.adicionarItem("cadeira", 2d, 10);
//        carrinho.adicionarItem("tampo", 2d, 10);
//        carrinho.adicionarItem("tampo", 2d, 10);
//        carrinho.adicionarItem("tampo", 2d, 10);
//        carrinho.adicionarItem("tampo", 2d, 10);
        carrinho.exibirItens();
//        System.out.println("=======================");

        //carrinho.removerItem("cadeira");
        //carrinho.exibirItens();
        System.out.printf("Valor total da compra é de : %s" , carrinho.calcularValorTotal());

    }


}
