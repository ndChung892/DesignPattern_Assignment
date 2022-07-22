package com.example.baseproject.create;

import com.example.baseproject.builder.Builder;
import com.example.baseproject.model.Card;
import com.example.baseproject.model.Price;
import com.example.baseproject.model.Screen;
import com.example.baseproject.laptop.WorkstationLaptop;

public class WorkstationLaptopBuilder implements Builder {

    private String name;
    private Screen screen;
    private Price price;
    private Card card;

    @Override
    public void setName(String name) {
        this.name= name;
    }

    @Override
    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    @Override
    public void setPrice(Price price) {
        this.price= price;
    }

    @Override
    public void setCard(Card card) {
        this.card = card;
    }
    public WorkstationLaptop build(){
        return new WorkstationLaptop(screen,price,card);
    }
}
