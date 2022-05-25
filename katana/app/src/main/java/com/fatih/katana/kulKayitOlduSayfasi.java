package com.fatih.katana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class kulKayitOlduSayfasi extends AppCompatActivity {

    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kul_kayit_oldu_sayfasi);

        auth = FirebaseAuth.getInstance();
    }


    public void girClick(View view){

        auth.signOut();

        Intent intent = new Intent(kulKayitOlduSayfasi.this,kullaniciSayfasi.class);
        startActivity(intent);
        finish();
    }


}