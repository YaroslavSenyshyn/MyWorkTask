package taskVolodymyrLits;

public class Saltish extends Fish {
    public Saltish(String inhabitants, String color, Enum<FishName> name) {
        super(inhabitants, color, name);
    }


    @Override
    void breathe() {
        System.out.println("I breathe gill gill gill");
    }

    @Override
    public void voice() {
        System.out.println("I communicate telepathically");
    }
}
