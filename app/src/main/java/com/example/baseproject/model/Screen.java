package com.example.baseproject.model;

import java.lang.reflect.Type;

public class Screen {
    public enum TypeScreen {
        BIG_SIZE, NOMAL_SIZE, SMALL_SIZE
    }
    public TypeScreen typeScreen;
    private int size;

    public Screen(TypeScreen typeScreen, int size) {
        this.typeScreen = typeScreen;
        this.size = size;
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
