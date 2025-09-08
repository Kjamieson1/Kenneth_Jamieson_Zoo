
class Rectangle extends Shape
{
    //creating a varbibles so we can figure out area
    private final double width;
    private final double height;

    public Rectangle(String c, double w, double h)
    {
        //Calling from Shape class
        super(c, "Rectangle");
        this.width = w;
        this.height = h;
    }

    //Formula for area
    @Override
    public double getArea()
    {
        return width * height;
    }

    @Override
    public void draw()
    {
        System.out.println("Rectangle " + color + " being created with a size of " + width + " x " + height);
    }
}