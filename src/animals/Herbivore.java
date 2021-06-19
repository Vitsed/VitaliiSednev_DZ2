package animals;

import food.Food;
import food.Grass;

public abstract class Herbivore extends Animal {

    @Override
    public void eat(Food food) {
        if (food instanceof Grass) {
            System.out.println("Ingest food");
        } else {
            System.out.println("Herbivore don't eat meat!");
        }
    }
}
