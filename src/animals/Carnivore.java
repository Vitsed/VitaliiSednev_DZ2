package animals;

import food.Food;
import food.Meat;

public abstract class Carnivore extends Animal {

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println("Ingest food");
        } else {
            System.out.println("Carnivore don't eat grass!");
        }
    }
}
