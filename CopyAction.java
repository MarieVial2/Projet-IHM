import javax.swing.*;
import java.awt.event.ActionEvent;

public class CopyAction extends AbstractAction {
    private PlayWordInterface pw;
    private int numCB;

    public CopyAction(String givenName,  PlayWordInterface pw, int numCB) {
        super(givenName);
        this.pw = pw;
        this.numCB = numCB;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        

    }
}
