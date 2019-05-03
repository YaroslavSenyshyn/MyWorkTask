package taskVolodymyrLits;

public abstract class People extends Zoo {
    private String name;

    public String getName() {
        return name;
    }

    public People(String inhabitants, String name) {
        super(inhabitants);
        this.name = name;
    }

    @Override
    public String toString() {
        return "People name: " + name +", inhabitants='" + inhabitants;
    }
}
