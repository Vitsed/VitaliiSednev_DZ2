import animals.*;
import food.*;

import java.util.ArrayList;

public class Zoo {

    public static void main(String[] args) {

        Worker worker = new Worker();

        Fish fish = new Fish();
        Duck duck = new Duck();
        Cougar cougar = new Cougar();
        Hare hare = new Hare();
        Lion lion = new Lion();
        Zebra zebra = new Zebra();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(fish);
        animals.add(duck);
        animals.add(cougar);
        animals.add(hare);
        animals.add(lion);
        animals.add(zebra);

        Meat beef = new Beef();
        Meat pork = new Pork();
        Meat cannedMeat = new CannedMeat();
        Grass hay = new Hay();
        Grass fruits = new Fruits();
        Grass vegetation = new Vegetation();

        ArrayList<Food> food = new ArrayList<>();
        food.add(beef);
        food.add(pork);
        food.add(cannedMeat);
        food.add(hay);
        food.add(fruits);
        food.add(vegetation);

        Swim[] pond = {duck, fish};

        for (Swim animal : pond) {
            animal.swim();
        }

        for(Animal animal : animals) {
            for(Food f : food) {
                System.out.print(animal.getClass().getSimpleName() + " is fed " + f.getClass().getSimpleName() + ", reaction:  ");
                worker.feed(animal, f);
            }
        }
    }
}
