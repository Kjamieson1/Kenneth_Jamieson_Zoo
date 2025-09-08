import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

class Triangle extends JPanel implements Drawable
{
    private double base;
    private double height;

    public Triangle(double b, double h)
    {
        this.base = b;
        this.height = h;
    }
    @Override
    public void draw()
    {
        System.out.println("Drawing Triangle");
    }

    @Override
    public double getArea()
    {
        return (base * height) / 2;
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        //using g to set everythign
        g.setColor(Color.BLACK);
        

        //Deminsions of the triangle
        int x1 = 50;
        int y1 = 150;
        int y2 = 50;
        int y3 = 150;
        int x2 = 150;
        int x3 = 200;

        //Drawing the Triangle
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x3, y3);
        g.drawLine(x3, y3, x1, y1);
    }
}