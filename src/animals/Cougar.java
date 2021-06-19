package animals;

public class Cougar extends Carnivore implements Voice, Run {

    @Override
    public void run() {
        System.out.println("Cougar is running");
    }

    @Override
    public String voice() {
        return "Growl";
    }
}
