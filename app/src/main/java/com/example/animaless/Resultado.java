package com.example.animaless;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Resultado extends AppCompatActivity {
    private TextView datos;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        datos = findViewById(R.id.tvResultado);
        receiver();
    }
    public void receiver(){
        Bundle receiverD = getIntent().getExtras();
        if (receiverD != null){
            Mascota mascota;
            mascota = (Mascota) receiverD.get("result");
            double pago = (double) receiverD.get("pago");
            Toast.makeText(this, "" + mascota, Toast.LENGTH_SHORT).show();
            datos.setText(mascota.toString()+" Pago:"+pago);
        }
    }
}