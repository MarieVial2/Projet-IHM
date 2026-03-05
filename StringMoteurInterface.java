import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StringMoteurInterface extends JFrame implements ActionListener{

    private StringMoteur sm;
    private JLabel label1 ;
    private JTextField field1 ;
    private JLabel label2;
    private JButton buttonMaj;
    private JButton buttonMin;
    private JButton buttonDbt;
    private JButton buttonFin;
    private JButton buttonMots;
    private JButton buttonTaille;
    private JButton buttonCalc;
    private JButton buttonInit;
    private JButton buttonQ;

    private JLabel resultat;
    private JLabel chaineResultat;


    public StringMoteurInterface() {
        super();
        constructeurFen();
        this.sm = new StringMoteur(this);
        traitementEvenement();
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
            if (e.getSource() == buttonMaj) {
            sm.majuscules();
            }
            if (e.getSource() == buttonMots) {
                sm.afficheMots();
            }
        }
    }

    private void traitementEvenement () {
        buttonMin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sm.minuscules();
            }
        });
        buttonMaj.addActionListener(new Interne());
        buttonDbt.addActionListener(this);
        buttonFin.addActionListener(event ->
        {
            sm.ajoutFin();
        });
        buttonMots.addActionListener(new Interne());
        buttonTaille.addActionListener(
                new ActionListener() {
                    public void actionPerformed (ActionEvent e) {
                        sm.tailleSansEspaces();
                    }
                }
        );

        buttonCalc.addActionListener(this);

        //.dispose() pour sortir
    }


    public void actionPerformed (ActionEvent event) {
        if (event.getSource() == buttonDbt) {
            sm.ajoutDebut();
        }
        if (event.getSource() == buttonCalc) {
            sm.calculSimple();
        }

    }

    private JPanel constructeurPan() {
        label1 = new JLabel("Entrez une chaine : ");
        field1 = new JTextField();
        label2 = new JLabel("Choisir l'opération : ");
        buttonMaj = new JButton("MAJUSCULE");
        buttonMin = new JButton("minuscule");
        buttonDbt = new JButton("AjouterDébut");
        buttonFin = new JButton("AjoutFin");
        buttonMots = new JButton("AfficherMots");
        buttonTaille = new JButton("TailleSansEspaces");
        buttonCalc = new JButton("CalculSimple");
        buttonInit = new JButton("InitialesEnMajuscules");
        buttonQ = new JButton("Quitter");

        resultat = new JLabel("Resultat : ");
        chaineResultat = new JLabel("Ma chaine modifiée");
        JPanel pan = new JPanel();
        pan.setLayout(new BoxLayout(pan,BoxLayout.Y_AXIS));

        JPanel panTop = new JPanel();
        panTop.add(new JLabel("Veuillez tout d'abord une chaine avant d'appuyer sur le bouton correspondant à l'opération"));
        pan.add(panTop);

        pan.add(Box.createRigidArea(new Dimension(0, 60)));

        JPanel panMiddleTop = new JPanel();
        //Pas de grid ici, préférer le Border et ajuster les composants autour
        panMiddleTop.setLayout(new BorderLayout());

        panMiddleTop.add(label1,BorderLayout.WEST);
        panMiddleTop.add(field1,BorderLayout.EAST);

        panMiddleTop.add(field1);
        pan.add(panMiddleTop);

        pan.add(Box.createRigidArea(new Dimension(0, 40)));


        JPanel panMiddleBottom = new JPanel();
        panMiddleBottom.setLayout(new BoxLayout(panMiddleBottom,BoxLayout.Y_AXIS));

        panMiddleBottom.add(label2);

        JPanel insideMiddleBottom = new JPanel();

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

        panBottom.add(resultat,BorderLayout.WEST);
        panBottom.add(chaineResultat,BorderLayout.EAST);

        pan.add(panBottom);



        return pan;
    }



    public String getText() {
        return field1.getText();
    }

    public String getTextLabel() {
        return chaineResultat.getText();
    }
    public void setTextLabel(String s) {
        chaineResultat.setText(s);
    }
}
