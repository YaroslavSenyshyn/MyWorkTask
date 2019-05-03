package taskVolodymyrLits;

public abstract class Bird extends Animal {
    private Enum<BirdName> name;
    private String feathers;
    private String eggs;

    public Enum<BirdName> getName() {
        return name;
    }

    public String getEggs() {
        return eggs;
    }

    public String getFeathers() {
        return feathers;
    }

    public Bird(String inhabitants, String color, Enum<BirdName> name) {
        super(inhabitants, color);
        this.name = name;
        BirdName birdName = (BirdName) name;
        this.feathers = birdName.getFeathers();
        this.eggs = birdName.getLayEggs();
    }

    abstract void fly();

    @Override
    public String toString() {
        return "Bird name: " + name + ", " + feathers + ", " + eggs + ", inhabitants='" + inhabitants;
    }
}
