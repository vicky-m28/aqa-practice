package creatures;

public abstract class Fish extends Creature{
    private String breathType;
    private String moveType;
    public Fish (String creatureName) {
        super(creatureName);
        breathType = "I breath underwater.";
        moveType = "I swim in water.";
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
