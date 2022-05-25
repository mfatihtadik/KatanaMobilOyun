package com.fatih.katana;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.fatih.katana.databinding.ActivityKullaniciSayfasiBinding;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class kullaniciSayfasi extends AppCompatActivity {

    private ActivityKullaniciSayfasiBinding binding;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityKullaniciSayfasiBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        auth = FirebaseAuth.getInstance();

        FirebaseUser user = auth.getCurrentUser();

        if (user != null){
            Intent intent = new Intent(kullaniciSayfasi.this,kulGirdiSayfasi.class);
            startActivity(intent);
            finish();
        }



    }

    public void girisClicked (View view){

        String email = binding.emailText.getText().toString();
        String password = binding.passwordText.getText().toString();

        if (email.equals("") || password.equals("")){
            Toast.makeText(kullaniciSayfasi.this,"Email ya da Şifre Girin",Toast.LENGTH_LONG).show();
        } else {
            auth.signInWithEmailAndPassword(email,password).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                @Override
                public void onSuccess(AuthResult authResult) {
                    Intent inntent = new Intent(kullaniciSayfasi.this,kulGirdiSayfasi.class);
                    startActivity(inntent);
                    finish();
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(kullaniciSayfasi.this,e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                }
            });
        }

    }

    public void kaydolClicked (View view){

        String email = binding.emailText.getText().toString();
        String password = binding.passwordText.getText().toString();

        if (email.equals("") || password.equals("")){
            Toast.makeText(kullaniciSayfasi.this,"Email ya da Şifre Girin",Toast.LENGTH_LONG).show();
        } else{
            auth.createUserWithEmailAndPassword(email,password).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                @Override
                public void onSuccess(AuthResult authResult) {
                    Intent intennt = new Intent(kullaniciSayfasi.this,kulKayitOlduSayfasi.class);
                    startActivity(intennt);
                    finish();
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(kullaniciSayfasi.this,e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                }
            });
        }




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
}