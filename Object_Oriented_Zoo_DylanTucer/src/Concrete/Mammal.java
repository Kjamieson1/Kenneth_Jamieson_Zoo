package Concrete;

import Abstract.Animal;
import Interfaces.*;

public class Mammal extends Animal

    implements Swimmable{ //As a mammal myself, I do believe I am capable of swimming! 
    
    String species;

    public Mammal(String s) {
        species = s;
    }

    //ANIMAL FUNCTIONS
    @Override
    public void move() {
        System.out.println("moved");
    }

    @Override
    public void makeSound() {
        System.out.println("Egads!");
    }

    @Override
    public void identify() {
        System.out.println(species);
    }

    //INTERFACE FUNCTIONS
    @Override 
    public void swim() {
        System.out.println("swims decently");
    }
}
