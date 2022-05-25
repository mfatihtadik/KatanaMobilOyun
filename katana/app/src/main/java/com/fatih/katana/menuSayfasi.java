package com.fatih.katana;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class menuSayfasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_sayfasi);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.art_menu,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.add_oyna)
        {
            Intent intentt = new Intent(this,oyunSayfasi.class);
            startActivity(intentt);
        }
        else if (item.getItemId() == R.id.add_kul){
            Intent intentt2 = new Intent(this,kullaniciSayfasi.class);
            startActivity(intentt2);

        }
        else if (item.getItemId() == R.id.add_map){
            Intent intentt3 = new Intent(this,haritaSayfasi.class);
            startActivity(intentt3);

        }

        return super.onOptionsItemSelected(item);
    }

    public void changeOyun(View view){
        Intent intent = new Intent(menuSayfasi.this,oyunSayfasi.class);
        startActivity(intent);
    }

    public void changeKullanici(View view){
        Intent intent2 = new Intent(menuSayfasi.this,kullaniciSayfasi.class);
        startActivity(intent2);
    }

    public void changeHarita(View view){
        Intent intent3 = new Intent(menuSayfasi.this,haritaSayfasi.class);
        startActivity(intent3);
    }



}