import animals.Animal;
import animals.Size;

import java.util.HashMap;
import java.util.Map;

public class Cage<T extends Animal> {

    private Map<String, T> animals = new HashMap<>();
    private Size cageSize;

    public Size getCageSize() {
        return cageSize;
    }

    public void setCageSize(Size cageSize) {
        this.cageSize = cageSize;
    }

    public boolean addAnimal(T animal) {
        if(animal.getAnimalSize() != cageSize) {
            return false;
        }
        return animals.put(animal.getName(), animal) != null;
    }

    public boolean removeAnimal(T animal) {
        return animals.remove(animal.getName()) != null;
    }

    public T getAnimal(String name) {
        return animals.get(name);
    }
}
