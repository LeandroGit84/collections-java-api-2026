package main.java.set.Pesquisa;

public class Tarefa {

    private String descricao;
    private boolean concluido;

    public Tarefa(String descricao, boolean concluido) {
        this.descricao = descricao;
        this.concluido = concluido;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setBoleano(boolean concluido) {
        this.concluido = concluido;
    }

    @Override
    public String toString() {
        return "\nTarefa{" +
                descricao + '\'' +
                concluido +
                '}';
    }

    public boolean isConcluida() {
        return concluido;
    }


    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

}
