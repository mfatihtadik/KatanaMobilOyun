package com.fatih.katana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class kulGirdiSayfasi extends AppCompatActivity {

    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kul_girdi_sayfasi);

        auth = FirebaseAuth.getInstance();
    }

    public void cikisClicked(View view){

        auth.signOut();

        Intent intentToMain = new Intent(kulGirdiSayfasi.this,kullaniciSayfasi.class);
        startActivity(intentToMain);
        finish();
    }


}