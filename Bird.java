class Bird extends Animal implements Flyable, Walkable
{
    private String name, species;

    public Bird(String name, String species)
    {
        this.name = name;
        this.species = species;
    }

    @Override
    String makeSound()
    {
        return "beep";
    }

    @Override
    String move()
    {
        return "Moving west";
    }

    @Override
    public String fly()
    {
        return "Flying with wings";
    }

    @Override
    public String walk()
    {
        return "Walking with stick legs";
    }

    //Geting the Name
    public String getName()
    {
        return name;
    }

    //Seting the Name
    public void setName(String n)
    {
        name = n;
    }

    //Getting the Species
    public String getSpecies()
    {
        return species;
    }

    //Setting the Species
    public  void setSpecies(String s)
    {
        species = s;
    }

    public String toString()
    {
        return name;
    }
}