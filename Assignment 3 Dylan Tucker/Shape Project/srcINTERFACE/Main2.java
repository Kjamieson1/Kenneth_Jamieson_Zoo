import ConcreteB.Circle;
import ConcreteB.Rectangle;
import ConcreteB.Square;

//notice how you cant save these guys to Shape, making an array would be a bugger.
public class Main2 {
    public static void main(String[] args) throws Exception {

        //square test
        System.out.println();
        Square square = new Square();
        square.listAttributes();
        square.draw();
        System.out.println("Now change its color");
        square.changeColor();
        square.draw();

        //rectangle test
        Rectangle rectangle = new Rectangle();
        rectangle.listAttributes();
        rectangle.draw();
        System.out.println("Now change its color");
        rectangle.changeColor();
        rectangle.draw();
        
        //circle test
        Circle circle = new Circle();
        circle.listAttributes();
        circle.draw();
        System.out.println("Now change its color");
        circle.changeColor();
        circle.draw();

        System.out.println("You may close the graphics window now.");
    }
}
