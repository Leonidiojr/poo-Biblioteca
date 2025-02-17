package model;

import java.util.ArrayList;
import java.util.List;

// Supondo que as classes Livro, Pessoa, Cliente, Gerente e Funcionario estejam definidas

public class EmprestimoLivroAdaptador implements EmprestimoLivro {
    @Override
    public String emprestaLivro(Livro livro, Pessoa pessoa) {        
        if (pessoa instanceof Cliente) {
            return emprestaLivroParaCliente(livro, (Cliente) pessoa);
        } else if (pessoa instanceof Gerente) {
            return emprestaLivroParaGerente(livro, (Gerente) pessoa);
        } else if (pessoa instanceof Funcionario) {
            return emprestaLivroParaFuncionario(livro, (Funcionario) pessoa);
        } else {
            return "Tipo de pessoa desconhecido.";
        }                
    }

    @Override
    public String devolveLivro(Livro livro, Pessoa pessoa) {        
        if (pessoa instanceof Cliente) {
            return devolveLivroDeCliente(livro, (Cliente) pessoa);
        } else if (pessoa instanceof Gerente) {
            return devolveLivroDeGerente(livro, (Gerente) pessoa);
        } else if (pessoa instanceof Funcionario) {
            return devolveLivroDeFuncionario(livro, (Funcionario) pessoa);
        } else {
            return "Tipo de pessoa desconhecido.";
        }
    }

    private String emprestaLivroParaCliente(Livro livro, Cliente cliente) {
        Biblioteca unicaBiblioteca = Biblioteca.getInstanciaDaBiblioteca();
        String mensagemResposta;

        if (unicaBiblioteca.getEmprestimosDeLivros().contains(livro)) {
            mensagemResposta = "Livro " + livro.getTitulo() + " não está disponível para ser emprestado.";
        } else {
            unicaBiblioteca.getEmprestimosDeLivros().add(livro);
            cliente.adicionarLivro(livro);  // Adicionando o livro ao cliente
            mensagemResposta = "Livro " + livro.getTitulo() + " emprestado para " + cliente.getNome() + ".";
        }

        return mensagemResposta;
    }

    private String emprestaLivroParaGerente(Livro livro, Gerente gerente) {
        // Implementação específica para Gerente
        gerente.adicionarLivro(livro);  // Adicionando o livro ao gerente
        return "Emprestando livro " + livro.getTitulo() + " para o gerente " + gerente.getNome() + ".";
    }

    private String emprestaLivroParaFuncionario(Livro livro, Funcionario funcionario) {
        // Implementação específica para Funcionario
        funcionario.adicionarLivro(livro);  // Adicionando o livro ao funcionário
        return "Emprestando livro " + livro.getTitulo() + " para o funcionário " + funcionario.getNome() + ".";
    }

    private String devolveLivroDeCliente(Livro livro, Cliente cliente) {
        // Implementação específica para Cliente
        cliente.removerLivro(livro);  // Removendo o livro do cliente
        return "Devolvendo livro " + livro.getTitulo() + " do cliente " + cliente.getNome() + ".";
    }

    private String devolveLivroDeGerente(Livro livro, Gerente gerente) {
        // Implementação específica para Gerente
        gerente.removerLivro(livro);  // Removendo o livro do gerente
        return "Devolvendo livro " + livro.getTitulo() + " do gerente " + gerente.getNome() + ".";
    }

    private String devolveLivroDeFuncionario(Livro livro, Funcionario funcionario) {
        // Implementação específica para Funcionario
        funcionario.removerLivro(livro);  // Removendo o livro do funcionário
        return "Devolvendo livro " + livro.getTitulo() + " do funcionário " + funcionario.getNome() + ".";
    }
    
}