import Abstract.Animal;
import Concrete.*;
import Concrete.SUBclasses.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        /* 
        
        // LEVEL ONE AND LEVEL TWO CODE
        
        Bird bird = new Bird("Bird");  //Constructing an Animal with bird

        bird.identify();
        bird.move();
        bird.makeSound();

        System.out.println("");
        Fish fish = new Fish("Fish");  //Constructing an Animal with fish

        fish.identify();
        fish.move();
        fish.makeSound();

        System.out.println("");
        Mammal mammal = new Mammal("Mammal"); //Constructing an Animal with mammal

        mammal.identify();
        mammal.move();
        mammal.makeSound();
        mammal.swim();

        System.out.println("");
        Waterfowl waterfowl = new Waterfowl("Goose"); //Constructing an Animal with waterfowl

        waterfowl.identify();
        waterfowl.move();
        waterfowl.makeSound();
        waterfowl.swim();

        System.out.println("");
        Bat bat = new Bat("Bat");  //Constructing an Animal with bat

        bat.identify();
        bat.move();
        bat.makeSound();
        bat.fly();

        */

        //LEVEL THREE CODE
        boolean active = true; //determines whether to rerun or disable program
        Scanner scanner = new Scanner(System.in);

        while (active) {   //while loop used so that the user can try multiple functions without re-opening the program
        Animal[] animals = new Animal[5];  //Must initialize number of animals in array

        animals[0] = new Bird("bird");
        animals[1] = new Fish("fish");
        animals[2] = new Mammal("mammal");
        animals[3] = new Waterfowl("goose");
        animals[4] = new Bat("bat");


        ZooManager zooManager = new ZooManager(animals);

        //Real meat of the program
        System.out.println("Welcome to Zoo manager. Please enter a number to perform a function:");
        System.out.println
        ("1: Identify all animals in Zoo \n"
        + "2: Perform each animal sound \n"
        + "3: Have each animal move (in their usual way) \n"
        + "4: Have each animal that can swim do so \n"
        + "5: Have each animal that can fly do so");

        zooManager.takeInput();  //Takes user input, if they input an invalid answer it will re-ask

        System.out.println("Would you like to see something different? \n"
        + "Please enter 1 for yes or 2 for no");

        active = zooManager.programLoop();  //Takes user input to determine whether or not to close program
    }
    }
}
