package com.example.fibonacci;

import com.example.fibonacci.model.Management;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private Management managementModel = new Management();
    //private String mod;

    @FXML
    private TextArea myTextArea;

    @FXML
    private Button myButton;

    @FXML
    private Label myResult;

    @FXML
    private ChoiceBox<String> myChoiceBox;

    ObservableList<String> optionsList = FXCollections.observableArrayList("Enter value", "Enter position");
    @FXML
    public void click(ActionEvent event) {
        String mod = myChoiceBox.getValue();
        int wanted = Integer.parseInt(myTextArea.getText().replaceAll("\n", System.getProperty("line.separator")));
        if(mod == "Enter value") {
            myResult.setText(managementModel.orderByNumManager(wanted) + "");
        } else if (mod == "Enter position") {
            myResult.setText(managementModel.numByOrderManager(wanted) + "");
        } else {
            System.out.println("error");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        myChoiceBox.setItems(optionsList);
    }
}