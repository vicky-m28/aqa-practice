import animals.Lion;
import animals.Pig;
import animals.Rabbit;
import birds.Owl;
import birds.Parrot;
import birds.Straus;
import creatures.Creature;
import fishes.ClownFish;
import fishes.GoldenFish;
import fishes.StoneFish;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Animals
        Lion leo = new Lion("Leo");
        Lion simba = new Lion("Simba");
        Lion mufasa = new Lion("Mufasa");
        Pig peggy = new Pig("Peggy");
        Pig peppa = new Pig("Peppa");
        Rabbit roger = new Rabbit("Roger");

        // Birds
        Owl hedwig = new Owl("Hedwig");
        Parrot gosha = new Parrot("Gosha");
        Straus stepan = new Straus("Stepan");

        // Fishes
        ClownFish nemo = new ClownFish("Nemo");
        GoldenFish miracle = new GoldenFish("Miracle");
        StoneFish lara = new StoneFish("Lara");

        ArrayList <Creature> creatureNames = new ArrayList<>();
        creatureNames.add(leo);
        creatureNames.add(simba);
        creatureNames.add(mufasa);
        creatureNames.add(peggy);
        creatureNames.add(peppa);
        creatureNames.add(roger);
        creatureNames.add(hedwig);
        creatureNames.add(gosha);
        creatureNames.add(stepan);
        creatureNames.add(nemo);
        creatureNames.add(miracle);
        creatureNames.add(lara);

        // Display the list
        int id =1;
        for (Creature c : creatureNames){
            System.out.println(id + " " + c.creatureName);
            id++;
        }

        // Creature selection
        System.out.println("Select a creature o press 0 to finish");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while (number != 0) {
            switch (number) {
                case 1:
                    creatureNames.get(0).showCreatureInfo();
                    break;
                case 2:
                    creatureNames.get(1).showCreatureInfo();
                    break;
                case 3:
                    creatureNames.get(2).showCreatureInfo();
                    break;
                case 4:
                    creatureNames.get(3).showCreatureInfo();
                    break;
                case 5:
                    creatureNames.get(4).showCreatureInfo();
                    break;
                case 6:
                    creatureNames.get(5).showCreatureInfo();
                    break;
                case 7:
                    creatureNames.get(6).showCreatureInfo();
                    break;
                case 8:
                    creatureNames.get(7).showCreatureInfo();
                    break;
                case 9:
                    creatureNames.get(8).showCreatureInfo();
                    break;
                case 10:
                    creatureNames.get(9).showCreatureInfo();
                    break;
                case 11:
                    creatureNames.get(10).showCreatureInfo();
                    break;
                case 12:
                    creatureNames.get(11).showCreatureInfo();
                    break;
                default:
                    System.out.println("No such number");
            }
            System.out.println("Select a creature or press 0 to finish");
            number = scanner.nextInt();
            scanner.nextLine();
        }
    }
}