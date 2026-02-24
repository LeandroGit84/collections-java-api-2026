package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;
    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void  adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
        return produtoPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        System.out.println("HELLO!");
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(1L, "Prod 5", 15d, 5);
        cadastroProdutos.adicionarProduto(2L, "Prod 0", 20d, 10);
        cadastroProdutos.adicionarProduto(1L, "Prod 3", 10d, 2);
        cadastroProdutos.adicionarProduto(19L,"Prod 9", 2d, 2);

        System.out.println(cadastroProdutos.produtoSet);
        System.out.println("Por nome: " + cadastroProdutos.exibirProdutosPorNome());
        System.out.println("Por nome: " + cadastroProdutos.exibirProdutosPorPreco());

    }

}
