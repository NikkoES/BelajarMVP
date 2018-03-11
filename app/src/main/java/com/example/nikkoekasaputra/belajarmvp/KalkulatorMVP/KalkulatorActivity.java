package com.example.nikkoekasaputra.belajarmvp.KalkulatorMVP;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.nikkoekasaputra.belajarmvp.R;

public class KalkulatorActivity extends AppCompatActivity implements KalkulatorActivityOutput {

    public KalkulatorActivityInput input;

    private EditText varA;
    private EditText varB;
    private TextView hasilHitung;

    private Button hitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);
        KalkulatorActivityConfigure.getInstance().config(this);

        varA = (EditText) findViewById(R.id.varA);
        varB = (EditText) findViewById(R.id.varB);
        hasilHitung = (TextView) findViewById(R.id.hasil);
        hitung = findViewById(R.id.btnhitung);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int va = Integer.parseInt(varA.getText().toString());
                int vb = Integer.parseInt(varB.getText().toString());
                input.doPenjumlahan(va,vb);
            }
        });

    }

    @Override
    public void displayHasil(String hasil) {
        hasilHitung.setText(hasil);
    }
}
