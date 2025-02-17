package model;

public class EmprestimoLivroAdaptador implements EmprestimoLivro {
    @Override
    public String emprestaLivro(Livro livro, Pessoa pessoa) {        
        if (pessoa instanceof Cliente) {
            emprestaLivroParaCliente(livro, (Cliente) pessoa);
            return "Empréstimo";
        } else if (pessoa instanceof Gerente) {
            emprestaLivroParaGerente(livro, (Gerente) pessoa);
            return "Empréstimo";
        } else if (pessoa instanceof Funcionario) {
            emprestaLivroParaFuncionario(livro, (Funcionario) pessoa);
            return "Empréstimo";
        } else {
            return "Tipo de pessoa desconhecido.";
        }                
    }

    @Override
    public String devolveLivro(Livro livro, Pessoa pessoa) {        
        if (pessoa instanceof Cliente) {
            devolveLivroDeCliente(livro, (Cliente) pessoa);
            return "Devolução";
        } else if (pessoa instanceof Gerente) {
            devolveLivroDeGerente(livro, (Gerente) pessoa);
            return "Devolução";
        } else if (pessoa instanceof Funcionario) {
            devolveLivroDeFuncionario(livro, (Funcionario) pessoa);
            return "Devolução";
        } else {
            return "Tipo de pessoa desconhecido.";
        }
    }

    private String emprestaLivroParaCliente(Livro livro, Cliente cliente) {
        
        Biblioteca unicaBiblioteca = Biblioteca.getInstanciaDaBiblioteca();
        String messagemResposta = "";

        if (cliente == null || !(cliente instanceof Cliente)) {
            return "Empréstimos são permitidos apenas para clientes.";
        }

        if (unicaBiblioteca.getEmprestimosDeLivros().contains(livro)) {
            messagemResposta = "Livro " + livro.getTitulo() + " não está disponível para ser emprestado.";
        } else {
            unicaBiblioteca.getEmprestimosDeLivros().add(livro);
            messagemResposta = "Livro " + livro.getTitulo() + " emprestado para " + cliente.getNome() + ".";
        }

        return messagemResposta;
    }


    private String emprestaLivroParaGerente(Livro livro, Gerente gerente) {
        System.out.println("Emprestou");
        // Implementação específica para Gerente
        return "Emprestando livro " + livro.getTitulo() + " para o gerente " + gerente.getNome() + ".";
    }

    private String emprestaLivroParaFuncionario(Livro livro, Funcionario funcionario) {
        System.out.println("Emprestou");
        // Implementação específica para Funcionario
        return "Emprestando livro " + livro.getTitulo() + " para o funcionário " + funcionario.getNome() + ".";
    }

    private String devolveLivroDeCliente(Livro livro, Cliente cliente) {
        System.out.println("Devolveu");        
        // Implementação específica para Cliente
        return "Devolvendo livro " + livro.getTitulo() + " do cliente " + cliente.getNome() + ".";
    }

    private String devolveLivroDeGerente(Livro livro, Gerente gerente) {
        System.out.println("Devolveu");        
        // Implementação específica para Gerente
        return "Devolvendo livro " + livro.getTitulo() + " do gerente " + gerente.getNome() + ".";
    }

    private String devolveLivroDeFuncionario(Livro livro, Funcionario funcionario) {
        System.out.println("Devolveu");        
// Implementação específica para Funcionario
        return "Devolvendo livro " + livro.getTitulo() + " do funcionário " + funcionario.getNome() + ".";
    }
}
