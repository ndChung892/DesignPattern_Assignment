package com.example.baseproject.builder;

import com.example.baseproject.car.Car;
import com.example.baseproject.car.CarType;
import com.example.baseproject.car.Engine;

public class KiaCarBuilder implements Builder{
    private int seats;
    private Engine engine;
    private CarType carType;

    @Override
    public void setSeats(int seats) {

    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }
}
