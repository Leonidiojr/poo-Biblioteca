package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Gerente extends Funcionario {
    
    private List<Funcionario> subordinados;

    public Gerente(String nome, String sobrenome, Date dataDeNascimento, String numeroDeIdentidade,
                   String telefone, String email, String cargo, double salario, Date dataDeAdmissao,
                   List<Funcionario> subordinados) {
        super(nome, sobrenome, dataDeNascimento, numeroDeIdentidade, telefone, email, cargo, salario, dataDeAdmissao);
        this.subordinados = subordinados;
    }

    // Getters e Setters
    public List<Funcionario> getSubordinados() { return subordinados; }
    public void setSubordinados(List<Funcionario> subordinados) { this.subordinados = subordinados; }
    
    private List<Livro> livrosEmprestados = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livrosEmprestados.add(livro);
    }

    public void removerLivro(Livro livro) {
        livrosEmprestados.remove(livro);
    
    }
    
    @Override
    public String toString() {
        return "Gerente{" +
                "subordinados=" + subordinados +
                "} " + super.toString();
    }
}
