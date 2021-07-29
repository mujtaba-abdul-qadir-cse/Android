package com.example.unitsconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TempActivity extends AppCompatActivity implements OnClickListener{

    private TextView txtview7;
    private EditText editTxt6;
    private TextView txtResult6;

    private Button b_celsiustofahrenheit;
    private Button b_fahrenheittocelsius;
    private Button b_clr6;
    private Button b_back6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);

        txtview7 = findViewById(R.id.txtview7);
        editTxt6 = findViewById(R.id.editTxt6);
        txtResult6 = findViewById(R.id.txtResult6);


        b_celsiustofahrenheit = findViewById(R.id.b_celsiustofahrenheit);
        b_fahrenheittocelsius = findViewById(R.id.b_fahrenheittocelsius);
        b_clr6 = findViewById(R.id.b_clr6);
        b_back6 = findViewById(R.id.b_back6);

        b_celsiustofahrenheit.setOnClickListener(this);
        b_fahrenheittocelsius.setOnClickListener(this);
        b_clr6.setOnClickListener(this);
        b_back6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.b_celsiustofahrenheit){
            String s1 = editTxt6.getText().toString();
            double temp = Double.parseDouble(s1);
            double result = (temp * 9/5) + 32;
            txtResult6.setText(temp + " celsius = " + result + " fahrenheit");
        }
        else if(v.getId()==R.id.b_fahrenheittocelsius){
            String s1 = editTxt6.getText().toString();
            double temp = Double.parseDouble(s1);
            double result = (temp - 32) * 5/9;
            txtResult6.setText(temp + " fahrenheit = " + result + " celsius");
        }
        else if(v.getId()==R.id.b_clr6){
            editTxt6.setText("");
            txtResult6.setText("");
        }
        else if(v.getId()==R.id.b_back6){
            finish();
        }

    }
}