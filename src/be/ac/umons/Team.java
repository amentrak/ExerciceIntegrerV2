package be.ac.umons;

import java.util.ArrayList;

public class Team {
    private String name;
    private Worker namechef;
    private ArrayList<Worker> listWorker = new ArrayList<>();
    private ArrayList<Skill> listSkill = new ArrayList<>();

    public Team(String name, Worker namechef, ArrayList<Worker> listWorker){
        this.name = name;
        this.namechef = namechef;
        this.listWorker = listWorker;
        for(int i = 0; i < listWorker.size(); i++) {
            for (int j = 0; j < listWorker.get(i).getListSkill().size(); j++) {
                listSkill.add(listWorker.get(i).getListSkill().get(j));
            }
        }
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

    public ArrayList<Skill> getListSkill() {
        return listSkill;
    }



}
