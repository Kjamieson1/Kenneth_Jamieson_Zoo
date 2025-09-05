package Concrete.SUBclasses;

import Concrete.Mammal;
import Interfaces.Flyable;

public class Bat extends Mammal 

    implements Flyable {

    public Bat(String s) {
        super(s);
    }

    //ANIMAL FUNCTIONS
    @Override
    public void makeSound() {
        System.out.println("Squeak");
    }

    //INTERFACE FUNCTIONS
    @Override
    public void fly() {
        System.out.println("Flies decently");
    }
    
}
