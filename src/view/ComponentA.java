package view;

import controller.RowGameController;
import model.RowGameModel;

import javax.swing.*;

public class ComponentA implements View{
    private RowGameController rowGameController;

    public ComponentA(RowGameController rowGameController) {
        this.rowGameController = rowGameController;
    }
    @Override
    public void update(RowGameModel model) {
        if (model.getFinalResult()!=null){
            if (model.getFinalResult().equals("Player 2 wins!")||model.getFinalResult().equals("Player 1 wins!")||model.getFinalResult().equals("Game ends in a draw")){
                for(int row = 0; row<3; row++) {
                    for(int column = 0; column<3 ;column++) {
                        rowGameController.gameView.blocks[row][column].setText(model.blocksData[row][column].getContents());
                    }
                }
           return;
            }
        }

        for(int row = 0; row<3; row++) {
            for(int column = 0; column<3 ;column++) {
               rowGameController.gameView.blocks[row][column].setText(model.blocksData[row][column].getContents());
               rowGameController.gameView.blocks[row][column].setEnabled(model.blocksData[row][column].getIsLegalMove());
            }
        }

    }
}
