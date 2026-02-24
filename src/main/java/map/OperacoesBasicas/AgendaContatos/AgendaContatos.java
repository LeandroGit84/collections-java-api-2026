package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (agendaContatoMap.isEmpty()) {
            throw new IllegalStateException("Lista Map vazia!");
        }
        agendaContatoMap.remove(nome);
    }



    public Integer pesquisarPorNome(String nome) {
        Integer telPorNome = null;
        if (agendaContatoMap.isEmpty()) {
            throw new IllegalStateException("Lista Map vazia!");
        }
        telPorNome = agendaContatoMap.getOrDefault(nome, 0);
        return telPorNome;
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public static void main(String[] args) {
        System.out.println("Hello");

        AgendaContatos agendaContatos = new AgendaContatos();
        System.out.println("===Adicionar Contatos=== ");
        agendaContatos.adicionarContato("Camila", 1555);
        agendaContatos.adicionarContato("Camila", 555656544);
        agendaContatos.adicionarContato("Camila Cavalcante", 111111);
        agendaContatos.adicionarContato("Camila DIO", 6455555);
        agendaContatos.adicionarContato("Maria Silva", 111111);
        agendaContatos.adicionarContato("Camila", 44444);

        agendaContatos.exibirContatos();
        System.out.println("===Por Nome==");
        System.out.println("Telefone: " + agendaContatos.pesquisarPorNome("Maria Silva"));
        System.out.println("===Remover Nome==");
        agendaContatos.removerContato("Camila");
        agendaContatos.exibirContatos();

    }
}
