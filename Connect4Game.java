package com.example.ritzbitz.connect4;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by RitzBitz on 6/7/2016.
 */
public class Connect4Game {

    Connect4ViewInterface view;
    char[][] gameBoard;
    char currentPlayer;
    int movesPlayed;
    char winner;

    //CONSTANTS
    private static final char CROSS = 'X';
    private static final char CIRCLE = 'O';
    private static final char EMPTY = ' ';

    public Connect4Game(Connect4ViewInterface view) {
        //TODO: initialize the variables
        this.view = view;
        gameBoard = new char[6][7];
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[0].length; j++) {
                gameBoard[i][j] = EMPTY;
            }
        }
        currentPlayer = CROSS;
        movesPlayed = 0;
    }

    public void newGame() {
        //call reset
        reset();
    }

    public void reset() {
        //TODO
        //resets the gameBoard when the game is over or when the new game button is pressed
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[0].length; j++) {
                gameBoard[i][j] = EMPTY;
            }
        }
        currentPlayer = CROSS;
        movesPlayed = 0;
        view.resetButtons();
    }

    public boolean checkWinner() {
        //checks if the player won the game
        for (int j = 0; j < gameBoard[0].length; j++) {
            for (int i = 0; i < 3; i++) {
                if (gameBoard[i][j] == currentPlayer &&
                        gameBoard[i + 1][j] == currentPlayer
                        && gameBoard[i + 2][j] == currentPlayer &&
                        gameBoard[i + 3][j] == currentPlayer) {
                    System.out.println(currentPlayer + " has won!");
                    return true;
                }
            }
        }

        //checks horizontal starting at left corner
        for (int i = gameBoard.length - 1; i >= 0; i--) {
            for (int j = 0; j < gameBoard[0].length - 3; j++) {
                if (gameBoard[i][j] == currentPlayer &&
                        gameBoard[i][j + 1] == currentPlayer
                        && gameBoard[i][j + 2] == currentPlayer &&
                        gameBoard[i][j + 3] == currentPlayer) {
                    System.out.println(currentPlayer + " has won!");
                    return true;
                }
            }
        }

        //checks diagonally
        for (int i = gameBoard.length - 1; i > 2; i--) {
            for (int j = 0; j < gameBoard[0].length - 3; j++) {
                if (gameBoard[i][j] == currentPlayer &&
                        gameBoard[i - 1][j + 1] == currentPlayer
                        && gameBoard[i - 2][j + 2] == currentPlayer &&
                        gameBoard[i - 3][j + 3] == currentPlayer) {
                    System.out.println(currentPlayer + " has won!");
                    return true;
                }
            }
        }

        //checks diagonally inversely
        for (int i = gameBoard.length - 1; i > 2; i--) {
            for (int j = gameBoard[0].length - 1; j > 3; j--) {
                if (gameBoard[i][j] == currentPlayer &&
                        gameBoard[i - 1][j - 1] == currentPlayer
                        && gameBoard[i - 2][j - 2] == currentPlayer &&
                        gameBoard[i - 3][j - 3] == currentPlayer) {
                    System.out.println(currentPlayer + " has won!");
                    return true;
                }
            }
        }
        return false;
    }

    public void updateGameBoard(int y) {

        if (checkWinner()) {
            //print something to indicate the person has won
            reset();
        } else {
            if (movesPlayed == 42) {
                //do something here
            } else {
                for (int i = gameBoard.length - 1; i >= 0; i--) {
                    if (gameBoard[i][y] == EMPTY) {
                        gameBoard[i][y] = currentPlayer;
                        movesPlayed++;
                        view.update(i, y, currentPlayer);
                        break;
                    }
                }
                if (checkWinner()) {
                    newGame();
                }
                if (currentPlayer == CROSS)
                    currentPlayer = CIRCLE;
                else
                    currentPlayer = CROSS;
            }
        }
    }
}
