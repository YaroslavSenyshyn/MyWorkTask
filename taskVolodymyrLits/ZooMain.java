package taskVolodymyrLits;

public class ZooMain {
    public static void main(String[] args) {

        Animal animal = new Fly("yes", "yellow", BirdName.Colibri);
        Herbivore herbivore = new Herbivore("yes", "black", MammalName.Elephant);


        Customer customer = new Customer("no", "Vasya");
        customer.viewMammalHerbivore(herbivore);


    }
}
