import animals.*;
import food.*;

public class Zoo {

    public static void main(String[] args) {

        Worker worker = new Worker();

        Fish fish = new Fish();
        fish.setAnimalSize(Size.SMALL);
        Duck duck = new Duck();
        Cougar cougar = new Cougar();
        Hare hare = new Hare();
        Lion lion = new Lion();
        Zebra zebra = new Zebra();

        Animal[] animals = {fish, duck, cougar, hare, lion, zebra};

        Meat beef = new Beef();
        Meat pork = new Pork();
        Meat cannedMeat = new CannedMeat();
        Grass hay = new Hay();
        Grass fruits = new Fruits();
        Grass vegetation = new Vegetation();

        Food[] food = {beef, pork, cannedMeat, hay, fruits, vegetation};

        for (Animal animal : animals) {
            for (Food f : food) {
                System.out.print(animal.getClass().getSimpleName() + " is fed " + f.getClass().getSimpleName() + ", reaction:  ");
                worker.feed(animal, f);
            }
        }

        Cage<Carnivore> carnivoreCage = new Cage<>();

        lion.setName("leva");

        carnivoreCage.addAnimal(lion);
        carnivoreCage.addAnimal(fish);
        carnivoreCage.addAnimal(cougar);

        System.out.println(carnivoreCage.getAnimal("leva"));



    }
}
