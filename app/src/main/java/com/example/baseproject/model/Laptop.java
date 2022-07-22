package com.example.baseproject.model;


public class Laptop {
    private String name;
    private Screen screen;
    private Price price;
    private Card card;


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


    @Override
    public String toString() {
        return "name : " + name + '\n' +
                "screen : " + screen.getSize() + " inch" + '\n' +
                "price : " + price.getPrice() + " VND" + '\n' +
                "card : " + card;
    }
}
