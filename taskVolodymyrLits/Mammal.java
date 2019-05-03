package taskVolodymyrLits;

public abstract class Mammal extends Animal {
    private Enum<MammalName> name;
    private String food;
    private String fur;

    public Enum<MammalName> getName() {
        return name;
    }

    public String getFood() {
        return food;
    }

    public String getFur() {
        return fur;
    }

    public Mammal(String inhabitants, String color, Enum<MammalName> name) {
        super(inhabitants, color);
        this.name = name;
        MammalName mammalName = (MammalName) name;
        this.food = mammalName.getFood();
        this.fur = mammalName.getFur();
    }

    abstract void feed();

    @Override
    public String toString() {
        return "Mammal name: " + name + ", " + food + ", " + fur + ", inhabitants: '" + inhabitants;
    }
}
