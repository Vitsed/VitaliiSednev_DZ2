import animals.Animal;
import animals.Size;

import java.util.HashMap;
import java.util.Map;

public class Cage<T extends Animal> {

    private HashMap<String, T> animals = new HashMap<>();
    private Size cageSize;

    public Size getCageSize() {
        return cageSize;
    }

    public void setCageSize(Size cageSize) {
        this.cageSize = cageSize;
    }

    public Map<String, T> getAnimals() {
        return animals;
    }

    public boolean addAnimal(T animal) {
        String name = animal.getName();
        int animalSize = checkSize(animal.getAnimalSize());
        int cageSize = checkSize(getCageSize());
        if (animalSize > cageSize) {
            return false;
        } else {
            animals.put(name, animal);
            return true;
        }
    }

    public boolean removeAnimal(T animal) {
        return animals.remove(animal.getName()) != null;
    }

    public T getAnimal(String name) {
        return animals.get(name);
    }

    private int checkSize(Size size) {
        int sum = 0;
        switch (size) {
            case ENORMOUS:
                sum++;
            case BIG:
                sum++;
            case MEDIUM:
                sum++;
            case SMALL:
                sum++;
        }
        return sum;
    }
}
