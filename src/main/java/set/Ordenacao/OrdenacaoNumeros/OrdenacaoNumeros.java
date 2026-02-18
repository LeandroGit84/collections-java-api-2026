package main.java.set.Ordenacao.OrdenacaoNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Numero> listNumeros;

    public OrdenacaoNumeros() {
        this.listNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listNumeros.add(new Numero(numero));

    }

    public List<Numero> ordenarAscendente() {
        if (listNumeros.isEmpty()) {
            throw new IllegalStateException("Lista vazia");
        }
    List<Numero> lisCrescente = new ArrayList<>(listNumeros);
        Collections.sort(lisCrescente);
        return lisCrescente;
    }

    public List<Numero> ordenarDescendente() {
        if (listNumeros.isEmpty()) {
            throw new IllegalStateException("Lista vazia");
        }
        List<Numero> lisDecrescente = new ArrayList<>(listNumeros);
       lisDecrescente.sort(Comparator.comparing(Numero::getNumero).reversed());
        return lisDecrescente;
    }

    public void exibirNumero() {
        if (listNumeros.isEmpty()) {
            throw new IllegalStateException("Lista vazia");
        }

        System.out.println("Lista: " + listNumeros);
    }

   public static void main(String[] args) {
       OrdenacaoNumeros  ordenacaoNumeros = new OrdenacaoNumeros();
        System.out.println("Ola");

        ordenacaoNumeros.adicionarNumero(8);
        ordenacaoNumeros.adicionarNumero(38);
        ordenacaoNumeros.adicionarNumero(25);
        ordenacaoNumeros.adicionarNumero(19);
        ordenacaoNumeros.adicionarNumero(67);
        ordenacaoNumeros.exibirNumero();
       System.out.println("==========================");
        System.out.println("Lista: " + ordenacaoNumeros.ordenarAscendente());
        System.out.println("==========================");
        System.out.println("Lista: " + ordenacaoNumeros.ordenarDescendente());

    }






}