package com.example.baseproject.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.baseproject.DataManage;
import com.example.baseproject.R;

public class DisplayDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_data);
        TextView txtDisplay = findViewById(R.id.txtDisplay);

        String laptop = DataManage.getInstance().getLaptop().toString();

        txtDisplay.setText(laptop);


    }
}