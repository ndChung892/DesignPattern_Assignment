package com.example.baseproject;

import com.example.baseproject.builder.Builder;
import com.example.baseproject.car.Car;
import com.example.baseproject.car.CarType;
import com.example.baseproject.car.Engine;

public class OEMDirector {
    Engine engine;
    Car car;

    public void createCarSUV(Builder builder){
        builder.setCarType(CarType.SUV_CAR);
    }
    public void createCarSport(Builder builder){
        builder.setCarType(CarType.SPORT_CAR);
        builder.setSeats(5);
        builder.setEngine(new Engine(50));
    }
    public void createCarTruck(Builder builder){
        builder.setCarType(CarType.TRUCK_CAR);

    }
}
