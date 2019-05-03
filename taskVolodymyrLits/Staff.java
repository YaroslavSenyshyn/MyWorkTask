package taskVolodymyrLits;

public class Staff extends People implements behaviorStaff {
    private String position;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    public Staff(String inhabitants, String name, String position) {
        super(inhabitants, name);
        this.position = position;
    }

    @Override
    public void createMammalCarnivore(String inhabitants, String color, Enum<MammalName> name) {
        Carnivore carnivore = new Carnivore(inhabitants, color, name);
    }

    @Override
    public void deleteMammalCarnivore(Carnivore carnivore) {
        carnivore = null;
    }

    @Override
    public void createMammalHerbivore(String inhabitants, String color, Enum<MammalName> name) {
        Herbivore herbivore = new Herbivore(inhabitants, color, name);
    }

    @Override
    public void deleteMammalHerbivore(Herbivore herbivore) {
        herbivore = null;
    }

    @Override
    public void createFishSaltish(String inhabitants, String color, Enum<FishName> name) {
        Saltish saltish = new Saltish(inhabitants, color, name);
    }

    @Override
    public void deleteFishSaltish(Saltish saltish) {
        saltish = null;
    }

    @Override
    public void createFishLimnetic(String inhabitants, String color, Enum<FishName> name) {
        Limnetic limnetic = new Limnetic(inhabitants, color, name);
    }

    @Override
    public void deleteFishLimnetic(Limnetic limnetic) {
        limnetic = null;
    }

    @Override
    public void createBirdFly(String inhabitants, String color, Enum<BirdName> name) {
        Fly fly = new Fly(inhabitants, color, name);
    }

    @Override
    public void deleteBirdFly(Fly fly) {
        fly = null;
    }

    @Override
    public void createBirdNotFly(String inhabitants, String color, Enum<BirdName> name) {
        NotFly notFly = new NotFly(inhabitants, color, name);
    }

    @Override
    public void deleteBirdNotFly(NotFly notFly) {
        notFly = null;
    }
}
