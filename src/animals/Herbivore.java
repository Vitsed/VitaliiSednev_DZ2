package animals;

import food.Food;
import food.Grass;

public abstract class Herbivore extends Animal {

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Grass) {
            System.out.println("Ingest food");
        } else {
            throw new WrongFoodException();
        }
    }
}
