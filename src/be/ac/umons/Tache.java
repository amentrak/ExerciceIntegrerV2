package be.ac.umons;

import java.util.ArrayList;
import java.util.Observable;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Date;

public class Tache extends Observable {
    private String name;
    private String description;

    private ArrayList<Ressources> listRessources = new ArrayList<>();
    private Team équipe;
    private ArrayList<Skill> listSkill = new ArrayList<>();
    private ArrayList<Worker> travailleurs = new ArrayList<>();
    private int durée;
    private Date deadline;
    private Date datedébut;
    private Date datefin;

    public Tache(){}
    public Tache(String name, String description, ArrayList<Ressources> listRessources, int durée, Date deadline, ArrayList<Skill> listSkill) {
        this.name = name;
        this.description = description;
        this.durée = durée;
        this.listRessources = listRessources;
        this.listSkill = listSkill;
        this.deadline = deadline;

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<Ressources> getListRessources() {
        return listRessources;
    }

    public Team getÉquipe() {
        return équipe;
    }

    public ArrayList<Skill> getListSkill() {
        return listSkill;
    }

    public Date getDatedébut() {
        return datedébut;
    }

    public void setDatefin(Date datefin) {
        this.datefin = datefin;
    }
    public Date getDatefin() {
        return datefin;
    }

    public void setDatedébut(Date datedébut) {
        this.datedébut = datedébut;
    }
    public ArrayList<Worker> getTravailleurs() {
        return travailleurs;
    }

    public Date getDeadline() {
        return deadline;
    }

    public int getDurée() {
        return durée;
    }

    public void addRessources(Ressources i) {
        listRessources.add(i);
    }

    public void addSkills(Skill i) {
        listSkill.add(i);
    }

    public void addtravailleurs(Worker i) {
        travailleurs.add(i);
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDurée(int durée) {
        this.durée = durée;
    }

    public void setListRessources(ArrayList<Ressources> listRessources) {
        this.listRessources = listRessources;
    }

    public void setListSkill(ArrayList<Skill> listSkill) {
        this.listSkill = listSkill;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTravailleurs(ArrayList<Worker> travailleurs) {
        this.travailleurs = travailleurs;
    }

    public void setÉquipe(Team équipe) {
        this.équipe = équipe;
    }
    public String toString(){
        return name;
    }
}
