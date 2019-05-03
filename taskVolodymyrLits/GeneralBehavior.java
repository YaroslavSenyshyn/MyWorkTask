package taskVolodymyrLits;

public interface GeneralBehavior {
    void voice();

    default void sight() {
        System.out.println("I can see in evening");
    }
}
