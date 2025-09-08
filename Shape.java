abstract class Shape
{
    protected String color;
    protected String name;

    public Shape(String c, String n)
    {
        this.color = c;
        this.name = n;
    }

    public abstract double getArea();
    public abstract void draw();

}