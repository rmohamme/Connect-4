package com.example.ritzbitz.connect4;

import android.graphics.Color;
import android.widget.Button;

/**
 * Created by RitzBitz on 6/8/2016.
 */
public class Connect4View implements Connect4ViewInterface {
    Button[][] myButtons; //The matrix of buttons
    Button newGameButton; //The "New Game" button

    //CONSTANTS
    private static final char CROSS = 'X';
    private static final char CIRCLE = 'O';
    private static final char EMPTY = ' ';

    /**
     * Constructor. Initializes the instance variables.
     */
    public Connect4View(Button[][] myButtons, Button newGameButton) {
        //TODO: Initialize instance variables.
        this.myButtons = myButtons; //likely not right. I should add all values into my buttons; 
        this.newGameButton = newGameButton;
    }

    @Override
    public void update(int x, int y, char player) {
        //TODO: Complete this method.
        //Step 1: Update the text of button at index (x, y) to the player's symbol. In order to convert a char to a String, you can do (charVariable + "")
        //Example usage : myButtons[x][y].setText("" + player);
        //Step 2: Disable the button at index (x, y) from being clicked further.
        //Example usage : myButtons[x][y].setEnabled(false);
        //Step 3: Set text color of the button to BLUE for O or RED for X.
        //Example usage : myButtons[x][y].setTextColor(Color.BLUE);
        myButtons[x][y].setText("W");
        if (player == CROSS)
            myButtons[x][y].setTextColor(Color.RED);
        else
            myButtons[x][y].setTextColor(Color.YELLOW);

    }

    @Override
    public void showWinner(String winner) {
        //NOT REQUIRED TO BE WRITTEN FOR THIS LAB
    }

    @Override
    public void resetButtons() {
        //TODO: Complete this method.
        //Step 1: Iterate through the myButton matrix.
        //Step 2: Reset the text of the current button.
        //Example usage : myButtons[i][j].setText("");
        //Step 3: Reset the color of text for the current button
        //Example usage : myButtons[x][y].setTextColor(Color.BLACK);
        //Step 4: Make the button clickable again
        //Example usage : myButtons[x][y].setEnabled(true);
        //how long is the myButtons matrix? It's a seven by seven matrix
        //TODO; LOOP THROUGH THE MATRIX AND RESETE ALL THE BUTTONS TEXT TO EMPY
        for (int i = 0; i < myButtons.length - 1; i++) {
            for (int j = 0; j < myButtons[0].length; j++) {
                myButtons[i][j].setText("" + EMPTY);
            }
        }

    }

    @Override
    public void disableButtons() {
        //TODO: Complete this method.
        //Step 1: Iterate through the myButton matrix.
        //Step 2: Make the current button un-clickable
        //Example usage : myButtons[x][y].setEnabled(false);
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 8; j++) {
                myButtons[i][j].setEnabled(false);
            }
        }
    }

    @Override
    public void gameOver() {
        //NOT REQUIRED TO BE WRITTEN FOR THIS LAB
    }
}
