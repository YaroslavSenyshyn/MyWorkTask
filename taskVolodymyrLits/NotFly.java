package taskVolodymyrLits;

public class NotFly extends Bird {


    public NotFly(String inhabitants, String color, Enum<BirdName> name) {
        super(inhabitants, color, name);
    }

    @Override
    void fly() {
        if (getFeathers().toLowerCase().equals("feathers: no")) {
            System.out.println("I am: " + getName() + ", and I can't Fly but I fast run");
        }
    }

    @Override
    void breathe() {
        System.out.println("I breathe a beak and nose");
    }

    @Override
    public void voice() {
        System.out.println("I like sing");
    }
}
