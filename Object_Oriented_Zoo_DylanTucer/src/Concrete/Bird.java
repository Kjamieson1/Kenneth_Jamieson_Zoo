package Concrete;

import Abstract.Animal;
import Interfaces.*;

//sets up any bird object
public class Bird extends Animal 
    
    implements Flyable {

    public String species;  //species name of object

    public Bird(String s) {
        species = s;
    }

    //ANIMAL FUNCTIONS
    @Override public void identify() {    //identifies species
        System.out.println(species);
    }

    @Override
    public void move() {     //uses fly function from flyable interface to tell bird how to move
        fly();
    }

    @Override
    public void makeSound() {   //overriding sound function
        System.out.println("Caw!");
    }

    //INTERACE FUNCTIONS
    @Override
    public void fly() {   //overriding fly function to make it usuable
        System.out.println("Flies");   
    }
    
}
