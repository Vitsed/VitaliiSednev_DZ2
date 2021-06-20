package animals;

public class Zebra extends Herbivore implements Run, Voice {
    @Override
    public void run() {
        System.out.println("Zebra is running");
    }

    @Override
    public void move() {

    }

    @Override
    public void creep() {

    }

    @Override
    public String voice() {
        return "Neigh";
    }
}
