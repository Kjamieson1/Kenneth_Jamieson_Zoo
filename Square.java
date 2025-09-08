import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

class Square extends JPanel implements Drawable
{
    private double side;

    public Square(double s)
    {
        this.side = s;
    }

    @Override
    public void draw()
    {
        System.out.println("Drawing square");
    }

    public double getArea()
    {
        return side * side;
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
        int x2 = 50;
        int y2 = 50;
        int x3 = 150;
        int y3 = 50;
        int x4 = 150;
        int y4 = 150;

        //Drawing the Triangle
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x3, y3);
        g.drawLine(x3, y3, x4, y4);
        g.drawLine(x4, y4, x1, y1);
    }
}