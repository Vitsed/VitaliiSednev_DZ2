package animals;

public class Hare extends Herbivore implements Voice, Run {

    private String name;

    public Hare() {
    }

    public Hare(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Hare is running");
    }

    @Override
    public void move() {

    }

    @Override
    public void creep() {

    }

    @Override
    public String voice() {
        return "Scream";
    }
}
