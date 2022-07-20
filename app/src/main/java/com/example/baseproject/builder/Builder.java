package com.example.baseproject.builder;

import com.example.baseproject.car.Car;
import com.example.baseproject.car.CarType;
import com.example.baseproject.car.Engine;

public interface Builder {
//    void createSportCar();
//    void createSUVCar();
//    void createTruckCar();
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setCarType(CarType carType);
}
