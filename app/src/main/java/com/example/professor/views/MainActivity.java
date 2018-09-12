package com.example.professor.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edtNome;
    private EditText edtEmail;
    private EditText edtTel;
    private RadioButton rdbFem;
    private RadioButton rdbMasc;
    private CheckBox chkMusica;
    private CheckBox chkCinema;
    private CheckBox chkEsporte;
    private CheckBox chkGastronomia;
    private Switch swtNotif;
    private Button btnExibir;
    private Button btnLimpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = findViewById(R.id.edtNome);
        edtEmail = findViewById(R.id.edtEmail);
        edtTel = findViewById(R.id.edtTel);
        rdbFem = findViewById(R.id.rdbFem);
        rdbMasc = findViewById(R.id.rdbMasc);
        chkMusica = findViewById(R.id.chkMusica);
        chkCinema = findViewById(R.id.chkCinema);
        chkEsporte = findViewById(R.id.chkEsporte);
        chkGastronomia = findViewById(R.id.chkGastronomia);
        swtNotif = findViewById(R.id.swtNotif);
        btnExibir = findViewById(R.id.btnExibir);
        btnLimpar = findViewById(R.id.btnLimpar);

        btnExibir.setOnClickListener(this);
        btnLimpar.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnExibir){
            Toast.makeText(this,"Exibir", Toast.LENGTH_SHORT).show();
        }
        else if (v.getId() == R.id.btnLimpar){
            Toast.makeText(this,"Limpar", Toast.LENGTH_LONG).show();
        }

    }
}
