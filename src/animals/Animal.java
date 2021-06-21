package animals;

import food.Food;

public abstract class Animal {

    int energy;
    String name;
    Size animalSize;

    public Size getAnimalSize() {
        return animalSize;
    }

    public void setAnimalSize(Size animalSize) {
        this.animalSize = animalSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public abstract void eat(Food food) throws WrongFoodException;

}
