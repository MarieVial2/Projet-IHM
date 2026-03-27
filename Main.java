import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                StringFenetrePrincipale fenetre = new StringFenetrePrincipale();
                String[] tab = {"Pomme", "Banane", "Orange"};
                ModeleComboPlayword MCP = new ModeleComboPlayword( tab);

                fenetre.setVisible(true);
            }
        });


        //StringMoteurInterface moteur = new StringMoteurInterface();
        //moteur.setVisible(true);
    }
}