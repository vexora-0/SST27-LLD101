package com.example.game;

public abstract class CharacterDecorator implements Character {
    protected Character c;

    public CharacterDecorator(Character c) {
        this.c = c;
    }

    @Override
    public void move() {
        c.move();
    }

    @Override
    public void attack() {
        c.attack();
    }

    @Override
    public int getSpeed() {
        return c.getSpeed();
    }

    @Override
    public int getDamage() {
        return c.getDamage();
    }

    @Override
    public String getSprite() {
        return c.getSprite();
    }
}
