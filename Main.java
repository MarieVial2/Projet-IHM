import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                StringFenetrePrincipale fenetre = new StringFenetrePrincipale();
                fenetre.setVisible(true);
            }
        });


        //StringMoteurInterface moteur = new StringMoteurInterface();
        //moteur.setVisible(true);
    }
}