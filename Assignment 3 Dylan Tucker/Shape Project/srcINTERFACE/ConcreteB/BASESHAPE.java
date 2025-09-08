package ConcreteB;

import ExceptionHandlers.Handlers;
import java.awt.*;
import javax.swing.JComponent;

public class BASESHAPE extends JComponent {
    
    public Color color;
    public String name;

    public int canvasWidth = 640;
    public int canvasHeight = 480;

    Handlers handlit = new Handlers();

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

    /* 
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(color);
        g2d.fill(square);
    }
        */
}
