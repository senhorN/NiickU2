package com.example.movieniick;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public class activity_slash extends AppCompatActivity {
        private Button btnEntrar;

        @SuppressLint("MissingInflatedId")
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            btnEntrar = findViewById(R.id.btnEntrar);

            btnEntrar.setOnClickListener(new View.OnClickListener(){
               @Override
               public void onClick(View v){
                   Intent intent = new Intent(activity_slash.this, MainActivity.class);
                   startActivity(intent);
                   finish();
               }
            });

        }
    }
}