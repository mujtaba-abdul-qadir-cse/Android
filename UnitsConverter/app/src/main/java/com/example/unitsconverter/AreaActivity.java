package com.example.unitsconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AreaActivity<Textview> extends AppCompatActivity implements View.OnClickListener{
    private TextView txtView3;
    private EditText editTxt2;
    private TextView txtResult2;
    private Button b_kmsq2misq;
    private Button b_misq2kmsq;
    private Button b_ac2msq;
    private Button b_msq2ac;
    private Button b_hec2msq;
    private Button b_msq2hec;
    private Button b_clr2;
    private Button b_back2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);

        txtView3 = findViewById(R.id.txtview3);
        editTxt2 = findViewById(R.id.editTxt2);
        txtResult2 = findViewById(R.id.txtResult2);

        b_kmsq2misq = findViewById(R.id.b_kmsq2misq);
        b_misq2kmsq = findViewById(R.id.b_misq2kmsq);
        b_ac2msq = findViewById(R.id.b_ac2msq);
        b_msq2ac = findViewById(R.id.b_msq2ac);
        b_hec2msq = findViewById(R.id.b_hec2msq);
        b_msq2hec = findViewById(R.id.b_msq2hec);
        b_clr2 = findViewById(R.id.b_clr2);
        b_back2 = findViewById(R.id.b_back2);

        b_kmsq2misq.setOnClickListener(this);
        b_misq2kmsq.setOnClickListener(this);
        b_ac2msq.setOnClickListener(this);
        b_msq2ac.setOnClickListener(this);
        b_hec2msq.setOnClickListener(this);
        b_msq2hec.setOnClickListener(this);
        b_clr2.setOnClickListener(this);
        b_back2.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.b_kmsq2misq){
            String s1 = editTxt2.getText().toString();
            double temp = Double.parseDouble(s1);
            double result = temp * 0.386;
            txtResult2.setText(temp + " square km = " + result + " square miles");
        }
        else if(v.getId()==R.id.b_misq2kmsq){
            String s1 = editTxt2.getText().toString();
            double temp = Double.parseDouble(s1);
            double result = temp / 0.386;
            txtResult2.setText(temp + " square miles = " + result + " square km");
        }
        else if(v.getId()==R.id.b_ac2msq){
            String s1 = editTxt2.getText().toString();
            double temp = Double.parseDouble(s1);
            double result = temp * 4046.856;
            txtResult2.setText(temp + " acres = " + result + " square meters");
        }
        else if(v.getId()==R.id.b_msq2ac){
            String s1 = editTxt2.getText().toString();
            double temp = Double.parseDouble(s1);
            double result = temp / 4046.856;
            txtResult2.setText(temp + " square meters = " + result + " acres");
        }
        else if(v.getId()==R.id.b_hec2msq){
            String s1 = editTxt2.getText().toString();
            double temp = Double.parseDouble(s1);
            double result = temp * 10000;
            txtResult2.setText(temp + " hectares = " + result + " square meters");
        }
        else if(v.getId()==R.id.b_msq2hec){
            String s1 = editTxt2.getText().toString();
            double temp = Double.parseDouble(s1);
            double result = temp / 10000;
            txtResult2.setText(temp + " square meters = " + result + " hectares");
        }
        else if(v.getId()==R.id.b_clr2){
            editTxt2.setText("");
            txtResult2.setText("");
        }
        else if(v.getId()==R.id.b_back2) {
            finish();
        }
   }
}