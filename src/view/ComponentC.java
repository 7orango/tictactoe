package view;

import controller.RowGameController;
import model.RowGameModel;

public class ComponentC implements View{
    private RowGameController rowGameController;

    public ComponentC(RowGameController rowGameController) {
        this.rowGameController = rowGameController;
    }

    @Override
    public void update(RowGameModel model) {
        if (model.getFinalResult()==null){
            rowGameController.gameView.playerturn.setText("Player 1 to play 'X'");
        }
        if(model.movesLeft%2 == 1) {
            rowGameController.gameView.playerturn.setText("'X': Player 1");
        } else{
            rowGameController.gameView.playerturn.setText("'O': Player 2");
        }
        if (model.getFinalResult()!=null){
            rowGameController.gameView.playerturn.setText(model.getFinalResult());
        }
    }
}
