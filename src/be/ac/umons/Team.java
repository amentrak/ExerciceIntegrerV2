package be.ac.umons;

import java.util.ArrayList;

public class Team {
    public String name;
    public Worker namechef;
    ArrayList<Worker> listWorker= new ArrayList<>();
    private ArrayList<Skill> listSkill = new ArrayList<>();

    public Team(String name, Worker namechef){
        this.name=name;
        this.namechef=namechef;
    }
    public String getName() {
        return name;
    }

    public Worker getNamechef() {
        return namechef;
    }

    public ArrayList<Worker> getListWorker() {
        return listWorker;
    }
    public void addWorker(Worker i){
        listWorker.add(i);
    }
    public String toString(){
        return name;
    }
    public ArrayList<Skill> getListSkill() {
        return listSkill;
    }
}
