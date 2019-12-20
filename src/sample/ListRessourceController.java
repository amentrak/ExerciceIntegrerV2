package sample;

// afficher les ressouces mais j'ai pas su le faire

import be.ac.umons.Ressources;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ListRessourceController {
    private App app;

    @FXML
    private ChoiceBox<String> Choicebox = new ChoiceBox<>();

    @FXML
    private Label Stock;

    @FXML
    private Label Quantité;


    @FXML
    private void initialize() {

    }

    public void setApp(App app) {
        this.app = app;
        ObservableList<Ressources> ressources = app.getListRessources();
        ObservableList<String> items = FXCollections.observableArrayList();

        for (Ressources r : ressources) {
            items.add(r.getName());
            System.out.print(r.getName());
        }
        Choicebox.setItems(items);
    }
}

