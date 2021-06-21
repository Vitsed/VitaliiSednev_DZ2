import animals.*;
import food.*;

import java.util.ArrayList;

public class Zoo {

    public static void main(String[] args) {

        Worker worker = new Worker();

        Fish fish = new Fish("croudy");
        Duck duck = new Duck("kryakva");
        Cougar cougar = new Cougar("igan");
        Hare hare = new Hare("fluffy");
        Lion lion = new Lion("leva");
        Zebra zebra = new Zebra("melman");

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

        for (Animal animal : animals) {
            for (Food f : food) {
                System.out.print(animal.getClass().getSimpleName() + " is fed " + f.getClass().getSimpleName() + ", reaction:  ");
                worker.feed(animal, f);
            }
        }

        Cage<Carnivore> carnivoreCage = new Cage<>();
        carnivoreCage.setCageSize(Size.ENORMOUS);
        lion.setAnimalSize(Size.BIG);

        boolean isFit = carnivoreCage.addAnimal(lion);
        System.out.println(isFit + " " + lion.getName());

        System.out.println(carnivoreCage.getAnimals());


        System.out.println(carnivoreCage.getAnimal("leva"));

        System.out.println(carnivoreCage.removeAnimal(cougar));


    }

}
