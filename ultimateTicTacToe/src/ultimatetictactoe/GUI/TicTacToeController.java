/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimatetictactoe.GUI;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Yindo
 */
public class TicTacToeController implements Initializable {
    
    private Label label;
    @FXML
    private Button b00;
    @FXML
    private Button b10;
    @FXML
    private Button b01;
    @FXML
    private Button b11;
    @FXML
    private Button b20;
    @FXML
    private Button b21;
    @FXML
    private Button b02;
    @FXML
    private Button b12;
    @FXML
    private Button b22;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
