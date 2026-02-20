package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<Contato>();
    }

    public void adiconarContato(String nome, String telefone) {
        contatoSet.add(new Contato(nome, telefone));
    }

    public Set<Contato >pesquisarPorNome(String nome) {
        if (contatoSet.isEmpty()) {
            throw new IllegalStateException("Lista vazia!");
        }
        Set<Contato> contatosPorNome = new HashSet<>();

        for (Contato c : contatoSet) {
            if (c.getNome().toLowerCase().contains("camila")) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, String novoTelefone) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setTelefone(novoTelefone);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;

    }

    public void exibirContato() {
        System.out.println("Agenda: " + contatoSet);
    }

   public static void main(String[] args) {
       System.out.println("HELLO!");
       AgendaContatos agdContato = new AgendaContatos();
       agdContato.adiconarContato("Leo", "0000");
       agdContato.adiconarContato("Bet", "0001");
       agdContato.adiconarContato("Caio", "0002");
       agdContato.adiconarContato("Camila", "0002");
       agdContato.adiconarContato("Cavalcante Camila", "0002");
       agdContato.adiconarContato("Camila Cavalcante", "0002");
       agdContato.exibirContato();
       System.out.println("=======POR NOME=========");
       System.out.println(agdContato.pesquisarPorNome("camila"));
       System.out.println("=======ATUALIZAR TEL=========");
       System.out.println(agdContato.atualizarNumeroContato("bet", "0005"));
       agdContato.exibirContato();

    }



}