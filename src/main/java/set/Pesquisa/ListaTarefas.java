package main.java.set.Pesquisa;

import main.java.list.OperacoesBasicas.ListaDeTarefas.ListaTarefa;

import java.util.HashSet;
import java.util.Set;

public  class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        tarefaSet = new HashSet<>();
    }


    public void adicionarTarefa(String descricao, boolean concluido) {
        tarefaSet.add(new Tarefa(descricao, concluido));
    }

    public void removerTarefa(String descricao) {
        if (tarefaSet.isEmpty()) {
            throw new IllegalStateException("Lista vazia!");
        }
        boolean tarefaRemover = tarefaSet.removeIf(
                t -> t.getDescricao().equalsIgnoreCase(descricao));

        if (tarefaRemover) {
            System.out.println("Tarefa removida com sucesso!!");
        } else {
            System.out.println("Tarefa não localizada!!");
        }
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        if (tarefaSet.isEmpty()) {
            throw new IllegalStateException("Lista vazia!");
        }
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (t.isConcluida()){
                tarefasConcluidas.add(t);
            }
        }
            return tarefasConcluidas;
    }

    public  Set<Tarefa> obterTarefasPendentes() {
        if (tarefaSet.isEmpty()) {
            throw new IllegalStateException("Lista vazia!");
        }
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (!t.isConcluida()){
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        if (tarefaSet.isEmpty()) {
            throw new IllegalStateException("Lista vazia!");
        }
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluido(true);
            }
        }
        System.out.println("Tarefa não encontrada!");
    }

    public void marcarTarefaPendente(String descricao) {
        if (tarefaSet.isEmpty()) {
            throw new IllegalStateException("Lista vazia!");
        }
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluido(false);
            }
        }
        System.out.println("Tarefa não encontrada!");
    }

    public int contarTarefas() {
       return tarefaSet.size();
    }

    public void exibirTarefas() {
        System.out.println(tarefaSet);
    }

    public void limparListaTarefas() {
        tarefaSet.clear();
    }

    public static void main(String[] args) {
        System.out.println("Hello");

        ListaTarefas listTarefa = new ListaTarefas();
        listTarefa.adicionarTarefa("Estudar Java", true);
        listTarefa.adicionarTarefa("Aprender JavaScript", true);
        listTarefa.adicionarTarefa("Estudar Html", true);
        listTarefa.adicionarTarefa("Estudar CSS", true);
        listTarefa.exibirTarefas();

        listTarefa.removerTarefa("Comer java");
        System.out.println("--------------------");
        listTarefa.marcarTarefaConcluida("Estudar Java");

        listTarefa.exibirTarefas();
        System.out.println("--------------------");

        listTarefa.marcarTarefaPendente("Estudar CSS");
        System.out.println("******************");
        System.out.println("TOTAL DE TAREFAS: " + listTarefa.contarTarefas());
        System.out.println("\nConcluidas: " +listTarefa.obterTarefasConcluidas());
        System.out.println("Pendentes: " +listTarefa.obterTarefasPendentes());
        listTarefa.limparListaTarefas();




        listTarefa.exibirTarefas();
    }

}


//marcarTarefaPendente(String descricao): Marca uma tarefa como pendente de acordo com a descrição.
