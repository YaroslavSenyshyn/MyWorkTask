package taskVolodymyrLits;

public class Limnetic extends Fish {
    public Limnetic(String inhabitants, String color, Enum<FishName> name) {
        super(inhabitants, color, name);
    }

    @Override
    void breathe() {
        System.out.println("I breathe gill");
    }

    @Override
    public void voice() {
        System.out.println("I'm communicating with instincts");
    }
}
