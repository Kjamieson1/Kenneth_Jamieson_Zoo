public class Mammal extends Animal
{
    private String name, species;

    public Mammal(String name, String species)
    {
        this.name = name;
        this.species = species;
    }

        @Override
    String makeSound()
    {
        return "Ahhhhhh";
    }

    @Override
    String move()
    {
        return "Moving north";
    }

    public String getName()
    {
        return name;
    }

    public void setName(String n)
    {
        name = n;
    }

    public String getSpecies()
    {
        return species;
    }

    public  void setSpecies(String s)
    {
        species = s;
    }

    public String toString()
    {
        return name;
    }
}