import javax.swing.*;
import java.awt.*;


public class PlayWordInterface extends JFrame {

    private JComboBox comboProfession = new JComboBox();
    private JComboBox comboChoix = new JComboBox();
    private JComboBox comboIndoor = new JComboBox();
    private JComboBox comboOutdoor = new JComboBox();
    private JButton buttonCopyProf ;
    private JButton buttonCopyIn;
    private JButton buttonCopyOut ;
    private JMenuItem copyProfession ;
    private JMenuItem copyIndoor;
    private JMenuItem copyOut;

    private JMenuItem cancel;
    private JMenuItem quit;

    public JComboBox getCBCopyAction() {
        return CBCopyAction;
    }

    public void setCBCopyAction(JComboBox CBCopyAction) {
        this.CBCopyAction = CBCopyAction;
    }

    private JComboBox CBCopyAction;

    public Object getItemCB() {
        return itemCB;
    }

    public void setItemCB(Object itemCB) {
        this.itemCB = itemCB;
    }

    private Object itemCB;



    private final int nbItem = getComboChoix().getItemCount();




    public PlayWordInterface() {
        super();
        constructeurFen();

    }

    private void constructeurFen() {
        setSize(900, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setContentPane(constructeurPan());
        setJMenuBar(constructeurMenu());
        setVisible(true);

    }

    private JMenuBar constructeurMenu(){
        JMenuBar menuBar = new JMenuBar();
        JMenu menuCopy = new JMenu("Copy Operation");
        JMenu menuCancel = new JMenu("Cancel & quit");

        copyProfession = new JMenuItem(new CopyAction("Copy to profession", this, comboProfession));
        copyIndoor = new JMenuItem(new CopyAction("Copy to indoor hobbies", this, comboIndoor));
        copyOut = new JMenuItem(new CopyAction("Copy to outdoor hobbies", this, comboOutdoor));

        cancel = new JMenuItem(new CancelAction("Cancel last operation", this));
        quit = new JMenuItem("Quit");
        cancel.setEnabled(false);

        menuCancel.add(cancel);
        menuCancel.add(quit);

        menuBar.add(menuCopy);
        menuBar.add(menuCancel);

        menuCopy.add(copyProfession);
        menuCopy.add(copyIndoor);
        menuCopy.add(copyOut);




        return menuBar;
    }

    private JPanel constructeurPan() {
        JPanel pan = new JPanel();
        pan.setLayout(new BoxLayout(pan,BoxLayout.Y_AXIS));
        JLabel labelTop = new JLabel("Put each word of the combo box  into the corresponding category");
        labelTop.setAlignmentX(Component.CENTER_ALIGNMENT);
        pan.add(labelTop);

        pan.add(Box.createVerticalGlue());

        JPanel panMiddle = new JPanel(new GridLayout(3, 4, 7, 7));
        JLabel words = new JLabel("Words");
        JLabel professions = new JLabel("Professions");
        JLabel indoor = new JLabel("Indoor Hobbies");
        JLabel outdoor = new JLabel("Outdoor Hobbies");

        comboChoix.addItem("Geocaching");
        comboChoix.addItem("Scuteliphilly");
        comboChoix.addItem("Mixology");
        comboChoix.addItem("Topiary");

        buttonCopyProf = new JButton(new CopyAction("Copy Here", this, comboProfession));
        buttonCopyIn = new JButton(new CopyAction("Copy Here", this, comboIndoor));
        buttonCopyOut = new JButton(new CopyAction("Copy Here", this, comboOutdoor));
        panMiddle.add(words);
        panMiddle.add(professions);
        panMiddle.add(indoor);
        panMiddle.add(outdoor);
        panMiddle.add(comboChoix);
        panMiddle.add(comboProfession);
        panMiddle.add(comboIndoor);
        panMiddle.add(comboOutdoor);
        panMiddle.add(Box.createGlue());
        panMiddle.add(buttonCopyProf);
        panMiddle.add(buttonCopyIn);
        panMiddle.add(buttonCopyOut);

        pan.add(panMiddle);

        pan.add(Box.createVerticalGlue());
        JButton buttonOk = new JButton("Show me solution");
        buttonOk.setAlignmentX(Component.CENTER_ALIGNMENT);
        pan.add(buttonOk);
        pan.add(Box.createVerticalGlue());




        return pan;
    }

    public int getNbItem() {
        return nbItem;
    }

    public JMenuItem getCancel() {
        return cancel;
    }

    public JMenuItem getQuit() {
        return quit;
    }

    public JMenuItem getCopyProfession() {
        return copyProfession;
    }



    public JMenuItem getCopyIndoor() {
        return copyIndoor;
    }



    public JMenuItem getCopyOut() {
        return copyOut;
    }


    public JComboBox getComboChoix() {
        return comboChoix;
    }



    public JButton getButtonCopyProf() {
        return buttonCopyProf;
    }

    public JComboBox getComboProfession() {
        return comboProfession;
    }

    public JComboBox getComboIndoor() {
        return comboIndoor;
    }



    public JComboBox getComboOutdoor() {
        return comboOutdoor;
    }

    public JButton getButtonCopyIn() {
        return buttonCopyIn;
    }

    public JButton getButtonCopyOut() {
        return buttonCopyOut;
    }
}



