package Abstract;

import ExceptionHandlers.Handlers;
import java.awt.*;
import javax.swing.JComponent;


public abstract class Shape extends JComponent{

    public Color color;
    public String name;

    public int canvasWidth = 640;
    public int canvasHeight = 480;

    Handlers handlit = new Handlers();

    public abstract float getArea();

    public abstract void listAttributes();

    public void changeColor() {
        int red;
        int green;
        int blue;
        System.out.println("Please enter an RGB value for the color you would like to use");

        System.out.println("Red value: ");
        red = (int) handlit.noNegative();

        System.out.println("Green value: ");
        green = (int) handlit.noNegative();

        System.out.println("Blue value: ");
        blue = (int) handlit.noNegative();

        color = new Color(red, green, blue);
    }

    public abstract void draw();

    @Override
    protected abstract void paintComponent(Graphics g);
}
