public class Main{

    private Animal[] an;

    public Main(Animal[] an)
    {
        this.an = an;
    }

    public void displayAnimals()
    {
        for(Animal an : an)
        {
            if(an instanceof Flyable)
            {
                ((Flyable) an).fly();
            }
        }
    }

    public static void main(String[] args)
    {
       Animal[] an = new Animal[3];
       an[0] = new Bird("Blue Jay", "Bird");
       an[1] = new Fish("Clown Fish", "Fish");
       an[2] = new Mammal("Human", "Mammal");

       Main showroom = new Main(an);

       
       System.out.println(an[0].toString());
       System.out.println(an[0].makeSound());
       System.out.println(an[0].move());
       showroom.displayAnimals();
       System.out.println("");
       System.out.println(an[1].toString());
       System.out.println(an[1].makeSound());
       System.out.println(an[1].move());
       System.out.println("");
       System.out.println(an[2].toString());
       System.out.println(an[2].makeSound());
       System.out.println(an[2].move());

    }
    
}