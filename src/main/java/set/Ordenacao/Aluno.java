package main.java.set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
    //atributo
    private String nome;
    private long matrícula;
    private double nota;

    //constructor
    public Aluno(String nome, long matrícula, double nota) {
        this.nome = nome;
        this.matrícula = matrícula;
        this.nota = nota;
    }

    @Override
    public int compareTo(Aluno a) {
        return nome.compareToIgnoreCase(a.getNome());
    }
    //metodos Get
    public String getNome() {
        return nome;
    }
    public long getMatrícula() {
        return matrícula;
    }
    public double getNota() {
        return nota;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Aluno aluno)) return false;
        return matrícula == aluno.matrícula;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matrícula);
    }

    @Override
    public String toString() {
        return "\nAluno{" + nome +
                ", " + matrícula +
                ", " + nota +
                '}';
    }
//metodo Comparator
    static class ComparatorPorNota implements Comparator<Aluno> {

        @Override
        public int compare(Aluno a1, Aluno a2) {
            return Double.compare(a1.getNota(), a2.getNota());
        }
    }


}





