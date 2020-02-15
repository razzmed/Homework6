package com.company;

public class Magical extends Player implements Scramble {
    private int healing;

    @Override
    public void superAbility() {
        System.out.println("Лечение всех героев");

    }
}
