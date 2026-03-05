import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StringFenetrePrincipale extends JFrame {
    public StringFenetrePrincipale() {
        super();
        constructeurFen();
    }

    private void constructeurFen() {
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setContentPane(constructeurPan());
        setVisible(true);

    }

    private JPanel constructeurPan() {
        JPanel pan = new JPanel();
        pan.setLayout(new BoxLayout(pan,BoxLayout.Y_AXIS));

        JLabel label1 = new JLabel("Bienvenue sur l'application de manipulation des chaines de caractères ! ");
        JLabel label2 = new JLabel("Cliquez sur l'activité de votre choix");
        label1.setAlignmentX(Component.CENTER_ALIGNMENT);
        pan.add(label1);
        label2.setAlignmentX(Component.CENTER_ALIGNMENT);
        pan.add(label2);
        pan.add(Box.createVerticalGlue());
        JButton button1 = new JButton("Opérations sur les chaines de caracteres");
        button1.setAlignmentX(Component.CENTER_ALIGNMENT);
        pan.add(button1);
        button1.addActionListener(
                new ActionListener() {
                    public void actionPerformed (ActionEvent e) {
                        StringMoteurInterface moteur = new StringMoteurInterface();
                        moteur.setVisible(true);
                    }
                }
        );
        pan.add(Box.createVerticalGlue());
        JButton button2 = new JButton("Play with English words");
        button2.setAlignmentX(Component.CENTER_ALIGNMENT);
        pan.add(button2);
        button2.addActionListener(
                new ActionListener() {
                    public void actionPerformed (ActionEvent e) {
                        PlayWordInterface englishWords = new PlayWordInterface();
                        englishWords.setVisible(true);
                    }
                }
        );
        pan.add(Box.createVerticalGlue());

        return pan;
    }

}
