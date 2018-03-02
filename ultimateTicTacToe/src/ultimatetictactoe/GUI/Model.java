/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimatetictactoe.GUI;

import ultimatetictactoe.BLL.GameManager;
import ultimatetictactoe.BLL.GameState;
import ultimatetictactoe.BLL.IGameState;
import ultimatetictactoe.BLL.Move;

/**
 *
 * @author Yindo
 */
public class Model {
    GameManager gm;
    
    void setGm(GameManager gm) {
     this.gm = gm;   
    }

    IGameState getGameState() {
        return null;
    }
    void clearBoard() {
        
    }

    void move(Integer row2, Integer col2) {
        Move move = new Move();
        System.out.println(move.getX());
        gm.UpdateGame(move);
    }
    
}
