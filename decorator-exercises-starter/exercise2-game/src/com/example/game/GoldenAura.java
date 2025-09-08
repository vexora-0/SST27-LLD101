package com.example.game;

public class GoldenAura extends CharacterDecorator {

    public GoldenAura(Character c) {
        super(c);
    }

    @Override
    public void move() {
        System.out.println("Golden aura");
        System.out.println("Moving at speed " + getSpeed() + " with sprite " + getSprite());
    }

    @Override
    public void attack() {
        System.out.println("Golden aura");
        System.out.println("Attacking with damage " + getDamage() + " using sprite " + getSprite());
    }

    @Override
    public int getSpeed() {
        return c.getSpeed() + 2;
    }

    @Override
    public int getDamage() {
        return c.getDamage() + 5;
    }

    @Override
    public String getSprite() {
        return "gold.png";
    }
}
