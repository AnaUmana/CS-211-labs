package Exercise5;

public class Owl extends Animal {
    public Owl(boolean nocturnal, String type, String name) {
        super(nocturnal, type, name);
    }

    public void printRoam() {
        System.out.println("This owl flies around.");
    }

    public void printFeed() {
        System.out.println("You give this owl some mice.");
    }
}
