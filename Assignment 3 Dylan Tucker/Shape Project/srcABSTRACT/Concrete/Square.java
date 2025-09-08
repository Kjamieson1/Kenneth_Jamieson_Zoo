package Concrete;

import Abstract.Shape;
import ExceptionHandlers.Handlers;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Square extends Shape {

    Rectangle2D.Double square;

    //String name;
    float sideLength;
    Handlers handlit = new Handlers();

    public Square() {
        System.out.println("Please enter the name of your Square: ");
        name = handlit.realName();

        changeColor();

        System.out.println("Please enter the Side Length of your Square: ");
        sideLength = handlit.noNegative();

        square = new Rectangle2D.Double(50, 75, sideLength, sideLength);
    }

    @Override
    public float getArea() {
        return sideLength * sideLength;
    }

    @Override 
    public void listAttributes() {
        System.out.println("Attributes of Square " + name + " are: ");
        System.out.println("Side length: " + sideLength);
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
        g2d.fill(square);
    }
}
