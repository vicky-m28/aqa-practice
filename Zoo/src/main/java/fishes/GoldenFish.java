package fishes;

import creatures.Fish;

public class GoldenFish extends Fish {

    private String feature;

    public GoldenFish(String creatureName) {
        super(creatureName);
        feature = "I make wishes come true!";
    }

    public String feature() {
        return feature;
    }

    public void showCreatureInfo() {
        System.out.printf("I am %s the golden fish!\r\n", creatureName);
        System.out.println(breath());
        System.out.println(move());
        System.out.println(feature());
    }
}
