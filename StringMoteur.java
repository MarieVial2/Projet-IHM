

/**
 *
 * @author p2510730
 */
public class StringMoteur {
    public String majuscules(String s) {
        return s.toUpperCase();
    }

    public String minuscules(String s) {
        return s.toLowerCase();
    }

    public String ajoutDebut(String s1, String s2) {
        StringBuffer concaten = new StringBuffer(s2);
        return concaten.append(s1).toString();
    }

    public String ajoutFin(String s1, String s2) {
        StringBuffer concaten = new StringBuffer(s1);
        return concaten.append(s2).toString();
    }

    public String afficheMots(String s) {
        String[] tab;
        tab = s.split(" ");
        StringBuffer concaten = new StringBuffer();

        if (tab.length >= 0)
            concaten.append(tab[0]);

        for (int i = 1; i < tab.length; i++) {
            concaten.append(", ");
            concaten.append(tab[i]);
        }

        return concaten.toString();

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

    public String tailleSansEspaces(String s) {
        s = s.replace(" ", "");
        int nb = s.length();
        return String.valueOf(nb);
    }

    public String calculSimple(String s) {
        String[] tab;
        tab = s.split(" ");
        if (tab.length != 3) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int nb1 = Integer.parseInt(tab[0]);
        int nb2 = Integer.parseInt(tab[2]);


        switch (tab[1]) {

            case "+":
                return String.valueOf(nb1 + nb2);

            case "-":
                return String.valueOf(nb1 - nb2);

            case "/":
                if (nb2 == 0)
                    throw new ArithmeticException("Impossible de diviser par 0 !");
                else
                    return String.valueOf(nb1 / nb2);

            case "*":
                return String.valueOf(nb1 * nb2);

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
