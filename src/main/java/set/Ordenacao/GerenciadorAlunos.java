package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double nota) {
        alunoSet.add(new Aluno(nome, matricula, nota));
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
       return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new Aluno.ComparatorPorNota());
        alunosPorNota.addAll(alunoSet);
        return alunosPorNota;
    }

    public void exibirAlunos() {
        System.out.println(alunoSet);
    }


    public static void main(String[] args) {
        System.out.println("Hello!");

        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
        gerenciadorAlunos.adicionarAluno("leo", 105160, 10d);
        gerenciadorAlunos.adicionarAluno("mara", 105160, 5d);
        gerenciadorAlunos.adicionarAluno("ruth", 105162, 9d);
        gerenciadorAlunos.adicionarAluno("pablo", 1051603, 7d);

        gerenciadorAlunos.exibirAlunos();
        System.out.println("=======Por Nome=========");
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println("=======Por Nota=========");
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
    }
}


