import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SlidingForm extends JFrame {
    private int xPos = 0;
    private int yPos = 300;
    private Timer timer;

    public SlidingForm() {
        
        setTitle("Formulário Deslizante");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(xPos, yPos);
        setLayout(new BorderLayout());

        JLabel label = new JLabel("Formulário Deslizante", SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);

        // Inicia o timer para animar o deslizamento
        timer = new Timer(1, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                xPos += 2;  // Incrementa a posição X
                setLocation(xPos, yPos);

                // Para o timer quando o formulário atinge a posição desejada
                if (xPos >= 500) {
                    timer.stop();
                }
            }
        });
    }

    public void startSliding() {
        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SlidingForm form = new SlidingForm();
                form.setVisible(true);
                form.startSliding();
            }
        });
    }
}
