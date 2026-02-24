package main.java.set.OperacoesBasicas.ConjuntoPalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    //atributos

   private Set<ConjuntoPalavras> palavrasUnicasSet;


   public ConjuntoPalavrasUnicas() {
       this.palavrasUnicasSet = new HashSet<>();
   }

    public void adicionarPalavra(String palavra) {
        palavrasUnicasSet.add(new ConjuntoPalavras(palavra));
    }

    public void removerPalavra(String palavra) {
       if (palavrasUnicasSet.isEmpty()) {
           throw new IllegalStateException("Lista Vazia!!!");
       }
       boolean removerPalavras = palavrasUnicasSet.removeIf(
               p -> p.getPalavras().equalsIgnoreCase(palavra)
       );
           if (removerPalavras) {
               System.out.println("Palavras removida? " + removerPalavras);
           } else {
               System.out.println("Palavras não encontrada!" );
           }
         //  System.out.println("Palavras removida? " + removerPalavras);

    }

    public void exibirPalavrasUnicas() {
        System.out.println("palavras: " + palavrasUnicasSet);
    }

   public static void main(String[] args) {

       ConjuntoPalavrasUnicas palavrasSet = new ConjuntoPalavrasUnicas();
       palavrasSet.adicionarPalavra("Cabelo pintado na cor ruivo");
       palavrasSet.adicionarPalavra("Cabelo do tipo liso");
       palavrasSet.adicionarPalavra("O tipo crespo de cabelo");
       palavrasSet.adicionarPalavra("Cada cabelo tem um jeito de trabalhar nele");
       palavrasSet.exibirPalavrasUnicas();

       palavrasSet.removerPalavra("Cada cabelo tem um jeito de trabalhar nele");
       palavrasSet.exibirPalavrasUnicas();

    }
}


