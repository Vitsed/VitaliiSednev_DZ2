package animals;

public class Lion extends Carnivore implements Run, Voice {

    private String name;

    public Lion() {
    }

    public Lion(String name) {
        this.name = name;
    }

    @Override
    public void run() {

    }

    @Override
    public void move() {

    }

    @Override
    public void creep() {

    }

    @Override
    public String voice() {
        return "Roar";
    }
}
