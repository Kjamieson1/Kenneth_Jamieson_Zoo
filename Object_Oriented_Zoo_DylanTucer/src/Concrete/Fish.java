package Concrete;

import Abstract.Animal;
import Interfaces.*;

//sets up any fish object
public class Fish extends Animal 

    implements Swimmable { //Fish can swim?????

    String species;
    public Fish(String s) {
        species = s;
    }

    //ANIMAL FUNCTIONS
    @Override
    public void identify() {
        System.out.println(species);
    }
    @Override
    public void move() {
        swim(); //Since fish cant walk on land, it makes since to make this the default movement
    }

    @Override
    public void makeSound() {
        System.out.println("Blub blub");
    }

    //INTERFACE FUNCTIONS
    @Override
    public void swim() {
        System.out.println("swims");
    }
}
