package com.example.asus.PRIMADI_1202154151_MODUL1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    TextView tempat, menu, jumlahpesan, harga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String HasilTempat = intent.getStringExtra("tempat");
        String Menu = intent.getStringExtra("masakan");
        String Porsi = intent.getStringExtra("porsi");
        String Harga = intent.getStringExtra("harga");
        int Jumlah= Integer.valueOf(Harga)* Integer.valueOf(Porsi);

        tempat = (TextView)findViewById(R.id.tempatmakan);
        tempat.setText(HasilTempat);
        menu = (TextView)findViewById(R.id.masakan);
        menu.setText(Menu);
        jumlahpesan = (TextView) findViewById(R.id.porsi);
        jumlahpesan.setText(Porsi);
        harga = (TextView) findViewById(R.id.harga);
        harga.setText(String.valueOf(Jumlah));
        if (Jumlah > 65000){
            Toast warning = Toast.makeText(this, "Gak punya Uang", Toast.LENGTH_LONG);
            warning.show();
        } else {
            Toast peringatan =Toast.makeText(this, "Disini aja makanya",Toast.LENGTH_LONG);
            peringatan.show();
        }

    }
}

