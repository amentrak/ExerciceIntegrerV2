package be.ac.umons;
import java.util.ArrayList;

public class Projet {
    private String name;
    ArrayList<Tache> listTache;
    Boolean archivage;
    public Projet (String name){
        this.name =name;
    }
    public String getName() {
        return name;
    }

    public ArrayList<Tache> getListTache() {
        return listTache;
    }
    public void addTache(Tache i){
        listTache.add(i);
    }
    public String toString(){
        return name;
    }
}
