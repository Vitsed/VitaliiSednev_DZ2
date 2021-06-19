package animals;

public class Hare extends Herbivore implements Voice, Run {

    @Override
    public void run() {
        System.out.println("Hare is running");
    }

    @Override
    public String voice() {
        return "Scream";
    }
}
