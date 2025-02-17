package model;

public class Livro {
    private String titulo;
    private String autor;
    private String genero;
    private String dataDePublicacao;
    private String sinopse;
    private int numeroDePaginas;
    private String editora;
    private String ISBN;
    private String premiacoes;
    private String recepcaoCritica;
    private String capa;

    // Construtor
    public Livro(String titulo, String autor, String genero, String dataDePublicacao, String sinopse,
                 int numeroDePaginas, String editora, String ISBN, String premiacoes, String recepcaoCritica, String capa) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.dataDePublicacao = dataDePublicacao;
        this.sinopse = sinopse;
        this.numeroDePaginas = numeroDePaginas;
        this.editora = editora;
        this.ISBN = ISBN;
        this.premiacoes = premiacoes;
        this.recepcaoCritica = recepcaoCritica;
        this.capa = capa;
    }

    // Getters e Setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public String getDataDePublicacao() { return dataDePublicacao; }
    public void setDataDePublicacao(String dataDePublicacao) { this.dataDePublicacao = dataDePublicacao; }

    public String getSinopse() { return sinopse; }
    public void setSinopse(String sinopse) { this.sinopse = sinopse; }

    public int getNumeroDePaginas() { return numeroDePaginas; }
    public void setNumeroDePaginas(int numeroDePaginas) { this.numeroDePaginas = numeroDePaginas; }

    public String getEditora() { return editora; }
    public void setEditora(String editora) { this.editora = editora; }

    public String getISBN() { return ISBN; }
    public void setISBN(String ISBN) { this.ISBN = ISBN; }

    public String getPremiacoes() { return premiacoes; }
    public void setPremiacoes(String premiacoes) { this.premiacoes = premiacoes; }

    public String getRecepcaoCritica() { return recepcaoCritica; }
    public void setRecepcaoCritica(String recepcaoCritica) { this.recepcaoCritica = recepcaoCritica; }

    public String getCapa() { return capa; }
    public void setCapa(String capa) { this.capa = capa; }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", genero='" + genero + '\'' +
                ", dataDePublicacao='" + dataDePublicacao + '\'' +
                ", sinopse='" + sinopse + '\'' +
                ", numeroDePaginas=" + numeroDePaginas +
                ", editora='" + editora + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", premiacoes='" + premiacoes + '\'' +
                ", recepcaoCritica='" + recepcaoCritica + '\'' +
                ", capa='" + capa + '\'' +
                '}';
    }

    private String emprestarLivro(Livro livro, Pessoa pessoa) {
        Biblioteca unicaBiblioteca = Biblioteca.getInstanciaDaBiblioteca();
        String mensagemResposta;

        if (unicaBiblioteca.getEmprestimosDeLivros().contains(livro)) {
            mensagemResposta = "Livro " + livro.getTitulo() + " não está disponível para ser emprestado.";
        } else {
            unicaBiblioteca.getEmprestimosDeLivros().add(livro);

            if (pessoa instanceof Cliente) {
                ((Cliente) pessoa).adicionarLivro(livro);
                mensagemResposta = "Livro " + livro.getTitulo() + " emprestado para o cliente " + pessoa.getNome() + ".";
            } else if (pessoa instanceof Gerente) {
                ((Gerente) pessoa).adicionarLivro(livro);
                mensagemResposta = "Livro " + livro.getTitulo() + " emprestado para o gerente " + pessoa.getNome() + ".";
            } else if (pessoa instanceof Funcionario) {
                ((Funcionario) pessoa).adicionarLivro(livro);
                mensagemResposta = "Livro " + livro.getTitulo() + " emprestado para o funcionário " + pessoa.getNome() + ".";
            } else {
                mensagemResposta = "Tipo de pessoa desconhecido.";
            }
        }

        return mensagemResposta;
    }
 
    
    
}
