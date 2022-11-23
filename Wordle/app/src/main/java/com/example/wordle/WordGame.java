package com.example.wordle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class WordGame extends AppCompatActivity {
    private Board boardGame;
    private FrameLayout frm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_game);
        boardGame = new Board(this);
        frm =findViewById(R.id.frm);
        frm.addView(boardGame);
    }

}
