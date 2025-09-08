package com.example.game;

public class DamageBoost extends CharacterDecorator {
    private int boost;

    public DamageBoost(Character c, int boost) {
        super(c);
        this.boost = boost;
    }

    @Override
    public void attack() {
        System.out.println("Attacking with damage " + getDamage() + " using sprite " + getSprite());
    }

    @Override
    public int getDamage() {
        return c.getDamage() + boost;
    }
}
