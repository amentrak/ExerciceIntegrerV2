package sample;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.stage.Window;

public class sampleController {


    private  App app;
    @FXML
    private PasswordField password;

    @FXML
    private TextField name;

    @FXML
    private CheckBox ManagerCheckBox;

    @FXML
    private CheckBox WorkerCheckBox;

    @FXML
    private Button connection;

    public void setApp(App app) {
        this.app = app;
    }

    //ArrayList<Personne> P =app.getPersonData();
    @FXML
    void handleSubmitButton(ActionEvent event) throws IOException {
        Window owner = connection.getScene().getWindow();

        if (name.getText().isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error", "Name is required");
            return;
        }
        if (password.getText().isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error", "Password is required");
            return;
        }
        if (ManagerCheckBox.isSelected()) {

            if (name.getText().equals("1") && password.getText().equals("1")) {
                    Parent sample = FXMLLoader.load(getClass().getResource("SceneManager.fxml"));
                    Scene Manager = new Scene(sample);
                    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

                    window.setScene(Manager);
                    window.show();
                }
                else {
                    AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error", "Nom ou mot de passe nom valide");
                    return;
                }
            }
        if (WorkerCheckBox.isSelected()) {

            if (name.getText().equals("1") && password.getText().equals("1")) {
                Parent sample = FXMLLoader.load(getClass().getResource("SceneWorker.fxml"));
                Scene Worker = new Scene(sample);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

                window.setScene(Worker);
                window.show();
            }
            else {
                AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error", "Nom ou mot de passe nom valide");
                return;
            }
        }
    }
}



