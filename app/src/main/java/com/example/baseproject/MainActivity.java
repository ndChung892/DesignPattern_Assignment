package com.example.baseproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.baseproject.builder.HuyndaiCarBuilder;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

	private static final String TAG = "MainActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
//		OEMDirector oemDirector = new OEMDirector();
//		HuyndaiCarBuilder huyndaiCarBuilder = new HuyndaiCarBuilder();
//		oemDirector.createCarSport(huyndaiCarBuilder);
		List<HuyndaiCarBuilder> huyndaiCarBuilderList = null;
		Log.d(TAG, "onCreate: Huyndai"+ huyndaiCarBuilderList);


		DataManage dataManage  = DataManage.getInstance();
		Log.d(TAG, "onCreate: "+ dataManage.getHuyndaiCarBuilder());
	}
}