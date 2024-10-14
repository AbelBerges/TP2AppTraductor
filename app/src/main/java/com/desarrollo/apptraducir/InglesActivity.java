package com.desarrollo.apptraducir;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;

import com.desarrollo.apptraducir.databinding.ActivityInglesBinding;

public class InglesActivity extends AppCompatActivity {
    private ActivityInglesBinding binding;
    private TraductorViewModel tvm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityInglesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        tvm = new ViewModelProvider(this).get(TraductorViewModel.class);
        String tomoPalabra = getIntent().getStringExtra("cadena");
        tvm.Traducir(tomoPalabra);
        tvm.getTraducida().observe(this, resultado->{
            binding.tvResultadoIngles.setText(resultado.getEnIngl());
            binding.visorImagen.setImageResource(resultado.getLaImg());
        });

        binding.botonVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(InglesActivity.this,MainActivity.class);
                startActivity(intento);
            }
        });
    }
}