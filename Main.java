public class Main{

    public static void main(String[] args)
    {
       Animal[] an = new Animal[3];
       an[0] = new Bird("Blue Jay", "Bird");
       an[1] = new Fish("Clown", "Fish");
       an[2] = new Mammal("Human", "Mammal");

       System.out.println(an[0].getName());
       System.out.println(an[0].makeSound());
       System.out.println(an[0].move());
       System.out.println(an[1].makeSound());
       System.out.println(an[1].move());
       System.out.println(an[2].makeSound());
       System.out.println(an[1].move());

    }
}