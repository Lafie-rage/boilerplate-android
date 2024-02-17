package fr.lafierage.app_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button monBOuton =  findViewById(R.id.monSuperBouton);

        monBOuton.setOnClickListener((truc) -> {
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        });


    }
}