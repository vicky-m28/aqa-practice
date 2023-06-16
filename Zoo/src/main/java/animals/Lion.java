package animals;
import creatures.Animal;

public class Lion extends Animal {
    private String feature;

    public Lion(String creatureName) {
        super(creatureName);
        feature = "I am the King!";
    }

    public String feature() {
        return feature;
    }

    public void showCreatureInfo() {
        System.out.printf("I am %s the lion!\r\n", creatureName);
        System.out.println(breath());
        System.out.println(move());
        System.out.println(feature());
    }
}
