import ConcreteB.Circle;
import ConcreteB.Rectangle;
import ConcreteB.Square;

public class Main2 {
    public static void main(String[] args) throws Exception {

        System.out.println();
        Square square = new Square();
        square.listAttributes();
        square.draw();
        System.out.println("Now change its color");
        square.changeColor();
        square.draw();

        Rectangle rectangle = new Rectangle();
        rectangle.listAttributes();
        rectangle.draw();
        System.out.println("Now change its color");
        rectangle.changeColor();
        rectangle.draw();
        
        Circle circle = new Circle();
        circle.listAttributes();
        circle.draw();
        System.out.println("Now change its color");
        circle.changeColor();
        circle.draw();

        System.out.println("You may close the graphics window now.");


    }
}
