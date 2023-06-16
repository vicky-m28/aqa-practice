package fishes;

import creatures.Fish;

public class StoneFish extends Fish {

    private String feature;

    public StoneFish(String creatureName) {
        super(creatureName);
        feature = "I am dangerous!";
    }

    public String feature() {
        return feature;
    }

    public void showCreatureInfo() {
        System.out.printf("I am %s the stone fish!\r\n", creatureName);
        System.out.println(breath());
        System.out.println(move());
        System.out.println(feature());
    }
}
