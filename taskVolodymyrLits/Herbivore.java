package taskVolodymyrLits;

public class Herbivore extends Mammal {

    public Herbivore(String inhabitants, String color, Enum<MammalName> name) {
        super(inhabitants, color, name);
    }

    @Override
    void feed() {
        if (getFood().equals("food: grass")) {
            System.out.println("I am " + getName() + ", I herbivorous and dangerous");
        }
    }

    @Override
    void breathe() {
        if (getName().toString().equals("Elephant")) {
            System.out.println("I breathe trunk");
        }
    }

    @Override
    public void voice() {
        System.out.println("I like holler");
    }

    @Override
    public void sight() {
        if (getName().toString().equals("Camel")) {
            System.out.println("I can't see in evening, I can do it in day");
        }
    }
}
