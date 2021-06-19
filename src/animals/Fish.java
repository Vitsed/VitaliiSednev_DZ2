package animals;

public class Fish extends Carnivore implements Swim{

    @Override
    public void swim() {
        System.out.println("Fish is swimming");
    }
}
