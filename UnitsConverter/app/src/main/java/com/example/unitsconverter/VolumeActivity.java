package com.example.unitsconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class VolumeActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView txtView4;
    private EditText editTxt3;
    private TextView txtResult3;
    private Button b_literstogallons;
    private Button b_gallonstoliters;
    private Button b_literstom3;
    private Button b_m3toliters;
    private Button b_gallonstom3;
    private Button b_m3togallons;
    private Button b_clr3;
    private Button b_back3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume);
        txtView4 = findViewById(R.id.txtview4);
        editTxt3 = findViewById(R.id.editTxt3);
        txtResult3 = findViewById(R.id.txtResult3);
        b_literstogallons = findViewById(R.id.b_literstogallons);
        b_gallonstoliters = findViewById(R.id.b_gallonstoliters);
        b_literstom3 = findViewById(R.id.b_literstom3);
        b_m3toliters = findViewById(R.id.b_m3toliters);
        b_gallonstom3 = findViewById(R.id.b_gallonstom3);
        b_m3togallons = findViewById(R.id.b_m3togallons);
        b_clr3 = findViewById(R.id.b_clr3);
        b_back3 = findViewById(R.id.b_back3);

        b_literstogallons.setOnClickListener(this);
        b_gallonstoliters.setOnClickListener(this);
        b_literstom3.setOnClickListener(this);
        b_m3toliters.setOnClickListener(this);
        b_gallonstom3.setOnClickListener(this);
        b_m3togallons.setOnClickListener(this);
        b_clr3.setOnClickListener(this);
        b_back3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.b_literstogallons){
            String s1 = editTxt3.getText().toString();
            double temp = Double.parseDouble(s1);
            double result = temp * 0.264;
            txtResult3.setText(temp + " liters = " + result + " gallons");
        }
        else if(v.getId()==R.id.b_gallonstoliters){
            String s1 = editTxt3.getText().toString();
            double temp = Double.parseDouble(s1);
            double result = temp / 0.264;
            txtResult3.setText(temp + " gallons = " + result + " liters");
        }
        else if(v.getId()==R.id.b_literstom3){
            String s1 = editTxt3.getText().toString();
            double temp = Double.parseDouble(s1);
            double result = temp * 0.001;
            txtResult3.setText(temp + " liters = " + result + " cubic meters");
        }
        else if(v.getId()==R.id.b_m3toliters){
            String s1 = editTxt3.getText().toString();
            double temp = Double.parseDouble(s1);
            double result = temp / 0.001;
            txtResult3.setText(temp + " cubic meters = " + result + " liters");
        }
        else if(v.getId()==R.id.b_gallonstom3){
            String s1 = editTxt3.getText().toString();
            double temp = Double.parseDouble(s1);
            double result = temp * 0.00379;
            txtResult3.setText(temp + " gallons = " + result + " cubic meters");
        }
        else if(v.getId()==R.id.b_m3togallons){
            String s1 = editTxt3.getText().toString();
            double temp = Double.parseDouble(s1);
            double result = temp / 0.00379;
            txtResult3.setText(temp + " cubic meters = " + result + " gallons");
        }
        else if(v.getId()==R.id.b_clr3){
            editTxt3.setText("");
            txtResult3.setText("");
        }
        else if(v.getId()==R.id.b_back3){
            finish();
        }
    }
}