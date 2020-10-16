package com.example.luaspersegipanjang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edt_panjang, edt_lebar;
    private Button btnHitung;
    private TextView hasill;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_panjang = (EditText) findViewById(R.id.edt_p);
        edt_lebar = (EditText) findViewById(R.id.edt_l);
        btnHitung = (Button) findViewById(R.id.btnH);
        hasill = (TextView) findViewById(R.id.hasil);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String panjang, lebar;
                panjang = edt_panjang.getText().toString();
                lebar = edt_lebar.getText().toString();
                // TextUtils berfungsi supaya ketika EditText nya tidak terisi (Kosong) Maka
                // nanti akan muncul notifikasi "tidak boleh kosong"

                    // Masukan Rumus untuk menghitung Panjang dan juga lebar nya
                    double p = Double.parseDouble(panjang);
                    double l = Double.parseDouble(lebar);
                    double hasil = p * l;
                    // Kemudian Hasil di tampilkan di TextView
                    hasill.setText("Hasil Luas  : " + hasil);
                }


        });
    }
}