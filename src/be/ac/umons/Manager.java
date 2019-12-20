package be.ac.umons;

import java.util.Observable;
import java.util.Observer;

public class Manager extends Personne{

    public Manager(String name,int id,String password){
        super(name,id,password);
    }

    @Override
    public void update(Observable observable, Object o) {
        if (observable instanceof Tache) {
            if (o == "Tache.setName") {
                System.out.println("Tache.setName : " + ((Tache) observable).getName());
            }
            if (o == "Tache.setListRessource") {
                System.out.println("Tache.setListRessource : " + ((Tache) observable).getListRessources());
            }
            if (o == "Tache.setListSkill") {
                System.out.println("Task.setListSkill : " + ((Tache) observable).getListSkill());
            }
        }
    }

}
