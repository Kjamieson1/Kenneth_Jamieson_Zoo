class Mammal extends Animal implements Flyable, Walkable
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

    public String fly()
    {
       return "On a Plane";
    }

    public String walk()
    {
        return "Walking on foot";
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