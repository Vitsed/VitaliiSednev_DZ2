import animals.*;
import food.*;

public class Zoo {

    public static void main(String[] args) {

        Worker worker = new Worker();

        Fish fish = new Fish();
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

        Swim[] pond = {duck, fish};

        for (Swim animal : pond) {
            animal.swim();
        }

        for (Animal animal : animals) {
            for (Food f : food) {
                System.out.print(animal.getClass().getSimpleName() + " is fed " + f.getClass().getSimpleName() + ", reaction:  ");
                worker.feed(animal, f);
            }
        }

        Voice[] voices = {lion, duck, cougar, zebra, hare, /*fish*/}; // not compile if we try to add voiceless animal

        for (Voice animalVoice : voices) {
            System.out.println(animalVoice.getClass().getSimpleName() + " is saying: " );
            worker.getVoice(animalVoice);
        }

    }
}
