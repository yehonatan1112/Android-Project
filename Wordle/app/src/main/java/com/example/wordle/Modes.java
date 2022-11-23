package com.example.wordle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Modes extends AppCompatActivity {

    Button WordGame,HeWordGame,GlobGame,FootGame,NBAGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modes);

        WordGame = (Button) findViewById(R.id.WordsMode);
        HeWordGame = (Button) findViewById(R.id.HebrewMode);
        GlobGame = (Button) findViewById(R.id.WorldMode);
        FootGame = (Button) findViewById(R.id.FootballMode);
        NBAGame = (Button) findViewById(R.id.NBAMode);

        WordGame.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Modes.this, WordGame.class);
                    startActivity(intent);
                }
            });
        HeWordGame.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Modes.this, HebWordGame.class);
                    startActivity(intent);
                }
            });
        GlobGame.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Modes.this, GlobalGame.class);
                    startActivity(intent);
                }
            });
        FootGame.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Modes.this,FootballGame.class);
                    startActivity(intent);
                }
            });
        NBAGame.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Modes.this,NBAGame.class);
                    startActivity(intent);
                }
            });
    }
}