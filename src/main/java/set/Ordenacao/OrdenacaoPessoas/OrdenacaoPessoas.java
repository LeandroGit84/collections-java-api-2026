package main.java.set.Ordenacao.OrdenacaoPessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    //atributo
    private List<Pessoa> pessoaList;


    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }


    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);

        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());

        return pessoasPorAltura;

    }

    public void exibirPessoas() {
        if (!pessoaList.isEmpty()) {
            System.out.println(this.pessoaList);

        }else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordemPessoas = new OrdenacaoPessoas();

        ordemPessoas.adicionarPessoa("Nome 1", 20, 1.56);
        ordemPessoas.adicionarPessoa("Nome 2", 30, 1.50);
        ordemPessoas.adicionarPessoa("Nome 3", 25, 1.70);
        ordemPessoas.adicionarPessoa("Nome 4", 17, 1.56);
        System.out.println("\n---LISTA NATURAL---");
        ordemPessoas.exibirPessoas();

        System.out.println("\n*********ORDEM POR IDADE***********");
        System.out.println(ordemPessoas.ordenarPorIdade());
        System.out.println("\n==========ORDEM POR ALTURA==========");
        System.out.println(ordemPessoas.ordenarPorAltura());

    }




}
