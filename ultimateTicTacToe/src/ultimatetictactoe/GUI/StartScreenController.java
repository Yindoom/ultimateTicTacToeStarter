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
import ultimatetictactoe.BLL.GameManager;
import ultimatetictactoe.BLL.GameState;

/**
 * FXML Controller class
 *
 * @author Yindo
 */
public class StartScreenController implements Initializable {
    Model model = new Model();
    

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
       
        GameManager gm = new GameManager(new GameState());
        ttc.setModel(model);
        model.setGm(gm);
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void clickHvB(ActionEvent event) {
    }

    @FXML
    private void clickBvB(ActionEvent event) {
    }
    
}
