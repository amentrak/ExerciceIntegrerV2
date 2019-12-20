package be.ac.umons;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
public class Worker extends Personne {
    private ArrayList<Skill> listSkill =new ArrayList<>();
    private ArrayList<Tache> listTache =new ArrayList<>();
    public Worker(String name, int id, String password,ArrayList<Skill> listSkill) {
        super(name,id,password);
        this.listSkill=listSkill;

    }



    public ArrayList<Skill> getListSkill() {return listSkill; }
    public ArrayList<Tache> getListTache() {
        return listTache;
    }

    public void addSkill(Skill i){
        listSkill.add(i);
    }
    public void addTache(Tache i){
        listTache.add(i);
    }

    @Override
    public void update(Observable observable, Object o) {

    }
}
