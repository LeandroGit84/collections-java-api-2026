package main.java.map.OperacoesBasicas.SomaNumero;

public class Numeros {
    //atributos
    private final int numero;

    public Numeros(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Numeros{" +
                numero +
                '}';
    }
}

