package be.ac.umons;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class InterfaceConsole {

    public static void main(String[] args) {
        ArrayList<Personne> listPersonne = new ArrayList<>();
        ArrayList<Skill> listSkill = new ArrayList<>();
        ArrayList<Ressources> listRessources = new ArrayList<>();
        Stock Bois = new Stock(("Bois"), 4);
        Stock Pierre = new Stock(("Pierre"), 4);
        Stock Eau = new Stock(("Eau"), 4);
        Ressources Ressources1 = new Ressources("Boite");
        Ressources1.addStock(Eau);
        Ressources1.addStock(Pierre);
        Worker Worker1 = new Worker("Lou", 1, "456");
        Team Team1 = new Team("Team1", Worker1);
        AgendaEntry Agenda = new AgendaEntry(1);
        listPersonne.add(new Worker("Loic", 1, "1234"));
        listPersonne.add(new Worker("Louis", 2, "1234"));
        listPersonne.add(new Worker("Loup", 3, "1234"));
        listPersonne.add(new Worker("Lol", 4, "1234"));
        listPersonne.add(new Worker("Truc", 5, "1234"));
        listPersonne.add(new Manager("Manager", 1, "1234"));
        listSkill.add(new Skill("SKill1"));
        listRessources.add(Ressources1);

        int variable = 1;
        int j = 1;


        System.out.println("Identifiez vous, donnez votre nom et votre mot de passe et donner votre roler( manager,worker, chef équipe");
        Scanner lectureClavier = new Scanner(System.in);
        String name = lectureClavier.next();
        String password = lectureClavier.next();
        String role = lectureClavier.next();

        for (Personne i : listPersonne) {
            if (i.getName().equals(name) && i.getPassword().equals(password)) {
                System.out.println(role);
                if (role.equals("manager")) {
                    System.out.println("Connexion réussie");

                    Tache Tache1 = new Tache();
                    System.out.println("Créer une nouvelle Tache");
                    System.out.println("Entrez son nom: ");
                    Scanner lectureClavier1 = new Scanner(System.in);
                    Tache1.setName(lectureClavier1.next());
                    System.out.println("Entrez sa description: ");
                    Tache1.setDescription(lectureClavier1.next());
                    System.out.println("Entrez sa durée: ");
                    Tache1.setDurée(lectureClavier1.nextInt());
                    System.out.println("Entrez sa deadline: ");
                    Tache1.setDeadline(Date.valueOf(lectureClavier1.next()));
                    System.out.println("Entrez ses ressources: ");
                    String nomRessoucers = lectureClavier1.next();
                    for (Ressources r : listRessources) {
                        if (nomRessoucers == r.getName()) {
                            Tache1.addRessources(r);
                        } else {
                            System.out.println("Ressources introuvable: ");
                        }
                    }
                    System.out.println("Entrez ses skills: ");
                    String nomSkill = lectureClavier1.next();
                    for (Skill s : listSkill) {
                        if (nomSkill == s.getName()) {
                            Tache1.addSkills(s);
                        } else {
                            System.out.println("Skill introuvable: ");
                        }
                    }
                    System.out.println("Choissisez entre l'algo1 ou algo2 pour affecter la tache ");
                    String nomAlgo = lectureClavier1.next();
                    if (nomAlgo.equals("Algo1")) {
                        //  appeler le startegy
                    } else {// appeler le strategy}
                    }
                    if (role.equals("worker")) {
                        System.out.println("Voici votre liste de Tache");
                        ArrayList<Tache> listTache = new ArrayList<>();
                        for (Tache k : listTache) {
                            System.out.print(k.getName());
                            System.out.println(k.getAgenda().getDatedébut());
                        }
                    } else {
                        System.out.println("else");
                    }
                }
                if (role.equals("worker")){
                    System.out.println("Votre liste de tache :");
                    /*ArrayList<Tache> T =
                    for (Tache t:T){
                        System.out.print(i);
                    }*/

                }
            }
        }
    }

}

