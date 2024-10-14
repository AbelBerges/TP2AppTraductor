package com.desarrollo.apptraducir;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.desarrollo.apptraducir.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.botonTraducir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String palabra = binding.editTextText.getText().toString();
                Intent intento = new Intent(MainActivity.this, InglesActivity.class);
                intento.putExtra("cadena",palabra);
                startActivity(intento);
            }
        });
    }
}