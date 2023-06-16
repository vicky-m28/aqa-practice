package animals;

import creatures.Animal;

public class Rabbit extends Animal {
    private String feature;

    public Rabbit(String creatureName) {
        super(creatureName);
        feature = "My ears are longer than yours!";
    }

    public String feature() {
        return feature;
    }

    public void showCreatureInfo() {
        System.out.printf("I am %s the rabbit!\r\n", creatureName);
        System.out.println(breath());
        System.out.println(move());
        System.out.println(feature());
    }
}
