package com.fatih.katana;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class oyunSayfasi extends AppCompatActivity {

    TextView skorText;
    TextView sureText;
    int skor;

    ImageView imageView;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    ImageView imageView7;
    ImageView imageView8;
    ImageView imageView9;
    ImageView imageView10;
    ImageView imageView11;
    ImageView imageView12;

    ImageView imageView13;
    ImageView imageView14;
    ImageView imageView15;
    ImageView imageView16;
    ImageView imageView17;
    ImageView imageView18;
    ImageView imageView19;
    ImageView imageView20;
    ImageView imageView21;
    ImageView imageView22;
    ImageView imageView23;
    ImageView imageView24;


    ImageView imageView25;
    ImageView imageView26;
    ImageView imageView27;
    ImageView imageView28;
    ImageView imageView29;
    ImageView imageView30;
    ImageView imageView31;
    ImageView imageView32;
    ImageView imageView33;
    ImageView imageView34;
    ImageView imageView35;
    ImageView imageView36;

    ImageView imageView37;
    ImageView imageView38;
    ImageView imageView39;
    ImageView imageView40;
    ImageView imageView41;
    ImageView imageView42;
    ImageView imageView43;
    ImageView imageView44;
    ImageView imageView45;
    ImageView imageView46;
    ImageView imageView47;
    ImageView imageView48;

    ImageView imageView49;
    ImageView imageView50;
    ImageView imageView51;
    ImageView imageView52;
    ImageView imageView53;
    ImageView imageView54;
    ImageView imageView55;
    ImageView imageView56;
    ImageView imageView57;
    ImageView imageView58;
    ImageView imageView59;
    ImageView imageView60;

    ImageView[] imageArray;
    Handler handler;
    Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oyun_sayfasi);

        sureText = (TextView) findViewById(R.id.sureText);

        skorText = (TextView) findViewById(R.id.skorText);

        imageView = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);
        imageView8 = findViewById(R.id.imageView8);
        imageView9 = findViewById(R.id.imageView9);
        imageView10 = findViewById(R.id.imageView10);
        imageView11 = findViewById(R.id.imageView11);
        imageView12 = findViewById(R.id.imageView12);

        imageView13 = findViewById(R.id.imageView13);
        imageView14 = findViewById(R.id.imageView14);
        imageView15 = findViewById(R.id.imageView15);
        imageView16 = findViewById(R.id.imageView16);
        imageView17 = findViewById(R.id.imageView17);
        imageView18 = findViewById(R.id.imageView18);
        imageView19 = findViewById(R.id.imageView19);
        imageView20 = findViewById(R.id.imageView20);
        imageView21 = findViewById(R.id.imageView21);
        imageView22 = findViewById(R.id.imageView22);
        imageView23 = findViewById(R.id.imageView23);
        imageView24 = findViewById(R.id.imageView24);


        imageView25 = findViewById(R.id.imageView25);
        imageView26 = findViewById(R.id.imageView26);
        imageView27 = findViewById(R.id.imageView27);
        imageView28 = findViewById(R.id.imageView28);
        imageView29 = findViewById(R.id.imageView29);
        imageView30 = findViewById(R.id.imageView30);
        imageView31 = findViewById(R.id.imageView31);
        imageView32 = findViewById(R.id.imageView32);
        imageView33 = findViewById(R.id.imageView33);
        imageView34 = findViewById(R.id.imageView34);
        imageView35 = findViewById(R.id.imageView35);
        imageView36 = findViewById(R.id.imageView36);


        imageView37 = findViewById(R.id.imageView37);
        imageView38 = findViewById(R.id.imageView38);
        imageView39 = findViewById(R.id.imageView39);
        imageView40 = findViewById(R.id.imageView40);
        imageView41 = findViewById(R.id.imageView41);
        imageView42 = findViewById(R.id.imageView42);
        imageView43 = findViewById(R.id.imageView43);
        imageView44 = findViewById(R.id.imageView44);
        imageView45 = findViewById(R.id.imageView45);
        imageView46 = findViewById(R.id.imageView46);
        imageView47 = findViewById(R.id.imageView47);
        imageView48 = findViewById(R.id.imageView48);

        imageView49 = findViewById(R.id.imageView49);
        imageView50 = findViewById(R.id.imageView50);
        imageView51 = findViewById(R.id.imageView51);
        imageView52 = findViewById(R.id.imageView52);
        imageView53 = findViewById(R.id.imageView53);
        imageView54 = findViewById(R.id.imageView54);
        imageView55 = findViewById(R.id.imageView55);
        imageView56 = findViewById(R.id.imageView56);
        imageView57 = findViewById(R.id.imageView57);
        imageView58 = findViewById(R.id.imageView58);
        imageView59 = findViewById(R.id.imageView59);
        imageView60 = findViewById(R.id.imageView60);



        imageArray = new ImageView[] {imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10, imageView11, imageView12,
                imageView13, imageView14, imageView15, imageView16, imageView17, imageView18, imageView19, imageView20, imageView21, imageView22, imageView23, imageView24,
        imageView25, imageView26, imageView27, imageView28, imageView29, imageView30, imageView31, imageView32, imageView33, imageView34, imageView35, imageView36,
        imageView37, imageView38, imageView39, imageView40, imageView41, imageView42, imageView43, imageView44, imageView45, imageView46, imageView47, imageView48,
        imageView49, imageView50, imageView51, imageView52, imageView53, imageView54, imageView55, imageView56, imageView57, imageView58, imageView59, imageView60};

        saklaImage();


        skor = 0;


        new CountDownTimer(25000,1000){

            @Override
            public void onTick(long l) {

                sureText.setText("Süre: "+ l/1000);

            }

            @Override
            public void onFinish() {

                sureText.setText("Süre Bitti!");
                handler.removeCallbacks(runnable);
                for (ImageView image : imageArray) {
                    image.setVisibility(View.INVISIBLE);

                }

                AlertDialog.Builder alert = new AlertDialog.Builder(oyunSayfasi.this);

                alert.setTitle("Oyun bitti!");
                alert.setMessage("Tekrar Oyna?");
                alert.setPositiveButton("Evet", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        //Restart

                        Intent intent = getIntent();
                        finish();
                        startActivity(intent);

                    }
                });

                alert.setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(oyunSayfasi.this,"Oyun Bitti!", Toast.LENGTH_SHORT).show();
                    }
                });

                alert.show();

            }
        }.start();




    }

    public void skoruArttir(View view){

        skor++;

        skorText.setText("Skor: "+skor);


    }

    public void skoruAzalt(View view){
        skor=skor-3;

        skorText.setText("Skor: "+skor);
    }

    public void saklaImage(){

        handler = new Handler();

        runnable = new Runnable() {
            @Override
            public void run() {

                for (ImageView image : imageArray) {
                    image.setVisibility(View.INVISIBLE);

                }

                Random random = new Random();
                int i = random.nextInt(60);
                imageArray[i].setVisibility(View.VISIBLE);

                handler.postDelayed(this,500);

            }
        };

        handler.post(runnable);



    }


}