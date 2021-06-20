import animals.Animal;

import java.util.HashMap;
import java.util.Map;

public class Cage<T extends Animal> {

    private Map<String, T> animals = new HashMap<>();

    public boolean addAnimal(T animal) {
        return animals.put(animal.getName(), animal) != null;
    }

    public boolean removeAnimal(T animal) {
        return animals.remove(animal.getName()) != null;
    }

    public T getAnimal(String name) {
        return animals.get(name);
    }
}
