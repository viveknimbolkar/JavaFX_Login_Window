package sample;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public class Controller {

    @FXML
    private TextField usernm;
    @FXML
    private TextField pwd;
    @FXML
    private Button btn,cancel;
    @FXML
    private Label l1;

    public void login(ActionEvent e){
        if (usernm.getText().equals("admin") && pwd.getText().equals("123")){
            l1.setText("Login successful!");
        }else {
            l1.setText("Login fails!");
        }
    }

    public void exit(ActionEvent ex){
        System.exit(0);
    }
}
