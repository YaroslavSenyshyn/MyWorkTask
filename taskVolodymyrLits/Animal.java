package taskVolodymyrLits;

public abstract class Animal extends Zoo implements GeneralBehavior{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Animal(String inhabitants, String color) {
        super(inhabitants);
        this.color = color;
    }

    abstract void breathe();
}
