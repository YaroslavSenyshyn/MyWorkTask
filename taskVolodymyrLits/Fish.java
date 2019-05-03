package taskVolodymyrLits;

public abstract class Fish extends Animal {
    private Enum<FishName> name;
    private String birth;
    private String squama;

    public Enum<FishName> getName() {
        return name;
    }

    public String getBirth() {
        return birth;
    }

    public String getSquama() {
        return squama;
    }

    public Fish(String inhabitants, String color, Enum<FishName> name) {
        super(inhabitants, color);
        this.name = name;
        FishName fishName = (FishName) name;
        this.birth = fishName.getBirth();
        this.squama = fishName.getSquama();
    }

    @Override
    public String toString() {
        return "Fish name: " + name + ", " + birth + ", " + squama + ", inhabitants: '" + inhabitants;
    }
}
