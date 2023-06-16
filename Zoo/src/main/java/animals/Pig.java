package animals;

import creatures.Animal;

public class Pig extends Animal {
    private String feature;

    public Pig (String creatureName) {
        super(creatureName);
        feature = "I have s piglet!";
    }

    public String feature() {
        return feature;
    }

    public void showCreatureInfo() {
        System.out.printf("I am %s the pig!\r\n", creatureName);
        System.out.println(breath());
        System.out.println(move());
        System.out.println(feature());
    }
}
