package Exercise5;

public class Monkey extends Animal{
    public Monkey(boolean noctural, String type, String name) {
        super(nocturnal, type, name);
    }

    public void printFeed() {
        System.out.println("You give this monkey some bananas.");
    }

    public void printClimb() {
        System.out.println("This monkey climbs a tree!");
    }

}
