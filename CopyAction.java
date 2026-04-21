import javax.swing.*;
import java.awt.event.ActionEvent;

public class CopyAction extends AbstractAction {
    private PlayWordInterface pw;
    private JComboBox CB;

    public CopyAction(String givenName,  PlayWordInterface pw, JComboBox CB) {
        super(givenName);
        this.pw = pw;
        this.CB=CB;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String item = pw.getComboChoix().getSelectedItem().toString();
        CB.addItem(item);
        pw.getComboChoix().removeItem(item);
        if (CB.getItemCount() != pw.getNbItem()){
            pw.getCancel().setEnabled(true);
        }
        pw.setItemCB(CB.getItemAt(CB.getItemCount() - 1));
        System.out.println(CB.getItemAt(CB.getItemCount() - 1));
        pw.setCBCopyAction(CB);

    }
}
