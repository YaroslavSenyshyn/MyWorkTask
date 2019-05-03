package taskVolodymyrLits;

public enum MammalName {
    Lion ("food: meat", "fur: yes"), Tiger("food: meat", "fur: yes"),
    Elephant("food: grass", "fur: no"), Camel("food: grass", "fur: yes");

    private String food;
    private String fur;

    public String getFood() {
        return food;
    }

    public String getFur() {
        return fur;
    }

    MammalName(String food, String fur) {
        this.food = food;
        this.fur = fur;
    }
}
