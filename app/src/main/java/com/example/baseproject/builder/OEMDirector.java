package com.example.baseproject.builder;

import com.example.baseproject.builder.Builder;
import com.example.baseproject.model.Card;
import com.example.baseproject.model.Price;
import com.example.baseproject.model.Screen;

public class OEMDirector {
    public void createLaptopWorkstation(Builder builder){
//        builder.setName("Workstation Laptop");
        builder.setCard(Card.NVIDIA);
        builder.setPrice(new Price(30000000));
        builder.setScreen(new Screen(Screen.TypeScreen.BIG_SIZE,17));
    }
    public void createLaptopBusiness(Builder builder){
//        builder.setName("Business Laptop");
        builder.setCard(Card.ONBOARD);
        builder.setPrice(new Price(20000000));
        builder.setScreen(new Screen(Screen.TypeScreen.SMALL_SIZE,13));
    }
    public void createLaptopGaming(Builder builder){
//        builder.setName("Gaming Laptop");
        builder.setCard(Card.RADEON);
        builder.setPrice(new Price(25000000));
        builder.setScreen(new Screen(Screen.TypeScreen.NOMAL_SIZE,15));
    }
}

