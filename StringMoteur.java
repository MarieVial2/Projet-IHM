import javax.swing.*;
import java.awt.*;

/**
 *
 * @author p2510730
 */
public class StringMoteur {

    StringMoteurInterface smi;

    public StringMoteur(StringMoteurInterface smi) {
        this.smi = smi;
    }

    public void majuscules() {
        this.smi.setTextLabel(this.smi.getText().toUpperCase());
        //return s.toUpperCase();
    }

    public void minuscules() {
        this.smi.setTextLabel(this.smi.getText().toLowerCase());
    }

    public void ajoutDebut() {
        //StringBuffer concaten = new StringBuffer(s2);
        //return concaten.append(s1).toString();
        //return s1+s2;
        String s1 = this.smi.getTextLabel();
        String s2 = this.smi.getText();
        this.smi.setTextLabel(s2+s1);

    }

    public void ajoutFin() {
        String s1 = this.smi.getTextLabel();
        String s2 = this.smi.getText();
        this.smi.setTextLabel(s1+s2);
    }

    public void afficheMots() {
        String[] tab;
        String s = this.smi.getText();
        tab = s.split(" ");
        StringBuffer concaten = new StringBuffer();


        concaten.append(tab[0]);

        for (int i = 1; i < tab.length; i++) {
            concaten.append(", ");
            concaten.append(tab[i]);
        }

        this.smi.setTextLabel(concaten.toString());

    }

    public String afficheMotsCorr(String s) {
        String[] res = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for (String st : res) {
            sb.append(st).append(", ");
        }
        sb.setCharAt(sb.lastIndexOf(","), ' ');
        return sb.toString();
    }

    //Là, ça marche avec des phrases bien formatées, réfléchir à si il y a plusieurs espaces, des caractères spéciaux...

    public String afficheMotsComplexe (String s) {
        String[] mots = s.split("[^\\p{L}]+");
        StringBuffer concaten = new StringBuffer();

        for (String res : mots) {
            concaten.append(res).append(", ");
        }
        concaten.setCharAt(concaten.lastIndexOf(", "), ' ');
        return concaten.toString();
    }

    public void tailleSansEspaces() {
        String s = this.smi.getText().replace(" ", "");
        int nb = s.length();
        this.smi.setTextLabel(String.valueOf(nb));

    }

    public void calculSimple() {
        String[] tab;
        tab = this.smi.getText().split(" ");
        if (tab.length != 3) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int nb1 = Integer.parseInt(tab[0]);
        int nb2 = Integer.parseInt(tab[2]);
        String chaine="";

        switch (tab[1]) {

            case "+":
                chaine = String.valueOf(nb1 + nb2);
                this.smi.setTextLabel(chaine);

            case "-":
                chaine = String.valueOf(nb1 - nb2);
                this.smi.setTextLabel(chaine);

            case "/":
                if (nb2 == 0)
                    throw new ArithmeticException("Impossible de diviser par 0 !");
                else
                    chaine = String.valueOf(nb1 / nb2);
                this.smi.setTextLabel(chaine);

            case "*":
                chaine = String.valueOf(nb1 * nb2);
                this.smi.setTextLabel(chaine);

            default:
                throw new IllegalArgumentException("Mauvais opérateur");

        }


    }

    //considérer quand ce n'est pas des nombres : numberformatexception. On peut aussi avoir arithmeticexception division par 0. Si on a d'autre opérateur, illegalArgumentsException

    public String initialesEnMajuscules (String s) {
        String[] mots = s.split("[^\\p{L}]+");
        for (String res : mots) {
            res = res.substring(0,1).toUpperCase() + res.substring(1);
        }
        /*for (int i = 0; i<mots.length;i++) {

            mots[i] = mots[i].substring(0,1).toUpperCase() + mots[i].substring(1);

         }*/
        StringBuffer concaten = new StringBuffer();
        for (String res : mots) {
            concaten.append(res).append(" ");
        }
        return concaten.toString();
    }
}
