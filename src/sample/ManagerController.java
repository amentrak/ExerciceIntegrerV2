package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;


public class ManagerController {

    @FXML
    private Button AjouterTacheButton;

    @FXML
    private Button AfficherRessourcesButton;

    @FXML
    private Button AfficherTacheButton;

    @FXML
    void AfficherRessources(ActionEvent event)throws IOException {
        Parent sample = FXMLLoader.load(getClass().getResource("SceneListRessource.fxml"));
        Scene Manager = new Scene(sample);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(Manager);
        window.show();
    }

    @FXML
    void AjouterTache(ActionEvent event) throws IOException{
        Parent sample = FXMLLoader.load(getClass().getResource("SceneAjouteTache.fxml"));
        Scene Manager = new Scene(sample);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(Manager);
        window.show();
    }

    @FXML
    void afficherTache(ActionEvent event) throws IOException{
        Parent sample = FXMLLoader.load(getClass().getResource("SceneListTache.fxml"));
        Scene Manager = new Scene(sample);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(Manager);
        window.show();
    }

}
