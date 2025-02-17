package application;

import model.Biblioteca;
import model.Livro;
import model.Cliente;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import model.EmprestimoLivroAdaptador;

public class LivroPanel extends JPanel {

    public LivroPanel(Livro livro) {
        
        Font fonteInfoBook = new Font("Arial", Font.PLAIN, 18);
        Font fonteTitulo = new Font("Arial", Font.PLAIN, 32);
        
        setLayout(new BorderLayout());

        // Cabeçalho com o nome da Biblioteca
        Biblioteca biblioteca = Biblioteca.getInstanciaDaBiblioteca();
        JLabel headerLabel = new JLabel(biblioteca.getNome(), SwingConstants.CENTER);
        headerLabel.setFont(fonteTitulo);
        add(headerLabel, BorderLayout.NORTH);

        // Título do livro e informações
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());
        contentPanel.setBackground(Color.BLACK);
        contentPanel.setForeground(Color.WHITE);
        contentPanel.setFont(fonteTitulo);

        // Título
        JLabel tituloLabel = new JLabel("Título: " + livro.getTitulo());        
        tituloLabel.setFont(fonteTitulo);
        tituloLabel.setBackground(Color.BLACK);
        contentPanel.add(tituloLabel, BorderLayout.NORTH);
        tituloLabel.setForeground(Color.WHITE);

        // Autor, Gênero, Data de Publicação, Ementa
        JPanel infoPanel = new JPanel();
        infoPanel.setBackground(Color.WHITE);
        infoPanel.setFont(fonteTitulo);
        
                
        infoPanel.setLayout(new BoxLayout(infoPanel, BoxLayout.Y_AXIS));
        infoPanel.add(new JLabel("Título: " + livro.getTitulo())).setFont(fonteInfoBook);
        infoPanel.add(new JLabel("Autor: " + livro.getAutor())).setFont(fonteInfoBook);
        infoPanel.add(new JLabel("Gênero: " + livro.getGenero())).setFont(fonteInfoBook);
        infoPanel.add(new JLabel("Data de Publicação: " + livro.getDataDePublicacao())).setFont(fonteInfoBook);
        infoPanel.add(new JLabel("Sinopse: " + livro.getSinopse())).setFont(fonteInfoBook);        
        infoPanel.add(new JLabel("Numero de Páginas: " + livro.getNumeroDePaginas())).setFont(fonteInfoBook);
        infoPanel.add(new JLabel("Editora: " + livro.getEditora())).setFont(fonteInfoBook);
        infoPanel.add(new JLabel("ISBN: " + livro.getISBN())).setFont(fonteInfoBook);
        infoPanel.add(new JLabel("Premiações: " + livro.getPremiacoes())).setFont(fonteInfoBook);
        infoPanel.add(new JLabel("Recepção da Crítica: " + livro.getRecepcaoCritica())).setFont(fonteInfoBook);        
        contentPanel.add(infoPanel, BorderLayout.CENTER);
        
        // Capa do Livro
        ImageIcon capaIcon = null;
        String pathIcon = "C:/Users/leoni/OneDrive/Documentos/NetBeansProjects/poo-Biblioteca/src/images/" + livro.getCapa();
        File imageFile = new File(pathIcon);

        if (imageFile.exists()) {
            capaIcon = new ImageIcon(pathIcon);
        } else {
            capaIcon = new ImageIcon("C:/Users/leoni/OneDrive/Documentos/NetBeansProjects/poo-Biblioteca/src/images/capa1.jpg"); // Imagem padrão
        }

        JLabel capaLabel = new JLabel(capaIcon);
        capaLabel.setBackground(Color.WHITE);
        contentPanel.add(capaLabel, BorderLayout.EAST);
        

        // Botão Emprestar
        JButton emprestarButton = new JButton("Emprestar");
        emprestarButton.setFont(fonteTitulo);
        emprestarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                // Criando o adaptador de empréstimo de livros
                EmprestimoLivroAdaptador emprestimoAdapter = new EmprestimoLivroAdaptador();
                
                // Lógica para emprestar o livro
                Cliente cliente = biblioteca.getClientes().isEmpty() ? null : biblioteca.getClientes().get(0); 
                if (cliente != null) {
                    // Emprestando e devolvendo livros usando o adaptador
                    emprestimoAdapter.emprestaLivro(livro, cliente);                                                            
                    String newMessage = biblioteca.verificarEmprestimo(livro);
                    JOptionPane.showMessageDialog(null, newMessage);
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum cliente registrado para emprestar o livro.");
                }
                
                
            }
        });
        contentPanel.add(emprestarButton, BorderLayout.SOUTH);
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();        
        // Largura da tela
        int screenWidth = 800; //screenSize.width/4;        
        // Altura da tela
        int screenHeight = 600; // screenSize.height;
        
        // Width of the screen
        //int screenWidth = screenSize.width;
        // Height of the screen
        //int screenHeight = screenSize.height;
        
        // Definindo a altura do painel
        contentPanel.setPreferredSize(new Dimension(contentPanel.getPreferredSize().width, screenWidth));        
        contentPanel.setPreferredSize(new Dimension(contentPanel.getPreferredSize().height, screenHeight));        
        add(contentPanel, BorderLayout.CENTER);

        
        
        // Rodapé com o endereço e horário de funcionamento
        JLabel footerLabel = new JLabel(biblioteca.getEndereco() + " | Horário de Funcionamento: " + biblioteca.getHorarioDeFuncionamento(), SwingConstants.CENTER);
        footerLabel.setFont(fonteInfoBook);
        footerLabel.setBackground(Color.red);
        add(footerLabel, BorderLayout.SOUTH);
    }
    
}
