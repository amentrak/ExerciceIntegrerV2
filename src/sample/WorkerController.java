package sample;

import be.ac.umons.*;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.util.Date;

public class WorkerController  {
    private  App app;
    @FXML
    private TableView<Tache> TacheTable;

    @FXML
    private TableColumn<Tache, String> TacheNameColumn;

    @FXML
    private TableColumn<Tache, Date> TacheDateDeDébutColumn;

    @FXML
    private Label TacheNameLabel;

    @FXML
    private Label DescriptionLabel;

    @FXML
    private Label DatedefinLabel;

    public WorkerController() {
    }
    public void setApp(App app) {
        this.app = app;
        TacheTable.setItems(app.getListTaches());

    }
    private void showPersonDetails(Tache tache) {
        if (tache != null) {
            TacheNameLabel.setText(tache.getName());
            DescriptionLabel.setText(tache.getDescription());
            //DatedefinLabel.setText(String.valueOf(tache.getDurée().getDatedébut()));
        } else {
            TacheNameLabel.setText("rien");
            DescriptionLabel.setText("okay");
            DatedefinLabel.setText("lol");
        }
    }
    @FXML
    private void initialize() {
       /* TacheNameColumn.setCellValueFactory(cellData -> cellData.getValue().getName());
        TacheDateDeDébutColumn.setCellValueFactory(cellData -> cellData.getValue().getDurée().getDatedébut());
        showPersonDetails(null);*/
        // Listen for selection and show the details

        TacheTable.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> showPersonDetails(newValue)
        );
    }



}
