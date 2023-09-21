package com.example.albumacme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtFoto;
    ImageView imgFoto;
    button btnFoto1, btnFoto2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtFoto = (TextView) findViewById(R.id.txtFoto1);
        imgFoto = (ImageView) findViewById(R.id.imgFoto);
        btnFoto1 = (Button) findViewById(R.id.btnFoto1);
        btnFoto2 = (Button) findViewById(R.id.btnFoto2);


        btnFoto1.setOnClickListener(new view.OnClickListener){
            @Override
            public void onClick(View view){
            txtFoto.setText("Foto2");
            imgFoto.setImageResoruce(R.id.imgFoto2);
        }

        btnFoto2.setOnClickListener(new view.OnClickListener){

        }


    }
}