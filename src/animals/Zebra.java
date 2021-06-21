package animals;

public class Zebra extends Herbivore implements Run, Voice {

    private String name;

    public Zebra() {
    }

    public Zebra(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

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
