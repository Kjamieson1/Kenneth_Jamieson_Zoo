class Circle extends Shape
{
    //creating a varbible radius so we can figure out area
    private final double radius;

    public Circle(String c, double r)
    {
        //Calling from Shape class
        super(c, "Circle");
        this.radius = r;
    }

    //Formula for area
    @Override
    public double getArea()
    {
        //Java's Math function
        return Math.PI * radius * radius;
    }

    @Override
    public void draw()
    {
        System.out.println("Ciricle " + color + " being created with a radius of " + radius);
    }
    
}