/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimatetictactoe.GUI;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import ultimatetictactoe.BLL.GameManager;

/**
 *
 * @author Yindo
 */
public class TicTacToeController implements Initializable {

    
    private Node parentNode; // variable to save its parent
    
    //save the coordinates X,Y of the grid
    private int GridX;
    private int GridY;
    
    private Label label;
    @FXML
    private GridPane MainGrid;
    @FXML
    private AnchorPane MainAnchor;
    @FXML
    private GridPane grid_0_0;
    @FXML
    private GridPane grid_1_0;
    @FXML
    private GridPane grid_2_0;
    @FXML
    private GridPane grid_0_1;
    @FXML
    private GridPane grid_1_1;
    @FXML
    private GridPane grid_2_1;
    @FXML
    private GridPane grid_0_2;
    @FXML
    private GridPane grid_1_2;
    @FXML
    private GridPane grid_2_2;
    @FXML
    private StackPane SPane;
    @FXML
    private GridPane subGrid;
    
    private void handleButtonAction(ActionEvent event) {
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    private void dragOverAction(Node n, int x, int y) {  // universal method for drag over
        
    }
    
    @FXML
    private void dragOver(MouseEvent event) {
        
        Node n = (Node)event.getSource();
        String id = n.getId();
        String[] parts = id.split("_");
        GridX = Integer.parseInt(parts[2]);
        GridY = Integer.parseInt(parts[1]);    
        
        //<editor-fold defaultstate="collapsed" desc="switch method for alignment of the grid when mouseover">
        switch (GridY) {
            case 0:
                switch (GridX){
                    case 0: StackPane.setAlignment(subGrid, Pos.TOP_LEFT); break;
                    case 1: StackPane.setAlignment(subGrid, Pos.CENTER_LEFT); break;
                    case 2: StackPane.setAlignment(subGrid, Pos.BOTTOM_LEFT); break;
                }
                
                break;
            case 1:
                switch (GridX){
                    case 0: StackPane.setAlignment(subGrid, Pos.TOP_CENTER); break;
                    case 1: StackPane.setAlignment(subGrid, Pos.CENTER); break;
                    case 2: StackPane.setAlignment(subGrid, Pos.BOTTOM_CENTER); break;
                }
                break;
            case 2:
                switch (GridX){
                    case 0: StackPane.setAlignment(subGrid, Pos.TOP_RIGHT); break;
                    case 1: StackPane.setAlignment(subGrid, Pos.CENTER_RIGHT); break;
                    case 2: StackPane.setAlignment(subGrid, Pos.BOTTOM_RIGHT); break;
                }
                break;
        }
        
        
//</editor-fold>

        subGrid.toFront();
    }

    @FXML
    private void dragExit(MouseEvent event) {
        /* not u    @FXML
    private void clickTile(ActionEvent event) {
    }

    @FXML
    private void mouseExit(MouseEvent event) {
    }

sed needs to be deleted*/
    }

    @FXML
    private void mouseExit(MouseEvent event) {
        subGrid.toBack();
    }

    @FXML
    private void clickTile(ActionEvent event) {
//        try
//        {
//            Integer row = GridPane.getRowIndex((Node) event.getSource());
//            Integer col = GridPane.getColumnIndex((Node) event.getSource());
//            int r = (row == null) ? 0 : row;
//            int c = (col == null) ? 0 : col;
//            int player = game.getNextPlayer();
//            if (game.play(c, r))
//            {
//                if (game.isGameOver())
//                {
//                    int winner = game.getWinner();
//                    displayWinner(winner);
//                }
//                else
//                {
//                    Button btn = (Button) event.getSource();
//                    String xOrO = player == 0 ? "X" : "O";
//                    btn.setText(xOrO);
//                    setPlayer();
//                }
//            }
//        } catch (Exception e)
//        {
//            System.out.println(e.getMessage());
//        } 
            Integer row = GridPane.getRowIndex((Node) event.getSource());
            Integer col = GridPane.getColumnIndex((Node) event.getSource());
            
    }

    void setGm(GameManager.GameMode gameMode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
