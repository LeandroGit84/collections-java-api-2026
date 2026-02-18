package main.java.set.OperacoesBasicas.ConjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributo

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

   public void adicionarConvidado(String nome, int codConvite) {
       convidadoSet.add(new Convidado(nome, codConvite));
    }

    public void exibirConvidados() {
        System.out.println("Lista de convdados:\n" + convidadoSet);
    }

    public void contarConvidados() {
        System.out.println("Total de convidados é: " + convidadoSet.size());
    }
    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        if (convidadoSet.isEmpty()) {
            throw new IllegalStateException("Lista vazia!");
        }
        Convidado removerPorCod = null;

        for (Convidado c : convidadoSet) {
            if (c.getCodConvite() == codigoConvite) {
                removerPorCod = c;
                break;
            }
        }
        convidadoSet.remove(removerPorCod);
    }



    public  static void main(String[] args) {
        System.out.println("Hello Word!!");
        System.out.println("==========");
        ConjuntoConvidados convidado = new ConjuntoConvidados();
        convidado.adicionarConvidado("Convidado2", 2 );

        convidado.adicionarConvidado("Convidado1", 1 );
        convidado.adicionarConvidado("Convidado3", 3 );
        convidado.adicionarConvidado("Convidado4", 4 );
        convidado.adicionarConvidado("Convidado5", 5 );
        convidado.adicionarConvidado("Convidado5", 5 );
        convidado.adicionarConvidado("Convidado5", 5 );
        convidado.adicionarConvidado("Convidado5", 5 );
        convidado.exibirConvidados();
        convidado.contarConvidados();
        System.out.println("==========");
        convidado.removerConvidadoPorCodigoConvite(5);
        convidado.exibirConvidados();





    }




}
