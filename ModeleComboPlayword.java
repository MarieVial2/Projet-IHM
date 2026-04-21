import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ModeleComboPlayword extends AbstractListModel<String> implements ComboBoxModel<String> {
    private List<String> tabStrings;
    private String selectedItem;

    public ModeleComboPlayword() {
        super();
        tabStrings = new ArrayList<String>();

    }

    public ModeleComboPlayword(String[] tab) {
        this();
        //this.tabStrings = Arrays.asList(tab);
        for(String string : tab) {
            tabStrings.add(string);
        }
        if (this.tabStrings.size() != 0) {
            //J'impose que l'item selectionné soit le premier de la liste
            setSelectedItem(this.tabStrings.get(0));
        }


    }

    @Override
    public String getSelectedItem() {
        return selectedItem;
    }
    @Override
    public void setSelectedItem(Object o) {
        if (o instanceof String) {
            selectedItem = (String) o;
        } else {
            selectedItem = null;
        }

    }

    @Override
    public String getElementAt (int indice) {
        String res = null;
        if (indice >= 0 && indice < this.getSize()) {
            res = tabStrings.get(indice);
        }
        return res;
    }

    @Override
    public int getSize() {
        return tabStrings.size();
    }

    public void ajoutDebutEtSelectionne(String s){
        if (s!=null) {
            tabStrings.add(0, s);
            fireIntervalAdded(this, 0, 0);
            setSelectedItem(this.tabStrings.get(0));
        }
    }

    public void supprimeSelectionne(){
        if (selectedItem!=null && tabStrings.contains(selectedItem)) {
            int position = tabStrings.indexOf(selectedItem);
            tabStrings.remove(position);
            fireIntervalRemoved(this, position, position);

            if(!tabStrings.isEmpty()){
                //Juste pour selectionner le premier element de la liste
                selectedItem = tabStrings.get(0);
            } else {
                selectedItem = null;
            }
        }


    }




}
