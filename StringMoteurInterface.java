import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StringMoteurInterface extends JFrame {
    public StringMoteurInterface() {
        super();
        constructeurFen();
    }

    private void constructeurFen() {
        setSize(1000, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setContentPane(constructeurPan());
        setVisible(true);
    }

    private class Interne implements ActionListener
    {
        public void actionPerformed(ActionEvent e) {

        }
    }

    private JPanel constructeurPan() {
        JPanel pan = new JPanel();
        pan.setLayout(new BoxLayout(pan,BoxLayout.Y_AXIS));

        JPanel panTop = new JPanel();
        panTop.add(new JLabel("Veuillez tout d'abord une chaine avant d'appuyer sur le bouton correspondant à l'opération"));
        pan.add(panTop);

        pan.add(Box.createRigidArea(new Dimension(0, 60)));

        JPanel panMiddleTop = new JPanel();
        //Pas de grid ici, préférer le Border et ajuster les composants autour
        panMiddleTop.setLayout(new BorderLayout());
        JLabel label1 = new JLabel("Entrez une chaine : ");
        JTextField field1 = new JTextField();
        panMiddleTop.add(label1,BorderLayout.WEST);
        panMiddleTop.add(field1,BorderLayout.EAST);

        panMiddleTop.add(field1);
        pan.add(panMiddleTop);

        pan.add(Box.createRigidArea(new Dimension(0, 40)));


        JPanel panMiddleBottom = new JPanel();
        panMiddleBottom.setLayout(new BoxLayout(panMiddleBottom,BoxLayout.Y_AXIS));
        JLabel label2 = new JLabel("Choisir l'opération : ");
        panMiddleBottom.add(label2);

        JPanel insideMiddleBottom = new JPanel();
        JButton buttonMaj = new JButton("MAJUSCULE");
        JButton buttonMin = new JButton("minuscule");
        JButton buttonDbt = new JButton("AjouterDébut");
        JButton buttonFin = new JButton("AfficheFin");
        JButton buttonMots = new JButton("AfficherMots");
        JButton buttonTaille = new JButton("TailleSansEspaces");
        JButton buttonCalc = new JButton("CalculSimple");
        JButton buttonInit = new JButton("InitialesEnMajuscules");
        JButton buttonQ = new JButton("Quitter");
        insideMiddleBottom.add(buttonMaj);
        insideMiddleBottom.add(buttonMin);
        insideMiddleBottom.add(buttonDbt);
        insideMiddleBottom.add(buttonFin);
        insideMiddleBottom.add(buttonMots);
        insideMiddleBottom.add(buttonTaille);
        insideMiddleBottom.add(buttonCalc);
        insideMiddleBottom.add(buttonInit);
        insideMiddleBottom.add(buttonQ);

        panMiddleBottom.add(insideMiddleBottom);

        pan.add(panMiddleBottom);

        JPanel panBottom = new JPanel();
        panBottom.setLayout(new BorderLayout());
        JLabel resultat = new JLabel("Resultat : ");
        JLabel chaineResultat = new JLabel("Ma chaine modifiée");
        panBottom.add(resultat,BorderLayout.WEST);
        panBottom.add(chaineResultat,BorderLayout.EAST);

        pan.add(panBottom);

        return pan;
    }
}
