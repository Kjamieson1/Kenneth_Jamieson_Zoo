package ConcreteB;

import ExceptionHandlers.Handlers;
import Interface.*;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.JFrame;

public class Circle extends BASESHAPE 
    implements Calculable, Describable, Drawable {
    
    float diameter;
    Ellipse2D.Double circle;
    float PI = (float) 3.14;
    Handlers handlit = new Handlers();

    public Circle() {
        System.out.println("Please enter the name of your Circle: ");
        name = handlit.realName();

        changeColor();

        System.out.println("Please enter the Diameter of your Circle: ");
        diameter = handlit.noNegative();

        circle = new Ellipse2D.Double(50, 75, diameter, diameter);
    }

    @Override
    public float getArea() {
        return PI * (diameter / 2) * (diameter / 2);
    }

    @Override 
    public void listAttributes() {
        System.out.println("Attributes of Diameter " + name + " are: ");
        System.out.println("Diameter: " + diameter);
        System.out.println("Area: " + getArea());
        System.out.println("Color: " + color);
    }

    @Override public void draw() {
        JFrame f = new JFrame();
        f.setSize(canvasWidth, canvasHeight);
        f.setTitle(name);
        f.setVisible(true);
        f.add(this);
    }

    //Canvas method
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(color);
        g2d.fill(circle);
    }
}
