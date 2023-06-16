package birds;
import creatures.Bird;

public class Owl extends Bird {
    private String feature;

    public Owl(String creatureName) {
        super(creatureName);
        feature = "I deliver magic post!";
    }

    public String feature() {
        return feature;
    }

    public void showCreatureInfo() {
        System.out.printf("I am %s the owl!\r\n", creatureName);
        System.out.println(breath());
        System.out.println(move());
        System.out.println(feature());
    }
}
