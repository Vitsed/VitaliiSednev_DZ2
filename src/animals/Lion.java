package animals;

public class Lion extends Carnivore implements Run, Voice {
    @Override
    public void run() {

    }

    @Override
    public String voice() {
        return "Roar";
    }
}
