package taskVolodymyrLits;

public enum BirdName {
    Kiwi("feathers: no", "layEggs: yes"), Eagle("feathers: yes", "layEggs: yes"),
    Colibri("feathers: yes", "layEggs: yes"), Sparrow("feathers: yes", "layEggs: yes");

    private String feathers;
    private String layEggs;

    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public String getLayEggs() {
        return layEggs;
    }

    public void setLayEggs(String layEggs) {
        this.layEggs = layEggs;
    }

    BirdName(String feathers, String layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }
}
