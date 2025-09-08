package com.example.game;

public class SpeedBoost extends CharacterDecorator {
    private int boost;

    public SpeedBoost(Character c, int boost) {
        super(c);
        this.boost = boost;
    }

    @Override
    public void move() {
        System.out.println("Moving at speed " + getSpeed() + " with sprite " + getSprite());
    }

    @Override
    public int getSpeed() {
        return c.getSpeed() + boost;
    }
}
