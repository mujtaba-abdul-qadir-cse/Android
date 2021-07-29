package com.example.unitsconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MassActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView txtView5;
    private EditText editTxt4;
    private TextView txtResult4;

    private Button b_poundstokg;
    private Button b_kgtopounds;
    private Button b_ouncestograms;
    private Button b_gramstoounces;
    private Button b_clr4;
    private Button b_back4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass);

        txtView5 = findViewById(R.id.txtview5);
        editTxt4 = findViewById(R.id.editTxt4);
        txtResult4=findViewById(R.id.txtResult4);

        b_poundstokg = findViewById(R.id.b_poundstokg);
        b_kgtopounds = findViewById(R.id.b_kgtopounds);
        b_ouncestograms = findViewById(R.id.b_ouncestograms);
        b_gramstoounces = findViewById(R.id.b_gramstoounces);
        b_clr4 = findViewById(R.id.b_clr4);
        b_back4 = findViewById(R.id.b_back4);

        b_poundstokg.setOnClickListener(this);
        b_kgtopounds.setOnClickListener(this);
        b_ouncestograms.setOnClickListener(this);
        b_gramstoounces.setOnClickListener(this);
        b_clr4.setOnClickListener(this);
        b_back4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.b_poundstokg){
            String s1 = editTxt4.getText().toString();
            double temp = Double.parseDouble(s1);
            double result = temp * 0.454;
            txtResult4.setText(temp + " pounds = " + result + " kg");
        }
        else if(v.getId()==R.id.b_kgtopounds){
            String s1 = editTxt4.getText().toString();
            double temp = Double.parseDouble(s1);
            double result = temp / 0.454;
            txtResult4.setText(temp + " kg = " + result + " pounds");
        }
        else if(v.getId()==R.id.b_ouncestograms){
            String s1 = editTxt4.getText().toString();
            double temp = Double.parseDouble(s1);
            double result = temp * 28.35;
            txtResult4.setText(temp + " ounces = " + result + " grams");
        }
        else if(v.getId()==R.id.b_gramstoounces){
            String s1 = editTxt4.getText().toString();
            double temp = Double.parseDouble(s1);
            double result = temp / 28.35;
            txtResult4.setText(temp + " grams = " + result + " ounces");
        }
        else if(v.getId()==R.id.b_clr4){
            editTxt4.setText("");
            txtResult4.setText("");
        }
        else if(v.getId()==R.id.b_back4){
            finish();
        }
    }
}