package com.example.unitsconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button b_length;
    private Button b_area;
    private Button b_volume;
    private Button b_mass;
    private Button b_temp;
    private Button b_speed;

    public MainActivity() {

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b_length = findViewById(R.id.b_length);
        b_area = findViewById(R.id.b_area);
        b_volume = findViewById(R.id.b_volume);
        b_mass = findViewById(R.id.b_mass);
        b_temp = findViewById(R.id.b_temp);
        b_speed = findViewById(R.id.b_speed);

        b_length.setOnClickListener(this);
        b_area.setOnClickListener(this);
        b_volume.setOnClickListener(this);
        b_mass.setOnClickListener(this);
        b_temp.setOnClickListener(this);
        b_speed.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.b_length){
            Intent intent = new Intent(this, LengthActivity.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.b_area){
            Intent intent = new Intent(this, AreaActivity.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.b_volume){
            Intent intent = new Intent(this, VolumeActivity.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.b_mass){
            Intent intent = new Intent(this, MassActivity.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.b_temp){
            Intent intent = new Intent(this, TempActivity.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.b_speed) {
            Intent intent = new Intent(this, SpeedActivity.class);
            startActivity(intent);
        }
    }
}