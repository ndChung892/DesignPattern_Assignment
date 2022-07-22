package com.example.baseproject;

import android.util.Log;

import com.example.baseproject.model.Laptop;

import java.util.ArrayList;
import java.util.List;

public class DataManage {
    private static final String TAG = "DataManage";
    private Laptop laptop;
    private static DataManage instance = null;

    private DataManage() {
        laptop = new Laptop();
    }

    public static DataManage getInstance() {
        if (instance == null) {
            instance = new DataManage();
        }
        return instance;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }


}
