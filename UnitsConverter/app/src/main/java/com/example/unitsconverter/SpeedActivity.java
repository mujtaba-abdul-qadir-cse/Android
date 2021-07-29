package com.example.unitsconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SpeedActivity extends AppCompatActivity implements OnClickListener{

    private TextView txtview6;
    private EditText editTxt5;
    private TextView txtResult5;

    private Button b_kphtoms;
    private Button b_mstokph;
    private Button b_clr5;
    private Button b_back5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed);

        txtview6 = findViewById(R.id.txtview6);
        editTxt5 = findViewById(R.id.editTxt5);
        txtResult5 = findViewById(R.id.txtResult5);

        b_kphtoms = findViewById(R.id.b_kphtoms);
        b_mstokph = findViewById(R.id.b_mstokph);
        b_clr5 = findViewById(R.id.b_clr5);
        b_back5 = findViewById(R.id.b_back5);

        b_kphtoms.setOnClickListener(this);
        b_mstokph.setOnClickListener(this);
        b_clr5.setOnClickListener(this);
        b_back5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.b_kphtoms){
            String s1 = editTxt5.getText().toString();
            double temp = Double.parseDouble(s1);
            double result = temp * 0.278;
            txtResult5.setText(temp + " km/h = " + result + " m/s");
        }
        else if(v.getId()==R.id.b_mstokph){
            String s1 = editTxt5.getText().toString();
            double temp = Double.parseDouble(s1);
            double result = temp / 0.278;
            txtResult5.setText(temp + " m/s = " + result + " km/h");
        }
        else if(v.getId()==R.id.b_clr5){
            editTxt5.setText("");
            txtResult5.setText("");
        }
        else if(v.getId()==R.id.b_back5){
            finish();
        }

    }
}