package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class CatalogoLivros {
    //atributo
    private  List<Livro> livroList;
//contructor

    public CatalogoLivros () {
        this.livroList =  new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));

    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livroPorAutor =  new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livroPorAutor.add(l);
                }
            }
        }
        return livroPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervalosAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervalosAnos.add(l);
                }
            }
        }
        return livrosPorIntervalosAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if(l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        } else {
            System.out.println("Catalogo de Livros está vazia!");
        }
        return livroPorTitulo;
    }

   public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();
        catalogo.adicionarLivro("Livro1", "Autor1", 2020);
        catalogo.adicionarLivro("Livro1", "Autor2", 2021);
        catalogo.adicionarLivro("Livro2", "Autor2", 2022);
        catalogo.adicionarLivro("Livro3", "Autor3", 2023);
        catalogo.adicionarLivro("Livro4", "Autor4", 2024);
        catalogo.adicionarLivro("Livro5", "Autor5", 1993);

       //System.out.println(catalogo.pesquisarPorAutor("Autor1"));
       System.out.println("====================================");
       System.out.println(catalogo.pesquisarPorIntervaloAnos(2020, 2025));
       System.out.println("====================================");

      //System.out.println(catalogo.pesquisarPorAutor("Autor3"));




    }


}
