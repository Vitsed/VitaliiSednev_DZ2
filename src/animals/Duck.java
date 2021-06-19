package animals;

public class Duck extends Herbivore implements Fly, Swim, Run, Voice {

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void run() {
        System.out.println("Duck is running");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }

    @Override
    public String voice() {
        return "Quack";
    }
}
