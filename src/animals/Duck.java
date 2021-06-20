package animals;

public class Duck extends Herbivore implements Fly, Swim, Run, Voice {

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void takeOff() {
        System.out.println("Duck is taking off");
    }

    @Override
    public void landing() {
        System.out.println("Duck is landing");
    }

    @Override
    public void move() {
        System.out.println("Duck is moving");
    }

    @Override
    public void creep() {
        System.out.println("Duck can't creep");
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
