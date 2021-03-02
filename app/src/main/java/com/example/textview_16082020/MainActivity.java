package com.example.textview_16082020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        goster("Tuncay Niftiyev");
    }

    private void tanimla() {
        txt = findViewById(R.id.txtView1);
    }

    private void goster(String Istifadeci) {
        txt.setText(Istifadeci);
    }
}
