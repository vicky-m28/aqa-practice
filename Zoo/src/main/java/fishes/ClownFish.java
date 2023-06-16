package fishes;

import creatures.Fish;

public class ClownFish extends Fish {

    private String feature;

    public ClownFish(String creatureName) {
        super(creatureName);
        feature = "I have red and white stripes!";
    }

    public String feature() {
        return feature;
    }

    public void showCreatureInfo() {
        System.out.printf("I am %s the clown fish!\r\n", creatureName);
        System.out.println(breath());
        System.out.println(move());
        System.out.println(feature());
    }
}
