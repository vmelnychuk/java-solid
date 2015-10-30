package model;

import java.util.Random;

public class Hero {
    private int health;
    private int strength;

    public Hero(int health, int strength) {
        this.health = health;
        this.strength = strength;
    }

    public boolean attack(Monster monster) {
        Random random = new Random();
        int[] dice = new int[strength];
        for(int i = 0; i < strength; i++) {
            int side = random.nextInt(6) + 1;
            dice[i] = side;
        }
        int success = 0;
        for (int i : dice) {
            if (i > 4) {
                success++;
            }
        }
        if (success >= monster.getToughness()) {
            return true;
        } else {
            health -= monster.getDamageRate();
            return false;
        }
    }

    public boolean isDead() {
        return health <= 0;
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
