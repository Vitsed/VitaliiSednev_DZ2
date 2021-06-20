package animals;

import food.Food;

public abstract class Animal {

    int energy;

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public abstract void eat(Food food);
}
