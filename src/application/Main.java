package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.text.View;
import model.Biblioteca;
import model.Cliente;
import model.Funcionario;
import model.Gerente;
import model.Livro;
import view.TelaPrincipal;

public class Main {
    
    public static void main(String[] args) {
             
        //Prepara o ambiente
        iniciaAmbiente();        
        
        JFrame telaPrincipal = new TelaPrincipal();
        telaPrincipal.setVisible(true);
        

    }
    
    private static void iniciaAmbiente(){
        
        //Cria lista de melhors livros
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
        
        // Criando uma coleção com a lista de livros
        List<Livro> colecaoDeLivros = new ArrayList<>();
        colecaoDeLivros.add(livro1);
        colecaoDeLivros.add(livro2);
        colecaoDeLivros.add(livro3);
        colecaoDeLivros.add(livro4);
        colecaoDeLivros.add(livro5);
        colecaoDeLivros.add(livro6);
        colecaoDeLivros.add(livro7);
        colecaoDeLivros.add(livro8);
        colecaoDeLivros.add(livro9);
        colecaoDeLivros.add(livro10);
        colecaoDeLivros.add(livro11);
        colecaoDeLivros.add(livro12);
        colecaoDeLivros.add(livro13);
        colecaoDeLivros.add(livro14);
        colecaoDeLivros.add(livro15);
                       
        // Criando listas vazias para clientes, gerentes e funcionários
        List<Cliente> clientes = new ArrayList<>();
        List<Gerente> gerentes = new ArrayList<>();
        List<Funcionario> funcionarios = new ArrayList<>();
                                
        // Criando e adiconado um cliente
        Cliente cliente = new Cliente("João", "Silva", new Date(), "123456789", "1234-5678", "joao@gmail.com", "M123", new Date(), new ArrayList<>());
        clientes.add(cliente);
        
        // Criando e adiconado um gerente
        Gerente gerente = new Gerente("Maria", "Souza", new Date(), "987654321", "5678-1234", "maria@gmail.com", "Gerente", 5000.0, new Date(), new ArrayList<>());
        gerentes.add(gerente);        
        
        // Criando e adiconado um funcionario
        Funcionario funcionario = new Gerente("Reldo", "Marline", new Date(), "987694321", "5679-1234", "reldomarline@gmail.com", "Funcionario", 5000.0, new Date(), new ArrayList<>());
        funcionarios.add(funcionario);        
        
         // Criando uma biblioteca
        Biblioteca unicaBiblioteca = Biblioteca.getInstanciaDaBiblioteca();
        unicaBiblioteca.setNome("Biblioteca Central");
        unicaBiblioteca.setEndereco("Rua Principal, 123");
        unicaBiblioteca.setHorarioDeFuncionamento("08:00 - 18:00"); //         
        unicaBiblioteca.setEmail("biblioteca@gmail.com"); 
        unicaBiblioteca.setCapacidade(1500);
        unicaBiblioteca.setWebsite("www.biblioteca.com");
        unicaBiblioteca.setTelefone("1234-5678");
        unicaBiblioteca.setFuncionarios(funcionarios);
        unicaBiblioteca.setClientes(clientes);
        unicaBiblioteca.setGerentes(gerentes);
        unicaBiblioteca.setColecaoDeLivros(colecaoDeLivros);        

        // Registrando cliente, funcionario e gerente na biblioteca
        unicaBiblioteca.registrarCliente(cliente);
        unicaBiblioteca.registrarGerente(gerente);
        unicaBiblioteca.registrarFuncionario(funcionario);
        
    }
    
    
}

