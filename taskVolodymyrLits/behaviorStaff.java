package taskVolodymyrLits;

public interface behaviorStaff {

    void createMammalCarnivore (String inhabitants, String color, Enum<MammalName> name);
    void deleteMammalCarnivore (Carnivore carnivore);
    void createMammalHerbivore (String inhabitants, String color, Enum<MammalName> name);
    void deleteMammalHerbivore (Herbivore herbivore);
    void createFishSaltish(String inhabitants, String color, Enum<FishName> name);
    void deleteFishSaltish(Saltish saltish);
    void createFishLimnetic(String inhabitants, String color, Enum<FishName> name);
    void deleteFishLimnetic(Limnetic limnetic);
    void createBirdFly(String inhabitants, String color, Enum<BirdName> name);
    void deleteBirdFly(Fly fly);
    void createBirdNotFly(String inhabitants, String color, Enum<BirdName> name);
    void deleteBirdNotFly(NotFly notFly);

}
