import javax.swing.*;
import java.awt.event.ActionEvent;

public class CancelAction extends AbstractAction {
    private PlayWordInterface pw;


    public CancelAction(String givenName, PlayWordInterface pw) {
        super(givenName);
        this.pw = pw;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        pw.getCBCopyAction().removeItem(pw.getItemCB());
        pw.getComboChoix().addItem(pw.getItemCB());

    }
}
