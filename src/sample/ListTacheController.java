package sample;

import be.ac.umons.Tache;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ListTacheController {

    @FXML
    private TableView<?> TacheTable;

    @FXML
    private TableColumn<Tache, String> TacheNameColumn;

    @FXML
    private TableColumn<Tache, String> TacheDateDeDébutColumn;

    @FXML
    private Label TacheNameLabel;

    @FXML
    private Label DescriptionLabel;

    @FXML
    private Label DatedefinLabel;

}