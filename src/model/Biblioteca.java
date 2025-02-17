package model;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private String nome;
    private String endereco;
    private String telefone;
    private String email;    
    private String horarioDeFuncionamento;
    private int capacidade;
    private String website;
    private List<Cliente> clientes; 
    private List<Funcionario> funcionarios; 
    private List<Livro> emprestimosDeLivros;
    private List<Livro> catalogoDeLivros;
    
    private List<Gerente> gerentes; 

    private static Biblioteca unicaBiblioteca; 

    // Construtor privado para impedir instanciamento direto
    private Biblioteca(String nome, String endereco, String telefone, String email, List<Livro> catalogoDeLivros, List<Livro> colecaoDeLivros,
                      String horarioDeFuncionamento, int capacidade, String website) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.emprestimosDeLivros = colecaoDeLivros != null ? colecaoDeLivros : new ArrayList<>();
        this.horarioDeFuncionamento = horarioDeFuncionamento;
        this.capacidade = capacidade;
        this.website = website;
        this.clientes = new ArrayList<>();
        this.gerentes = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
        this.catalogoDeLivros = new ArrayList<>();
    }

    // Método estático para obter a instância única
    public static Biblioteca getInstanciaDaBiblioteca() {
        if (unicaBiblioteca == null) {
            unicaBiblioteca = new Biblioteca("Biblioteca Central", "Rua Principal, 123", "1234-5678", "biblioteca@gmail.com",
                    new ArrayList<>(), new ArrayList<>(), "08:00 - 18:00", 100, "www.biblioteca.com");
        }
        return unicaBiblioteca;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
   
    public String getHorarioDeFuncionamento() { return horarioDeFuncionamento; }
    public void setHorarioDeFuncionamento(String horarioDeFuncionamento) { this.horarioDeFuncionamento = horarioDeFuncionamento; }

    public int getCapacidade() { return capacidade; }
    public void setCapacidade(int capacidade) { this.capacidade = capacidade; }

    public String getWebsite() { return website; }
    public void setWebsite(String website) { this.website = website; }

    public List<Cliente> getClientes() { return clientes; }
    public void setClientes(List<Cliente> clientes) { this.clientes = clientes; }

    public List<Gerente> getGerentes() { return gerentes; }
    public void setGerentes(List<Gerente> gerentes) { this.gerentes = gerentes; }
    
    public List<Funcionario> getFuncionarios() { return funcionarios; }
    public void setFuncionarios(List<Funcionario> funcionarios) { this.funcionarios = funcionarios; }
    
    public List<Livro> getColecaoDeLivros() { return catalogoDeLivros; }
    public void setColecaoDeLivros(List<Livro> catalogoDeLivros) { this.catalogoDeLivros = catalogoDeLivros; }
    
    public List<Livro> getEmprestimosDeLivros() { return emprestimosDeLivros; }
    public void setEmprestimoDeLivros(List<Livro> colecaoDeLivros) { this.emprestimosDeLivros = colecaoDeLivros; }
    
    @Override
    public String toString() {
        return "Biblioteca{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", colecaoDeLivros=" + catalogoDeLivros +
                ", horarioDeFuncionamento='" + horarioDeFuncionamento + '\'' +
                ", capacidade=" + capacidade +
                ", website='" + website + '\'' +
                ", clientes=" + clientes +
                '}';
    }
    
    // Métodos adicionais para gerenciar a biblioteca
    public void adicionarLivro(Livro livro) {
        emprestimosDeLivros.add(livro);
    }

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    
    public void registrarGerente(Gerente gerente) {
        gerentes.add(gerente);
    }
    
    public void registrarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
    
    public void removerCliente(Cliente cliente) {
        clientes.remove(cliente);
    }    

    // Método para adicionar os 100 melhores livros do mundo à coleção
    public void adicionarMelhoresLivros() {        
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "Fantasia", "1954", "Um épico de fantasia", 1200, "HarperCollins", "978-0261102385", "Prêmio Hugo", "Recebido com aclamação", "capa1.jpg");
        Livro livro2 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", "Fantasia", "1997", "O começo da saga Harry Potter", 223, "Bloomsbury", "978-0747532699", "Prêmio Nestlé Smarties", "Recebido com aclamação", "capa2.jpg");        
        Livro livro3 = new Livro("Orgulho e Preconceito", "Jane Austen", "Romance", "1813", "Uma crítica social da vida na Inglaterra no início do século XIX.", 279, "T. Egerton", "978-1503290563", "Nenhum", "Recebido com aclamação", "capa3.jpg");
        Livro livro4 = new Livro("1984", "George Orwell", "Ficção científica", "1949", "Uma distopia sobre um regime totalitário no futuro.", 328, "Secker & Warburg", "978-0451524935", "Nenhum", "Recebido com aclamação", "capa4.jpg");
        Livro livro5 = new Livro("Dom Quixote", "Miguel de Cervantes", "Ficção", "1605", "As aventuras de um nobre que decide se tornar um cavaleiro errante.", 1072, "Francisco de Robles", "978-0060934347", "Nenhum", "Recebido com aclamação", "capa5.jpg");
        Livro livro6 = new Livro("Moby Dick", "Herman Melville", "Aventura", "1851", "A história do capitão Ahab e sua busca obsessiva pela baleia Moby Dick.", 635, "Harper & Brothers", "978-1503280786", "Nenhum", "Recebido com aclamação", "capa6.jpg");
        Livro livro7 = new Livro("Guerra e Paz", "Liev Tolstói", "Histórico", "1869", "Um épico sobre a sociedade russa durante as guerras napoleônicas.", 1225, "The Russian Messenger", "978-0199232765", "Nenhum", "Recebido com aclamação", "capa7.jpg");
        Livro livro8 = new Livro("O Grande Gatsby", "F. Scott Fitzgerald", "Ficção", "1925", "A história de Jay Gatsby e seu amor por Daisy Buchanan.", 180, "Charles Scribner's Sons", "978-0743273565", "Nenhum", "Recebido com aclamação", "capa8.jpg");
        Livro livro9 = new Livro("Cem Anos de Solidão", "Gabriel García Márquez", "Realismo Mágico", "1967", "A história da família Buendía em Macondo.", 417, "Harper & Row", "978-0060883287", "Prêmio Nobel de Literatura", "Recebido com aclamação", "capa9.jpg");
        Livro livro10 = new Livro("Ulisses", "James Joyce", "Modernismo", "1922", "Um dia na vida de Leopold Bloom em Dublin.", 730, "Sylvia Beach", "978-0199535675", "Nenhum", "Recebido com aclamação", "capa10.jpg");
        Livro livro11 = new Livro("O Apanhador no Campo de Centeio", "J.D. Salinger", "Ficção", "1951", "A história de Holden Caulfield, um adolescente em Nova York.", 214, "Little, Brown and Company", "978-0316769488", "Nenhum", "Recebido com aclamação", "capa11.jpg");
        Livro livro12 = new Livro("A Odisséia", "Homero", "Épico", "Século VIII a.C.", "As aventuras de Odisseu enquanto tenta retornar para casa após a Guerra de Troia.", 500, "Nenhum", "978-0140268867", "Nenhum", "Recebido com aclamação", "capa12.jpg");
        Livro livro13 = new Livro("Crime e Castigo", "Fiódor Dostoiévski", "Ficção", "1866", "A história de Raskólnikov, um estudante que comete um assassinato e luta com sua consciência.", 671, "The Russian Messenger", "978-0140449136", "Nenhum", "Recebido com aclamação", "capa13.jpg");
        Livro livro14 = new Livro("Em Busca do Tempo Perdido", "Marcel Proust", "Ficção", "1913", "Uma série de sete romances que exploram a memória e o tempo.", 4215, "Grasset", "978-0141180349", "Nenhum", "Recebido com aclamação", "capa14.jpg");
        Livro livro15 = new Livro("O Sol é para Todos", "Harper Lee", "Ficção", "1960", "A história de Scout Finch e seu pai, Atticus, um advogado que defende um homem negro acusado de estuprar uma mulher branca.", 281, "J.B. Lippincott & Co.", "978-0060935464", "Prêmio Pulitzer", "Recebido com aclamação", "capa15.jpg");
        
        // Criando uma lista de livros        
        catalogoDeLivros.add(livro1);
        catalogoDeLivros.add(livro2);
        catalogoDeLivros.add(livro3);
        catalogoDeLivros.add(livro4);
        catalogoDeLivros.add(livro5);
        catalogoDeLivros.add(livro6);
        catalogoDeLivros.add(livro7);
        catalogoDeLivros.add(livro8);
        catalogoDeLivros.add(livro9);
        catalogoDeLivros.add(livro10);
        catalogoDeLivros.add(livro11);
        catalogoDeLivros.add(livro12);
        catalogoDeLivros.add(livro13);
        catalogoDeLivros.add(livro14);
        catalogoDeLivros.add(livro15);        
    }
    
    // Método para verificar se o livro está emprestado e com quem
public String verificarEmprestimo(Livro livro) {
     boolean livroEmprestado = false;    
     String strMessage = "O livro " + livro.getTitulo() + " não está emprestado.";
    if (emprestimosDeLivros.contains(livro)) {
            for (Cliente cliente : clientes) {
                if (cliente.getLivrosEmprestados().contains(livro)) {
                    livroEmprestado = true;
                    strMessage = "O livro " + livro.getTitulo() + " está emprestado para " + cliente.getNome() + ".";
                }
            }
            for (Funcionario funcionario : funcionarios) {
                if (funcionario.getLivrosEmprestados().contains(livro)) {
                    livroEmprestado = true;
                    strMessage = strMessage + "\n" + "O livro " + livro.getTitulo() + " está emprestado para " + funcionario.getNome() + ".";
                }
            }
            for (Gerente gerente : gerentes) {
                livroEmprestado = true;
                if (gerente.getLivrosEmprestados().contains(livro)) {
                    livroEmprestado = true;
                    strMessage = strMessage + "\n" + "O livro " + "O livro " + livro.getTitulo() + " está emprestado para " + gerente.getNome() + ".";
                }
            }
            
            if (livroEmprestado == false){ strMessage = "O livro " + livro.getTitulo() + " não está emprestado para nenhum cliente, funcionário ou gerente.";}                        
    }    
    return strMessage;        
}


}
