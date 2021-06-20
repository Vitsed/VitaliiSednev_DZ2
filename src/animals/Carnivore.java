package animals;

import food.Food;
import food.Meat;

public abstract class Carnivore extends Animal {

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Meat) {
            System.out.println("Ingest food");
        } else {
            throw new WrongFoodException();
        }
    }
}
