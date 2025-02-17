package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Pessoa {
    private String nome;
    private String sobrenome;
    private Date dataDeNascimento;
    private String numeroDeIdentidade;
    private String telefone;
    private String email;
    private List<Livro> livrosEmprestados;

    // Construtor
    public Pessoa(String nome, String sobrenome, Date dataDeNascimento, String numeroDeIdentidade, String telefone, String email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataDeNascimento = dataDeNascimento;
        this.numeroDeIdentidade = numeroDeIdentidade;
        this.telefone = telefone;
        this.email = email;
        this.livrosEmprestados = new ArrayList<>();
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getSobrenome() { return sobrenome; }
    public void setSobrenome(String sobrenome) { this.sobrenome = sobrenome; }

    public Date getDataDeNascimento() { return dataDeNascimento; }
    public void setDataDeNascimento(Date dataDeNascimento) { this.dataDeNascimento = dataDeNascimento; }

    public String getNumeroDeIdentidade() { return numeroDeIdentidade; }
    public void setNumeroDeIdentidade(String numeroDeIdentidade) { this.numeroDeIdentidade = numeroDeIdentidade; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public List<Livro> getLivrosEmprestados() { return livrosEmprestados; }
    public void setLivrosEmprestados(List<Livro> livrosEmprestados) { this.livrosEmprestados = livrosEmprestados; }


    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                ", numeroDeIdentidade='" + numeroDeIdentidade + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
