package taskVolodymyrLits;

public class Carnivore extends Mammal {

    public Carnivore(String inhabitants, String color, Enum<MammalName> name) {
        super(inhabitants, color, name);
    }

    @Override
    void feed() {
        if (getFood().equals("food: meat")) {
            System.out.println("I am " + getName() + ", and I predator");
        }
    }

    @Override
    void breathe() {
        System.out.println("I breathe nose");
    }

    @Override
    public void voice() {
        System.out.println("I like roaring");
    }

}
