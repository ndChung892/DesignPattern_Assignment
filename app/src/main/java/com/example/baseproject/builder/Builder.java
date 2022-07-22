package com.example.baseproject.builder;


import com.example.baseproject.model.Card;
import com.example.baseproject.model.Price;
import com.example.baseproject.model.Screen;

public interface Builder {
    void setName(String name);
    void setScreen(Screen screen);
    void setPrice(Price price);
    void setCard(Card card);

}
