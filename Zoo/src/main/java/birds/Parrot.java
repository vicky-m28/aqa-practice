package birds;
import creatures.Bird;

public class Parrot extends Bird {
    private String feature;

    public Parrot(String creatureName) {
        super(creatureName);
        feature = "I can speak!";
    }

    public String feature() {
        return feature;
    }

    public void showCreatureInfo() {
        System.out.printf("I am %s the parrot!\r\n", creatureName);
        System.out.println(breath());
        System.out.println(move());
        System.out.println(feature());
    }
}
