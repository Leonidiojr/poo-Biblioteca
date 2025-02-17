package model;

public interface EmprestimoLivro {
    String emprestaLivro(Livro livro, Pessoa pessoa);
    String devolveLivro(Livro livro, Pessoa pessoa);
}
