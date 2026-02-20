package main.java.set.OperacoesBasicas.ConjuntoPalavrasUnicas;

import java.util.Objects;

public class ConjuntoPalavras {
    private String palavras;


    public ConjuntoPalavras(String palavras) {
        this.palavras = palavras;
    }

    public String getPalavras() {
        return palavras;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof ConjuntoPalavras that)) return false;
        return Objects.equals(palavras, that.palavras);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(palavras);
    }

    @Override
    public String toString() {
        return "\nConjuntoPalavras {" +
                palavras + '\'' +
                '}';
    }


}
