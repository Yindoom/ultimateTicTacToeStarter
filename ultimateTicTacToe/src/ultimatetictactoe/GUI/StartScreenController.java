/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimatetictactoe.GUI;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import static ultimatetictactoe.BLL.GameManager.GameMode.HumanVsHuman;

/**
 * FXML Controller class
 *
 * @author Yindo
 */
public class StartScreenController implements Initializable {
    
    TicTacModel model = new TicTacModel();
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void clickHvH(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("TicTacToe.fxml"));
        TicTacToeController ttc = new TicTacToeController();
        ttc.setGm(HumanVsHuman);
        /*Parent root = FXMLLoader.load(getClass().getResource("TicTacToe.fxml"));
        
        
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        
        stage.setScene(scene);
        stage.show();*/
    }

    @FXML
    private void clickHvB(ActionEvent event) {
    }

    @FXML
    private void clickBvB(ActionEvent event) {
    }
    
}
