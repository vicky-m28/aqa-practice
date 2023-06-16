package creatures;

public abstract class Creature {
    public String creatureName;

    // Constructor
    public  Creature(String creatureName){
        this.creatureName = creatureName;
    }

    // Methods
    public abstract String  breath();
    public abstract String move();
    public abstract String  feature();
    public abstract void showCreatureInfo();
}
