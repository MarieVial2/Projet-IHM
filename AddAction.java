import javax.swing.*;
        import java.awt.event.ActionEvent;

public class AddAction extends AbstractAction {
    private PlayWordInterface pw;

    private String word;
    private JPanel panel;

    public AddAction(String givenName,  PlayWordInterface pw, JPanel panel) {
        super(givenName);
        this.pw = pw;

        this.panel=panel;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        word = JOptionPane.showInputDialog(panel, "Enter the word :");
        if (word == null) {
            JOptionPane.showMessageDialog(panel, "Added failed");
        }
        ModeleComboPlayword CBChoix = this.pw.getModel(pw.getComboChoix());
        CBChoix.ajoutDebutEtSelectionne(word);
        JOptionPane.showMessageDialog(panel, "Successfully added !");

    }
}
