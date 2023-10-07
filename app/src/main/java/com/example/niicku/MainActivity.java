package com.example.niicku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgDetetive, imgJogoVelha, imgChess, imgAzar, imgForca, imgCobrinha, imgPacman, imgBall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgDetetive = (ImageView) findViewById(R.id.imgDetetive);
        imgForca = (ImageView) findViewById(R.id.imgForca);

        imgDetetive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                SecondActivity();
            }

        });

        imgForca.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View view){ TreeActivity(); }

        });


    }
    public void SecondActivity(){
        Intent intent = new Intent(this, DetetiveActivity.class);
        startActivity(intent);
    }
    public void TreeActivity(){
        Intent intent = new Intent(this, TreeActivity.class);
        startActivity(intent);
    }
}