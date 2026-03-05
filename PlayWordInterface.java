import javax.swing.*;
import java.awt.*;


public class PlayWordInterface extends JFrame {
    public PlayWordInterface() {
        super();
        constructeurFen();
    }

    private void constructeurFen() {
        setSize(900, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setContentPane(constructeurPan());
        setVisible(true);

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
        JComboBox comboChoix = new JComboBox();
        JComboBox comboProfession = new JComboBox();
        JComboBox comboIndoor = new JComboBox();
        JComboBox comboOutdoor = new JComboBox();
        JButton buttonCopyProf = new JButton("Copy here");
        JButton buttonCopyIn = new JButton("Copy here");
        JButton buttonCopyOut = new JButton("Copy here");
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
}



