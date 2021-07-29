package com.example.unitsconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LengthActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView txtview1;
    private EditText editTxt1;
    private TextView txtResult;

    private Button b_in2cm;
    private Button b_cm2in;
    private Button b_ft2m;
    private Button b_m2ft;
    private Button b_yd2m;
    private Button b_m2yd;
    private Button b_mi2km;
    private Button b_km2mi;
    private Button b_clr;
    private Button b_back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);

        txtview1 = findViewById(R.id.txtview1);
        editTxt1 = findViewById(R.id.editTxt1);
        txtResult = findViewById(R.id.txtResult);

        b_in2cm = findViewById(R.id.b_in2cm);
        b_cm2in = findViewById(R.id.b_cm2in);
        b_ft2m = findViewById(R.id.b_ft2m);
        b_m2ft = findViewById(R.id.b_m2ft);
        b_yd2m = findViewById(R.id.b_yd2m);
        b_m2yd = findViewById(R.id.b_m2yd);
        b_mi2km = findViewById(R.id.b_mi2km);
        b_km2mi = findViewById(R.id.b_km2mi);
        b_clr = findViewById(R.id.b_clr);
        b_back = findViewById(R.id.b_back);

        b_in2cm.setOnClickListener(this);
        b_cm2in.setOnClickListener(this);
        b_ft2m.setOnClickListener(this);
        b_m2ft.setOnClickListener(this);
        b_yd2m.setOnClickListener(this);
        b_m2yd.setOnClickListener(this);
        b_mi2km.setOnClickListener(this);
        b_km2mi.setOnClickListener(this);
        b_clr.setOnClickListener(this);
        b_back.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.b_in2cm) {
            String s1 = editTxt1.getText().toString();
            double temp = Double.parseDouble(s1);
            double result = temp * 2.54;
            txtResult.setText(temp + " inches = " + result + " cm");
        } else if (v.getId() == R.id.b_cm2in) {
            String s1 = editTxt1.getText().toString();
            double temp = Double.parseDouble(s1);
            double result = temp / 2.54;
            txtResult.setText(temp + " cm = " + result + " inches");
        } else if (v.getId() == R.id.b_ft2m) {
            String s1 = editTxt1.getText().toString();
            double temp = Double.parseDouble(s1);
            double result = temp * 0.3048;
            txtResult.setText(temp + " ft = " + result + " m");
        } else if (v.getId() == R.id.b_m2ft) {
            String s1 = editTxt1.getText().toString();
            double temp = Double.parseDouble(s1);
            double result = temp / 0.3048;
            txtResult.setText(temp + " m = " + result + " ft");
        } else if (v.getId() == R.id.b_yd2m) {
            String s1 = editTxt1.getText().toString();
            double temp = Double.parseDouble(s1);
            double result = temp * 0.9144;
            txtResult.setText(temp + " yd = " + result + " m");
        } else if (v.getId() == R.id.b_m2yd) {
            String s1 = editTxt1.getText().toString();
            double temp = Double.parseDouble(s1);
            double result = temp / 0.9144;
            txtResult.setText(temp + " m = " + result + " yd");
        } else if (v.getId() == R.id.b_mi2km) {
            String s1 = editTxt1.getText().toString();
            double temp = Double.parseDouble(s1);
            double result = temp * 1.6093;
            txtResult.setText(temp + " miles = " + result + " km");
        } else if (v.getId() == R.id.b_km2mi) {
            String s1 = editTxt1.getText().toString();
            double temp = Double.parseDouble(s1);
            double result = temp / 1.6093;
            txtResult.setText(temp + " km = " + result + " miles");
        } else if (v.getId() == R.id.b_clr) {
            editTxt1.setText("");
            txtResult.setText("");
        } else if (v.getId() == R.id.b_back) {
            finish();
        }
    }

}