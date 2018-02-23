package game;

import bot.IBot;
import move.IMove;

/**
 *
 * @author mjl
 */
public class GameManager {
    
    private final IGameState currentState;
    private int currentPlayer = 0; //player0 == 0 && player1 == 1
    private Boolean vsBot = false; //player1 will be a IBot
    private IBot bot = null;
    private IBot bot2 = null;

    /**
     * Set's the currentState so the game can begin.
     * Game expected to be played Human vs Human
     * @param currentState Current game state, usually an empty board, 
     * but could load a saved game.
     */
    public GameManager(IGameState currentState) {
        this.currentState = currentState;
    }
    
    /**
     * Set's the currentState so the game can begin.
     * Game expected to be played Human vs Bot
     * @param currentState Current game state, usually an empty board, 
     * but could load a saved game.
     * @param bot The bot to play against in vsBot mode.
     */
    public GameManager(IGameState currentState, IBot bot) {
        this.currentState = currentState;
        this.vsBot = true;
        this.bot = bot;
    }
    
    /**
     * Set's the currentState so the game can begin.
     * Game expected to be played Bot vs Bot
     * @param currentState Current game state, usually an empty board, 
     * but could load a saved game.
     * @param bot The first bot to play.
     * @param bot2 The second bot to play.
     */
    public GameManager(IGameState currentState, IBot bot, IBot bot2) {
        this.currentState = currentState;
        this.bot = bot;
        this.bot2 = bot2;
    }
    
    /**
     * User input driven Update
     * @param move The next user move
     * @return Returns true if the update was successful, false otherwise.
     */
    public Boolean UpdateGame(IMove move)
    {
        //Verify the new move
        if(!VerifyMoveLegality(move)) 
        { 
            return false; 
        }
        
        //Update the currentState
        UpdateBoard(move);
        UpdateMacroboard(move);
        
        //Update currentPlayer
        currentPlayer = (currentPlayer + 1) % 2;
            
        //Check if player is bot, if so, get bot input and update the state based on that.
        if(currentPlayer == 1 && vsBot)
        {
            //Check bot is not equal to null, and throw an exception if it is.
            assert(bot != null);
            
            IMove botMove = bot.doMove(currentState);
            
            //Be aware that your bots might perform illegal moves,
            //so you may get a false, even if the user move was okay.
            return UpdateGame(botMove);
        }
        
        return true;
    }
    
    /**
     * Non-User driven input, e.g. an update for playing bots against each other.
     */
    public void UpdateGame()
    {
        //Check bot is not equal to null, and throw an exception if it is.
        assert(bot != null);
        assert(bot2 != null);
        
        //TODO: Implement a bot vs bot Update.
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    private Boolean VerifyMoveLegality(IMove move)
    {
        //Test if the move is legal        
        return currentState.getField().isInActiveMicroboard(move.getX(), move.getY());
    }
    
    private void UpdateBoard(IMove move)
    {
       //TODO: Update the board to the new state 
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    private void UpdateMacroboard(IMove move)
    {
       //TODO: Update the macroboard to the new state 
       throw new UnsupportedOperationException("Not supported yet."); 
    }
}
