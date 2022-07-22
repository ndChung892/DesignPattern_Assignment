package com.example.baseproject.model;


public class Laptop {
    private String name;
    private Screen screen;
    private Price price;
    private Card card;
    private int img;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "name = " + name  +'\n'+
                "screen  = " + screen.getSize() +'\n'+
                "price = " + price.getPrice() +'\n'+
                "card = " + card;
    }
}
