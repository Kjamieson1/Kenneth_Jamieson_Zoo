import Abstract.Animal;
import Concrete.*;
import Concrete.SUBclasses.*;
import java.util.Scanner;

public class ZooManager {
    //important "variables"
    private Animal[] animals;
    Scanner scanner = new Scanner(System.in);

    //constructor, array passed in will be used here
    public ZooManager(Animal[] a) {  
        animals = a;
    }

    //Has the program list the name of each animal in the array
    public void identifyAll() {
        for (Animal animal : animals) {
            animal.identify();  //Repeatedly uses identify for this
        }
    }

    //Has each animal make their sound
    public void allSound() {
        for (Animal animal : animals) {
            animal.identify(); //Identifies the animal so that user knows what makes the sound
            animal.makeSound(); 
            System.out.println(); //print line used so output is more readable
        }
    }

    //Has each animal make default movement, same logic as above functions.
    public void allMove() {
        for (Animal animal : animals) {
            animal.identify();
            animal.move();
            System.out.println();
        }
    }

    //Speciifcally looks for which animals can swim and says how they do swim
    public void swimIfCan() {
        for (Animal animal : animals) {

            animal.identify();

            //EXAMPLE
            if (animal instanceof Fish) {  //animal is the entry in the array, Fish is the class with a swim function
                ((Fish) animal).swim(); //DISCOVERY: in order to use functions not in the original abstract class, you must cast the object into the correct object type for the sake of that function
            }

            //Repeats for each class with a swim function. Maybe there is a better way, can implement later. Maybe if you could check the interfaces?
            if (animal instanceof Mammal) {
                ((Mammal) animal).swim();
            }

            if (animal instanceof Waterfowl) {
                ((Waterfowl) animal).swim();
            }

            System.out.println();
        }
    }

    //Same as swimIfCan but for the fly function 
    public void flyIfCan() {
        for (Animal animal : animals) {

            animal.identify();

            if (animal instanceof Bird) {
                ((Bird) animal).fly();
            }

            if (animal instanceof Bat) {
                ((Bat) animal).fly();
            }

            System.out.println();

        }
    }

    //Takes user input when choosing which function to perform. 1 to 5 is used so switch-case can be used easily
    public void takeInput() {
        int input = scanner.nextInt();

        switch (input) {  //uses the input to decide what function to do
            case 1: //User puts in 1, this function will be done, and etc.
                identifyAll();
                break;
            case 2:
                allSound();
                break;
            case 3:
                allMove();
                break;
            case 4:
                swimIfCan();
                break;
            case 5:
                flyIfCan();
                break;
            default: //Exception handler for if user does not put a number between 1 to 5. Fortunately, only a true dumb dumb would do that! (haha.)
                System.out.println("Please enter a number from 1 to 5.");

                takeInput(); //Function calls itself to redo everything. Not sure if you call this recursive but I never knew a function could call itself until I learned about recursive functions
        }
    }

    //Similar logic to Function above, but is a return function. If it returns false, the program will close.
    public boolean programLoop() {
        boolean bool = false;
        int input = scanner.nextInt();

        if (input == 1) {  //1 means the user said yes, so the program will not close
            bool = true;
        } 
        
        else if (input == 2) {  //2 means the user said no, so program will close
            bool = false;
        }

        else {  //anything else means the user is a big dumb dumb.
            System.out.println("Please enter either 1 or 2");
            programLoop(); //function loops until they get it right.
        }

        return bool; //return statement, JAVA doesnt like it if you put this in the if statements, even when theres absolutwly no way it could return anything other than true or

    }
}
