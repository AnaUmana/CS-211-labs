package Exercise5;

import org.checkerframework.checker.units.qual.m;

public class Zoo {
    public static void main(String[] args) {

        Animal animalInstance = new Animal(false, "Animal", "Buddy");

        animalInstance.printInfo();
        animalInstance.printSleepInfo();
        animalInstance.printRoam();
        animalInstance.printFeed();

        Owl owlInstance = new Owl( true, "Owl", "Hedwig");
        
        owlInstance.printInfo();
        owlInstance.printSleepInfo();
        owlInstance.printRoam();
        owlInstance.printFeed();

        Monkey monkeyInstance = new Monkey( true, "Monkey", "Harambe");

        monkeyInstance.printInfo();
        monkeyInstance.printSleepInfo();
        monkeyInstance.printRoam();
        monkeyInstance.printFeed();
        monkeyInstance.printClimb();
    }
    
}
