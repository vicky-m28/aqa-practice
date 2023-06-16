package creatures;

public abstract class Bird extends Creature{
    private String breathType;
    private String moveType;
    public Bird(String creatureName) {
        super(creatureName);
        breathType = "I breath the air.";
        moveType = "I fly in the air.";
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
