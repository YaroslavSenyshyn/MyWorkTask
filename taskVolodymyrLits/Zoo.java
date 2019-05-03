package taskVolodymyrLits;

public abstract class Zoo {
    public String inhabitants;


    public String getInhabitants() {
        return inhabitants;
    }

    public void setInhabitants(String inhabitants) {
        this.inhabitants = inhabitants;
    }


    public Zoo(String inhabitants) {
        this.inhabitants = inhabitants;
    }
}
