package sample;

import be.ac.umons.*;
import javafx.application.Application;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;

import java.time.chrono.Chronology;
import java.util.ArrayList;
import java.util.Date;


public class App extends Application {

    private ObservableList<Personne> listPersonne = FXCollections.observableArrayList();
    private ObservableList<Skill> listSkill= FXCollections.observableArrayList();
    private ObservableList<Ressources> listRessources= FXCollections.observableArrayList();
    private ObservableList<Tache> listTaches= FXCollections.observableArrayList();
    private ArrayList<Skill> listS= new ArrayList<>();
    private String name= "Loic";
    public App() {

        Stock Bois = new Stock(("Bois"),4);
        Stock Pierre = new Stock(("Pierre"),4);
        Stock Eau = new Stock(("Eau"),4);
        Ressources Ressources1= new Ressources("Boite");
        Ressources1.addStock(Eau);
        Ressources1.addStock(Pierre);
        listS.add(new Skill("SKill1"));
        listSkill.add(new Skill("SKill1"));
        Worker Worker1= new Worker("lou",1,"1234",listS);
        Team Team1= new Team("Team1",Worker1);
        listPersonne.add(new Worker("Loic",1,"1234",listS));
        listPersonne.add(new Worker("Louis",2,"1234",listS));
        listPersonne.add(new Worker("Loup",3,"1234",listS));
        listPersonne.add(new Worker("Lol",4,"1234",listS));
        listPersonne.add(new Worker("Truc",5,"1234",listS));
        listPersonne.add(new Manager("Manager",1,"1234"));
        listRessources.add(Ressources1);
        //listTaches.add(new Tache("TAche1","Lolilol",Agenda,Team1));
    }

    public ObservableList<Personne> getPersonData() {
        return listPersonne;
    }
    public ObservableList<Skill> getListSkill() {
        return listSkill;
    }
    public ObservableList<Ressources> getListRessources() {
        return listRessources;
    }
    public ObservableList<Tache> getListTaches() {
        return listTaches;
    }


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Page de connexion");
        primaryStage.setScene(new Scene(root, 600, 300));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}

