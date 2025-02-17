package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente extends Pessoa {
    
    private String numeroDeMembro;
    private Date dataDeAssociacao;
    
    public Cliente(String nome, String sobrenome, Date dataDeNascimento, String numeroDeIdentidade,
                   String telefone, String email, String numeroDeMembro, Date dataDeAssociacao,
                   List<Livro> livrosEmprestados) {
        super(nome, sobrenome, dataDeNascimento, numeroDeIdentidade, telefone, email);
        this.numeroDeMembro = numeroDeMembro;
        this.dataDeAssociacao = dataDeAssociacao;
    }

    // Getters e Setters
    public String getNumeroDeMembro() { return numeroDeMembro; }
    public void setNumeroDeMembro(String numeroDeMembro) { this.numeroDeMembro = numeroDeMembro; }

    public Date getDataDeAssociacao() { return dataDeAssociacao; }
    public void setDataDeAssociacao(Date dataDeAssociacao) { this.dataDeAssociacao = dataDeAssociacao; }

    private List<Livro> livrosEmprestados = new ArrayList<>();

    // Construtor e outros métodos conforme mencionado anteriormente

    public void adicionarLivro(Livro livro) {
        livrosEmprestados.add(livro);
    }

    public void removerLivro(Livro livro) {
        livrosEmprestados.remove(livro);
    }
   
   

    @Override
    public String toString() {
        return "Cliente{" +
                "numeroDeMembro='" + numeroDeMembro + '\'' +
                ", dataDeAssociacao=" + dataDeAssociacao +
                "} " + super.toString();
    }

    
}
