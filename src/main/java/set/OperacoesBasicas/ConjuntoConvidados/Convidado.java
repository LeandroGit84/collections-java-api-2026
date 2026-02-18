package main.java.set.OperacoesBasicas.ConjuntoConvidados;

import java.util.Objects;

public class Convidado {
    //atributos

    private  String nome;
    private int codConvite;

    public Convidado(String nome, int codConvite) {
        this.nome = nome;
        this.codConvite = codConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodConvite() {
        return codConvite;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodConvite(int codConvite) {
        this.codConvite = codConvite;
    }

    @Override
    public String toString() {
        return "Convidado{" + nome + '\'' +
                ", codConvite=" + codConvite +
                '}' + "\n";
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Convidado convidado)) return false;
        return codConvite == convidado.codConvite;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codConvite);
    }
}
