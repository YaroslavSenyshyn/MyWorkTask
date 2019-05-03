package taskVolodymyrLits;

public class Fly extends Bird {

    public Fly(String inhabitants, String color, Enum<BirdName> name) {
        super(inhabitants, color, name);
    }

    @Override
    void fly() {
        if (getFeathers().toLowerCase().equals("feathers: yes")) {
            System.out.println("I am: " + getName() + ", and I can FLY");
        }
    }

    @Override
    void breathe() {
        System.out.println("I breathe a beak");
    }

    @Override
    public void voice() {
        System.out.println("I like sing");
    }

    @Override
    public void sight() {
        System.out.println("I can't see in evening, I can do it in day");
    }


}
