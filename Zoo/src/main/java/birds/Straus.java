package birds;
import creatures.Bird;

public class Straus extends Bird {
    private String feature;

    public Straus(String creatureName) {
        super(creatureName);
        feature = "I lied in previous line. I can't fly!";
    }

    public String feature() {
        return feature;
    }

    public void showCreatureInfo() {
        System.out.printf("I am %s the straus!\r\n", creatureName);
        System.out.println(breath());
        System.out.println(move());
        System.out.println(feature());
    }
}
