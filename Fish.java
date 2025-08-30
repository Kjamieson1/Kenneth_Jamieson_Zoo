public class Fish extends Animal
{
    private String name, species;

    public Fish(String name, String species)
    {
        this.name = name;
        this.species = species;
    }

        @Override
    String makeSound()
    {
        return "bloop";
    }

    @Override
    String move()
    {
        return "Moving south";
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
}