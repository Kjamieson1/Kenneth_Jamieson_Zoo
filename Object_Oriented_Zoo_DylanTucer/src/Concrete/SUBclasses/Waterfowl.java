package Concrete.SUBclasses;

import Concrete.Bird;
import Interfaces.Swimmable;

public class Waterfowl extends Bird

    implements Swimmable {
    
    public Waterfowl(String s) {
        super(s);
    }

    //ANIMAL FUNCTIONS

    @Override

    public void makeSound() {
        System.out.println("Honk");
    }
    
    //INTERFACE FUNCTIONS

    @Override
    public void swim() {
        System.out.println("Swims over water");
    }
}
