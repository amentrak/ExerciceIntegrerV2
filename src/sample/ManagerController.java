package sample;

import be.ac.umons.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;
import java.util.ArrayList;

public class ManagerController {
    ArrayList<Ressources> listRessources = new ArrayList<>();
    ArrayList<Skill> listSkill = new ArrayList<>();
    Skill Skill2 = new Skill("Skill1");
    private  App app;

    @FXML
    private Label DateDeDébutLabel;

    @FXML
    private Label DateDeFin;

    @FXML
    private TextField NomLabel;

    @FXML
    private TextField DescriptionLabel;

    @FXML
    private DatePicker DateDeDébut;

    @FXML
    private DatePicker DateDeFinLabel;

    @FXML
    private Button ButtonRessources;

    @FXML
    private ChoiceBox<Ressources> ResscourcesChoiceBox;

    @FXML
    private Button SkillButton;

    @FXML
    private ChoiceBox<Skill> SkillChoiceBox;

    @FXML
    private ChoiceBox<Team> TeamChoiceBox;

    @FXML
    private CheckBox Strategy1;

    @FXML
    private CheckBox Strategy2;

    @FXML
    private Button Affection;

    public void setApp(App app) {
        this.app = app;

        SkillChoiceBox.setItems(app.getListSkill());
        ResscourcesChoiceBox.setItems(app.getListRessources());

    }
    public void ManagerController(){}



    @FXML
    void handleButtonRessources(ActionEvent event) {
        listRessources.add(ResscourcesChoiceBox.getValue());

    }

    @FXML
    void handleButtonSkill(ActionEvent event) {
        listSkill.add(SkillChoiceBox.getValue());


    }

    @FXML
    public void handleAffectation(ActionEvent event) throws IOException {
        //AgendaEntry AgendaEntry1 = new AgendaEntry(1, DateDeDébut.getChronology(), DateDeFinLabel.getChronology());
        //Tache Tache1 = new Tache(NomLabel.getText(), DescriptionLabel.getText(), AgendaEntry1, TeamChoiceBox.getValue());
        for (Ressources i : listRessources) {
            //Tache1.addRessources(i);
        }
        for (Skill i : listSkill) {
            //Tache1.addSkill(i);
        }
        //choisir entre les deux strategy
    }

}

