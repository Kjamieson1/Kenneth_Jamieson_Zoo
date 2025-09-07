package Concrete;

import Abstract.*;
import ExceptionHandlers.Handlers;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.*;
import javax.swing.JFrame;

public class Rectangle extends Shape {
    Handlers handlit = new Handlers();
    Rectangle2D.Double rectangle;

    float length;
    float width;

    public Rectangle() {
        System.out.println("Please enter the name of your Rectangle: ");
        name = handlit.realName();

        changeColor();

        System.out.println("Please enter the Length of your Rectangle: ");
        length = handlit.noNegative();

        System.out.println("Please enter the Width of your Rectangle: ");
        width = handlit.noNegative();

        rectangle = new Rectangle2D.Double(50, 75, length, width);

    }

    @Override
    public float getArea() {
        return length * width;
    }

     @Override 
    public void listAttributes() {
        System.out.println("Attributes of Rectangle " + name + " are: ");
        System.out.println("Length: " + length);
        System.out.println("width: " + width);
        System.out.println("Area: " + getArea());
        System.out.println("Color: " + color);
    }

    @Override public void draw() {
        JFrame f = new JFrame();
        f.setSize(canvasWidth, canvasHeight);
        f.setTitle(name);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.add(this);
    }

    //Canvas method
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(color);
        g2d.fill(rectangle);
    }
}
