import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.List;

public class DeleteAction extends AbstractAction{
    private PlayWordInterface pw;

    private String word;
    private JPanel panel;

    public DeleteAction(String givenName,  PlayWordInterface pw, JPanel panel) {
        super(givenName);
        this.pw = pw;

        this.panel=panel;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        word = JOptionPane.showInputDialog(panel, "Enter the word to delete:");
        ModeleComboPlayword CBChoix = this.pw.getModel(pw.getComboChoix());
        CBChoix.supprimer(word, panel);


    }
}
