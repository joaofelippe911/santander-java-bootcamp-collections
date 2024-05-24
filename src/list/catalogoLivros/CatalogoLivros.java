package list.catalogoLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> listaLivros;

    public CatalogoLivros() {
        this.listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int ano) {
        Livro livro = new Livro(titulo, autor, ano);
        listaLivros.add(livro);
    }

    public List<Livro> pesquisarAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();

        if(!listaLivros.isEmpty()) {
            for (Livro livro : listaLivros) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(livro);
                }
            }
        }

        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livros = new ArrayList<>();

        if(!listaLivros.isEmpty()) {
            for (Livro livro : listaLivros) {
                if (anoInicial <= livro.getAnoPublicacao() && livro.getAnoPublicacao() <= anoFinal) {
                    livros.add(livro);
                }
            }
        }

        return livros;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livro = null;

        if(!listaLivros.isEmpty()) {
            for (Livro l : listaLivros) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livro = l;
                    break;
                }
            }
        }

        return livro;
    }
}
