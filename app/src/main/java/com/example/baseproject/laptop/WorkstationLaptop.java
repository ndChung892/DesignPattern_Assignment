package com.example.baseproject.laptop;

import com.example.baseproject.model.Card;
import com.example.baseproject.model.Laptop;
import com.example.baseproject.model.Price;
import com.example.baseproject.model.Screen;

public class WorkstationLaptop extends Laptop {

    public WorkstationLaptop(Screen screen, Price price, Card card) {
            setScreen(screen);
            setPrice(price);
            setCard(card);
    }
}
