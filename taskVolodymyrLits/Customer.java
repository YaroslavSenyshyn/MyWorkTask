package taskVolodymyrLits;

public class Customer extends People implements behaviorCustomer {

    public Customer(String inhabitants, String name) {
        super(inhabitants, name);
    }

    @Override
    public void viewMammalHerbivore(Herbivore herbivore) {
        System.out.println(herbivore);
        herbivore.feed();
        herbivore.breathe();
        herbivore.sight();
        herbivore.voice();
    }

    @Override
    public void viewMammalCarnivore(Carnivore carnivore) {
        System.out.println(carnivore);
        carnivore.feed();
        carnivore.breathe();
        carnivore.sight();
        carnivore.voice();
    }

    @Override
    public void viewFishSaltish(Saltish saltish) {
        System.out.println(saltish);
        saltish.breathe();
        saltish.sight();
        saltish.voice();
    }

    @Override
    public void viewFishLimnetic(Limnetic limnetic) {
        System.out.println(limnetic);
        limnetic.breathe();
        limnetic.sight();
        limnetic.voice();

    }

    @Override
    public void viewBirdFly(Fly fly) {
        System.out.println(fly);
        fly.fly();
        fly.breathe();
        fly.sight();
        fly.voice();
    }

    @Override
    public void viewBirdNotFly(NotFly notFly) {
        System.out.println(notFly);
        notFly.fly();
        notFly.breathe();
        notFly.sight();
        notFly.voice();
    }


}
