package main.java.set.OperacoesBasicas.SomaNumero;


import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    //atributos
    private final List<Numeros> lisNumeros;

    public SomaNumeros() {
        this.lisNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        Numeros numeros = new Numeros(numero);
        this.lisNumeros.add(numeros);
    }

    public int calcularSoma() {
        if (!lisNumeros.isEmpty()) {
            int soma = 0;
            for(Numeros d :  lisNumeros) {
            soma = soma + d.getNumero();
            }
            return soma;
        }else{
            throw new RuntimeException("A lista está vazia!");

        }
    }

    public int encontrarMaiorNumero() {

        if (lisNumeros.isEmpty()) {
            throw new IllegalStateException("O set de números está vazio");
        }
        int maiorNumero = lisNumeros.get(0).getNumero();
        for (Numeros numMaior : lisNumeros) {
            if (numMaior.getNumero() > maiorNumero) {
                maiorNumero = numMaior.getNumero() ;
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        if (lisNumeros.isEmpty()) {
            throw new IllegalStateException("O set de números está vazio");
        }
        int menorNumero = lisNumeros.get(0).getNumero();
            for (Numeros numMenor : lisNumeros) {
                if (numMenor.getNumero() < menorNumero) {
                    menorNumero = numMenor.getNumero();
                }
            }
            return menorNumero;
    }

    public void exibirNumeros() {
        if (!lisNumeros. isEmpty()) {
            System.out.println(this.lisNumeros);
        } else {
            System.out.println("A lista de números esta vazia!!");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

       somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(68);
        somaNumeros.adicionarNumero(30);
        somaNumeros.adicionarNumero(25);
        somaNumeros.adicionarNumero(50);
        somaNumeros.exibirNumeros();

        System.out.println("==============");
        System.out.println("A soma dos numeros na lista é : " + somaNumeros.calcularSoma());
        System.out.println("O maior numero na lista é : " + somaNumeros.encontrarMaiorNumero());
        System.out.println("O menor numero na lista é : " + somaNumeros.encontrarMenorNumero());


    }
}


