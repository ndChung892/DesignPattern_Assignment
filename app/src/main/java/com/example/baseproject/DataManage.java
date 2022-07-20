package com.example.baseproject;

import android.util.Log;

import com.example.baseproject.builder.HuyndaiCarBuilder;
import com.example.baseproject.car.Car;
import com.example.baseproject.car.CarType;
import com.example.baseproject.car.Engine;

import java.util.ArrayList;
import java.util.List;

public class DataManage {
    private static final String TAG ="DataManage";
    OEMDirector oemDirector = new OEMDirector();
    HuyndaiCarBuilder huyndaiCarBuilder = new HuyndaiCarBuilder();
    private static DataManage instance = null;

    private DataManage (){
        oemDirector.createCarSport(huyndaiCarBuilder);
        Log.d(TAG, "DataManage: ");
    }
    public static DataManage getInstance(){
        if(instance !=null){
            instance = new DataManage();
        }
        return instance;
    }

//    public List<HuyndaiCarBuilder> getHuyndaiCarBuilderList() {
//        return huyndaiCarBuilderList;
//    }
//
//    public void setHuyndaiCarBuilderList(List<HuyndaiCarBuilder> huyndaiCarBuilderList) {
//        this.huyndaiCarBuilderList = huyndaiCarBuilderList;
//    }

    public HuyndaiCarBuilder getHuyndaiCarBuilder() {
        return huyndaiCarBuilder;
    }

    public void setHuyndaiCarBuilder(HuyndaiCarBuilder huyndaiCarBuilder) {
        this.huyndaiCarBuilder = huyndaiCarBuilder;
    }
}
