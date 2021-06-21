package animals;

public class Fish extends Carnivore implements Swim{

    private String name;

    public Fish(){}

    public Fish(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void swim() {
        System.out.println("Fish is swimming");
    }
}
