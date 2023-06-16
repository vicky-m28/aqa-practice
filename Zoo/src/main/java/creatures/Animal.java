package creatures;

public abstract class Animal extends Creature {
    private String breathType;
    private String moveType;
    public Animal(String creatureName) {
        super(creatureName);
        breathType = "I breath the air.";
        moveType = "I walk the earth.";
    }

    public String breath() {
        return breathType;
    }
    public String move() {
        return moveType;
    }
    public abstract String feature();
    public abstract void showCreatureInfo();
}


