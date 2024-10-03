package Exercise5;

public class Animal {
    private boolean noctural;
    private String type;
    private String name;

    public Animal(boolean noctural, String type, String name) {
        this.noctural = noctural;
        this.type = type;
        this.name = name;
    }

    public void printFeed() {
        System.out.println("Chomp chomp");

    }

    public void printSleepInfo() {
        if (noctural) {
            System.out.println(this.type + "s sleep during the day.");
        } else {
            System.out.println(this.type + "s sleep during the night.");
        }
    }

    public void printInfo() {
        System.out.println(this.name + " is a(n)" + this.type + ".");
    }

    public void printRoam() {
        System.out.println(this.name + " walks around.");
    }
}
