package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        Warrior warrior = new Warrior();
        warrior.superAbility();
        new Magical().superAbility();
        new Mental().superAbility();

    }
}
