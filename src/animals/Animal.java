package animals;

import food.Food;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;

        Animal animal = (Animal) o;

        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
