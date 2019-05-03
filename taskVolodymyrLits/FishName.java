package taskVolodymyrLits;

public enum FishName {
    Carp("birth: eggs","squama: yes"), Pike("birth: eggs","squama: yes"),
    Shark("birth: viviparous","squama: no"), Tuna("birth: aggs","squama: yes");
    private String birth;
    private String squama;

    public String getBirth() {
        return birth;
    }

    public String getSquama() {
        return squama;
    }

    FishName(String birth, String squama) {
        this.birth = birth;
        this.squama = squama;
    }
}
