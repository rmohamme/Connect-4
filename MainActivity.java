package com.example.ritzbitz.connect4;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Connect4View view;
    Connect4Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO: INITIALIZE ALL THE BUTTONS AND ADD THEM TO THE ARRAY, THEN DISABLE THEM IN VIEW
        //buttons on row 0
        Button b00 = (Button) findViewById(R.id.button00);
        Button b01 = (Button) findViewById(R.id.button01);
        Button b02 = (Button) findViewById(R.id.button02);
        Button b03 = (Button) findViewById(R.id.button03);
        Button b04 = (Button) findViewById(R.id.button04);
        Button b05 = (Button) findViewById(R.id.button05);
        Button b06 = (Button) findViewById(R.id.button06);
        //buttons on row 1
        Button b10 = (Button) findViewById(R.id.button10);
        Button b11 = (Button) findViewById(R.id.button11);
        Button b12 = (Button) findViewById(R.id.button12);
        Button b13 = (Button) findViewById(R.id.button13);
        Button b14 = (Button) findViewById(R.id.button14);
        Button b15 = (Button) findViewById(R.id.button15);
        Button b16 = (Button) findViewById(R.id.button16);
        //buttons on row 2
        Button b20 = (Button) findViewById(R.id.button20);
        Button b21 = (Button) findViewById(R.id.button21);
        Button b22 = (Button) findViewById(R.id.button22);
        Button b23 = (Button) findViewById(R.id.button23);
        Button b24 = (Button) findViewById(R.id.button24);
        Button b25 = (Button) findViewById(R.id.button25);
        Button b26 = (Button) findViewById(R.id.button26);
        //buttons on row 3
        Button b30 = (Button) findViewById(R.id.button30);
        Button b31 = (Button) findViewById(R.id.button31);
        Button b32 = (Button) findViewById(R.id.button32);
        Button b33 = (Button) findViewById(R.id.button33);
        Button b34 = (Button) findViewById(R.id.button34);
        Button b35 = (Button) findViewById(R.id.button35);
        Button b36 = (Button) findViewById(R.id.button36);
        //buttons on row 4
        Button b40 = (Button) findViewById(R.id.button40);
        Button b41 = (Button) findViewById(R.id.button41);
        Button b42 = (Button) findViewById(R.id.button42);
        Button b43 = (Button) findViewById(R.id.button43);
        Button b44 = (Button) findViewById(R.id.button44);
        Button b45 = (Button) findViewById(R.id.button45);
        Button b46 = (Button) findViewById(R.id.button46);
        //buttons on row 5
        Button b50 = (Button) findViewById(R.id.button50);
        Button b51 = (Button) findViewById(R.id.button51);
        Button b52 = (Button) findViewById(R.id.button52);
        Button b53 = (Button) findViewById(R.id.button53);
        Button b54 = (Button) findViewById(R.id.button54);
        Button b55 = (Button) findViewById(R.id.button55);
        Button b56 = (Button) findViewById(R.id.button56);
        //buttons on row 6
        Button b60 = (Button) findViewById(R.id.button60);
        Button b61 = (Button) findViewById(R.id.button61);
        Button b62 = (Button) findViewById(R.id.button62);
        Button b63 = (Button) findViewById(R.id.button63);
        Button b64 = (Button) findViewById(R.id.button64);
        Button b65 = (Button) findViewById(R.id.button65);
        Button b66 = (Button) findViewById(R.id.button66);
        Button newGame = (Button) findViewById(R.id.newGame);
        //could be a point of error
        Button[][] buttons = {{b00, b01, b02, b03, b04, b05, b06},
                {b10, b11, b12, b13, b14, b15, b16},
                {b20, b21, b22, b23, b24, b25, b26},
                {b30, b31, b32, b33, b34, b35, b36},
                {b40, b41, b42, b43, b44, b45, b46},
                {b50, b51, b52, b53, b54, b55, b56},
                {b60, b61, b62, b63, b64, b65, b66}};

        view = new Connect4View(buttons, newGame);
        game = new Connect4Game(view);
    }

//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
//    }

    public void buttonClicked(View v) {
        switch (v.getId()) {
            case R.id.button60:
                game.updateGameBoard(0);
                break;
            case R.id.button61:
                game.updateGameBoard(1);
                break;
            case R.id.button62:
                game.updateGameBoard(2);
                break;
            case R.id.button63:
                game.updateGameBoard(3);
                break;
            case R.id.button64:
                game.updateGameBoard(4);
                break;
            case R.id.button65:
                game.updateGameBoard(5);
                break;
            case R.id.button66:
                game.updateGameBoard(6);
                break;
            case R.id.newGame:
                game.newGame();
                break;
            default:
                break;
        }
    }
}
