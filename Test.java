
import javax.swing.*;

public class Test
{
    public static void main(String[] args)
    {
        //Creating the shapes objects
        Shape circle = new Circle("Green", 6.0);
        Shape rectangle = new Rectangle("Red", 6.0, 4.0);

        //Putting the shapes into an array
        Shape[] shapes = {circle, rectangle};

        for(Shape shape : shapes)
        {
            //Printing out the drawing of the shape in the array
            shape.draw();
            //Printing out the area formatted two descomales back.
            System.out.println("Area: " + String.format("%.2f", shape.getArea()));
        }

        //Created frame object (Whats in quotes is the name of the page.)
        JFrame frame = new JFrame("Draw Triangle");
        JFrame frame2 = new JFrame("Draw Square");

        JFrame[] frames = {frame, frame2};

        for(JFrame frame1 : frames)
        {
            //Size of the canvas
            frame1.setSize(500,500);
            //Setting which object to add
            frame1.add(new Triangle(2, 6));
            frame1.add(new Square(5));
        
            frame1.setVisible(true);
        
            //Ends the program when the window is closed
            frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        
        //Setting which object to add
        frame.add(new Triangle(2, 6));
        frame2.add(new Square(5));
        //Allowing visablitly
        frame.setVisible(true);
        frame2.setVisible(true);
        //Ends the program when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Drawable triangle = new Triangle(2, 6);
        Drawable square = new Square(5);

        Drawable[] shapes2 = {triangle, square};

        for(Drawable shapes3 : shapes2)
        {
            shapes3.draw();
            System.out.println("Area: " + String.format("%.2f", shapes3.getArea()));
        }

            
            
    }
}