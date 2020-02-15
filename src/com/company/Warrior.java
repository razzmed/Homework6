package com.company;

public class Warrior extends Player implements Scramble{
    private int superHit;

    @Override
    public void superAbility() {
        System.out.println("Мощный удар");

    }
}
