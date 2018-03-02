/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimatetictactoe.GUI;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import sun.security.x509.X400Address;
import ultimatetictactoe.BLL.GameManager;

/**
 *
 * @author Yindo
 */
public class TicTacToeController implements Initializable {

    GameManager gm;
    
    private Node parentNode; // variable to save its parent
    
    //save the coordinates X,Y of the grid
    private int GridX;
    private int GridY;
    
    Node n;
    
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
    @FXML
    private Button btn0_0;
    @FXML
    private Button btn1_0;
    @FXML
    private Button btn2_0;
    @FXML
    private Button btn0_1;
    @FXML
    private Button btn1_1;
    @FXML
    private Button btn2_1;
    @FXML
    private Button btn0_2;
    @FXML
    private Button button1_2;
    @FXML
    private Button btn2_2;
    
    private String XorO = "X";
    
    
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
        
        n = (Node)event.getSource();
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


        
        
        GridPane smallGrid = (GridPane) n;
        
        ObservableList<Node> smallGridChildren = smallGrid.getChildren();
        ObservableList<Node> subGridChildren = subGrid.getChildren();
        
        
        
         
        int counter = 0;
        for (Node node : subGridChildren) {
            counter++;
            Button subButton = (Button) node;
            subButton.setText(null);
            if(counter == 9)
                break;
        }
        
        int index = 0;
        
        for (Node node : smallGridChildren) {
            if(node.getClass()==Button.class)
            {
            Button smallButton = (Button) node;
                if(smallButton.getText()== "X" || smallButton.getText()== "O") {
                    
                    Button subButton = (Button) subGridChildren.get(index);
                    subButton.setFont(Font.font(30));
                    subButton.setText(smallButton.getText());
                }
            index++;
          //  if(index == 9) // i dont understand why the gridpane has an extra children it should be only 9 buttons.... ask teacher
            //    break; // if i dont stop the loop on its 9th node it will run the for loop again and show "javafx.scene.Group cannot be cast to javafx.scene.control.Button" exception
        }}
        
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
        Integer row = GridPane.getRowIndex((Node) event.getSource());
        Integer col = GridPane.getColumnIndex((Node) event.getSource());


        Integer row2 = GridPane.getRowIndex(n);
        Integer col2 = GridPane.getColumnIndex(n);


        ObservableList<Node> mainGridChildren = MainGrid.getChildren();
        ObservableList<Node> subGridChildren = subGrid.getChildren();
        int index = 0;
        for (Node node : mainGridChildren) {
            if( GridPane.getRowIndex(node) == row2 && GridPane.getColumnIndex(node) == col2 ){

                GridPane smallGrid = (GridPane) node;
                ObservableList<Node> smallGridChrildren = smallGrid.getChildren();
                   
                for (Node node1 : smallGridChrildren) {
                    if( GridPane.getRowIndex(node1) == row && GridPane.getColumnIndex(node1) == col) {
                    Button b = (Button) node1;
                    
                    b.setFont(Font.font(32));
                    b.setText(XorO);
                    Button button = (Button) subGridChildren.get(index);
                    button.setFont(Font.font(30));
                    button.setText(XorO);
                    
                    if ("X".equals(XorO)) //just to swithfrom X to O 
                        XorO = "O";       //will be deleted later because we have to use the interfaces
                    else
                        XorO = "X";
                    break;
                    }
                    index++;
                }   
                break;
            }
        }        
    }

    public void setGm(GameManager gm) {
        this.gm = gm;
    }


    
}
