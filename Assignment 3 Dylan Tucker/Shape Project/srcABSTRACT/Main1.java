import Abstract.Shape;
import ConcreteA.Circle;
import ConcreteA.Rectangle;
import ConcreteA.Square;

public class Main1 {
    public static void main(String[] args) throws Exception {
        
        //Square test
        Shape square = new Square();  
        square.listAttributes(); 
        square.draw();
        System.out.println("Now change its color");
        square.changeColor();
        square.draw();

        //Rectangle test
        Shape rectangle = new Rectangle();
        rectangle.listAttributes();
        rectangle.draw();
        System.out.println("Now change its color");
        rectangle.changeColor();
        rectangle.draw();
        
        //circle test
        Shape circle = new Circle();
        circle.listAttributes();
        circle.draw();
        System.out.println("Now change its color");
        circle.changeColor();
        circle.draw();

        System.out.println("You may close the graphics window now.");
    }
}
