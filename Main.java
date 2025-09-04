
import java.util.ArrayList;

public class Main{

    public static void main(String[] args)
    {

        ArrayList<String> Animals = new ArrayList<String>();

        Fish f = new Fish("Clown", "Fish");
        Bird b = new Bird("Crow", "Bird");
        Mammal m = new Mammal("Human", "Mammal");

        Animals.add(f.toString());
        Animals.add(f.move());
        Animals.add(f.makeSound());
        Animals.add("]");
        Animals.add(b.toString());
        Animals.add(b.move());
        Animals.add(b.makeSound());
        Animals.add(b.fly());
        Animals.add(b.walk());
        Animals.add(m.toString());
        Animals.add(m.move());
        Animals.add(m.makeSound());
        Animals.add(m.fly());
        Animals.add(m.walk());

       
        System.out.println(Animals);
       
       
    }
    
}