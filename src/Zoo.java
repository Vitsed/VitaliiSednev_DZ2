import animals.*;
import food.Grass;
import food.Meat;

public class Zoo {

    public static void main(String[] args) {
        Meat meat = new Meat();
        Grass grass = new Grass();
        Worker worker = new Worker();
        Fish fish = new Fish();
        Duck duck = new Duck();
        Cougar cougar = new Cougar();
        Hare hare = new Hare();
        Lion lion = new Lion();
        Zebra zebra = new Zebra();

        Swim[] pond = {duck, fish};

        for (Swim animal : pond) {
            animal.swim();
        }

        worker.feed(lion, grass);
        worker.feed(lion, meat);
        worker.getVoice(lion);
//        worker.getVoice(fish);
        worker.feed(duck, meat);
        worker.feed(duck, grass);

    }
}
