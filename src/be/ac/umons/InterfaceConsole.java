package be.ac.umons;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;
/*
Projet par Valvekens Zowi, De Bruyn Maxime
 */
public class InterfaceConsole {

    public static void main(String[] args) {
        ArrayList<Personne> listPersonne = new ArrayList<>();
        ArrayList<Skill> listSkill = new ArrayList<>();
        ArrayList<Ressources> listRessources = new ArrayList<>();
        ArrayList<Tache> listTaches = new ArrayList<>();
        ArrayList<Team> listTeam = new ArrayList<>();
        ArrayList<Worker>listWorker = new ArrayList<>();
        Stock Bois = new Stock(("Bois"), 4);
        Stock Pierre = new Stock(("Pierre"), 4);
        Stock Eau = new Stock(("Eau"), 4);
        Ressources Ressources1 = new Ressources("Boite");
        Ressources1.addStock(Eau);
        Ressources1.addStock(Pierre);
        listSkill.add(new Skill("SKill1"));
        Worker worker1= new Worker("133",9,"456",listSkill);
        listWorker.add((new Worker("lol", 2, "1234",listSkill)));

        listTeam.add(new Team("ttt", worker1,listWorker) );

        listPersonne.add(new Worker("Loic", 1, "1234",listSkill));
        listPersonne.add(new Worker("Louis", 2, "1234",listSkill));
        listPersonne.add(new Worker("Loup", 3, "1234",listSkill));
        listPersonne.add(new Worker("Lol", 4, "1234",listSkill));
        listPersonne.add(new Worker("Truc", 5, "1234",listSkill));
        listPersonne.add(new Manager("Manager", 1, "1234"));
        listRessources.add(Ressources1);
        Date aujourdhui = new Date(2019, 8, 15);
        Tache Tache1=new Tache("name", "desc", listRessources, 8, aujourdhui, listSkill);
        // test pour verifier que algorithme fonctionne, la date defin et debut est bien affecté, la team et la quantité des ressources est modifier
        Algo1 Algo = new Algo1();
        Algo.Assignement(Tache1, listTeam);
        System.out.println("Date de début");
        System.out.println(Tache1.getDatedébut());
        System.out.println("Date de fin");
        System.out.print(Tache1.getDatefin());
        System.out.println("Nom de la team");
        System.out.print(Tache1.getÉquipe().getName());
        System.out.print(Pierre.getQuantité());
        // fin du test d'affection

        int variable = 1;
        int j = 1;
        // pour afficher les ressources
        System.out.println("Afficher les ressource :");
        for(Ressources r:listRessources){
            System.out.println(r.getName());
        }
        // pour afficher les taches
        System.out.println("Afficher les taches :");
        for (Tache t : listTaches) {
            System.out.println(t.getName());
        }
        // system de connection
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

                    Tache Tache2 = new Tache();
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
                        Algo1 Algo1 = new Algo1();
                        Algo1.Assignement(Tache2, listTeam);
                    } else {System.out.print("Les autres algo sont pas encore optionnel");}
                    }
                    if (role.equals("worker")) {
                        System.out.println("Voici votre liste de Tache");
                        ArrayList<Tache> listTache = new ArrayList<>();
                        for (Tache k : listTache) {
                            System.out.print(k.getName());
                            System.out.println(k.getDatedébut());
                        }
                    } else {
                        System.out.println("else");
                    }

                    }

                }
            }
        }




