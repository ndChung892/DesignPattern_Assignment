package com.example.baseproject.create;

import com.example.baseproject.builder.Builder;
import com.example.baseproject.laptop.GamingLaptop;
import com.example.baseproject.model.Card;
import com.example.baseproject.model.Price;
import com.example.baseproject.model.Screen;

public class GamingLaptopBuilder implements Builder {
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
    public GamingLaptop build(){
        return new GamingLaptop(screen,price,card);
    }
}
