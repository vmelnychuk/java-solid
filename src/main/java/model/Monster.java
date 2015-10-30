package model;

public class Monster {
    private int toughness;
    private int damageRate;

    public Monster(int toughness, int damageRate) {
        this.toughness = toughness;
        this.damageRate = damageRate;
    }

    public int getDamageRate() {
        return damageRate;
    }

    public void setDamageRate(int damageRate) {
        this.damageRate = damageRate;
    }

    public int getToughness() {
        return toughness;
    }

    public void setToughness(int toughness) {
        this.toughness = toughness;
    }
}
