package com.example.baseproject.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.baseproject.DataManage;
import com.example.baseproject.R;
import com.example.baseproject.builder.OEMDirector;
import com.example.baseproject.create.BusinessLaptopBuilder;
import com.example.baseproject.create.GamingLaptopBuilder;
import com.example.baseproject.create.WorkstationLaptopBuilder;
import com.example.baseproject.laptop.BusinessLaptop;
import com.example.baseproject.laptop.GamingLaptop;
import com.example.baseproject.model.Laptop;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private Button btnCreate;
    private EditText edtName;
    private RadioGroup radioGroup;
    private RadioButton radioBtnWork, radioBtnBusi, radioBtnGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCreate = findViewById(R.id.btnCreate);
        edtName = findViewById(R.id.edtName);
        radioGroup = findViewById(R.id.rdoGroup);
        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int checkedRadioButton = radioGroup.getCheckedRadioButtonId();
                switch (checkedRadioButton) {
                    case R.id.rdoBtnWorkstation:
                        createWorkstationLaptop();
                        Log.d(TAG, "onClick: "+DataManage.getInstance().getLaptop().toString());
                        break;
                    case R.id.rdoBtnBusiness:
                        createBusinessLaptop();
                        break;
                    case R.id.rdoBtnGaming:
                        createGamingLaptop();
                        break;
                }
                startActivity(new Intent(MainActivity.this, DisplayDataActivity.class));
            }
        });

    }

    private void createGamingLaptop() {
        String inName = edtName.getText().toString();
        OEMDirector oemDirector = new OEMDirector();

        GamingLaptopBuilder gamingLaptopBuilder = new GamingLaptopBuilder();
        oemDirector.createLaptopWorkstation(gamingLaptopBuilder);

        Laptop gamingLaptop = gamingLaptopBuilder.build();
        gamingLaptop.setName(inName);

        DataManage.getInstance().setLaptop(gamingLaptop);
//        startActivity(new Intent(this, DisplayDataActivity.class));
    }

    private void createBusinessLaptop() {
        String inName = edtName.getText().toString();
        OEMDirector oemDirector = new OEMDirector();

        BusinessLaptopBuilder businessLaptopBuilder = new BusinessLaptopBuilder();
        oemDirector.createLaptopWorkstation(businessLaptopBuilder);

        Laptop businessLaptop = businessLaptopBuilder.build();
        businessLaptop.setName(inName);

        DataManage.getInstance().setLaptop(businessLaptop);
//        startActivity(new Intent(this, DisplayDataActivity.class));
    }

    private void createWorkstationLaptop() {
        String inName = edtName.getText().toString();
        OEMDirector oemDirector = new OEMDirector();

        WorkstationLaptopBuilder workstationLaptopBuilder = new WorkstationLaptopBuilder();
        oemDirector.createLaptopWorkstation(workstationLaptopBuilder);

        Laptop workstationLaptop = workstationLaptopBuilder.build();
        workstationLaptop.setName(inName);

        DataManage.getInstance().setLaptop(workstationLaptop);
//        startActivity(new Intent(this, DisplayDataActivity.class));
//        String name = DataManage.getInstance().getLaptop().getName();
    }

}