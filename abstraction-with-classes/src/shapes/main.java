
import features.shape;
import shapes.Circle;
import shapes.Rectangle;

public class Mmain {
    public static void main(String[] args) {
        shape.Shape circle = new Circle(10.0f);
        shape.Shape rectangle = new Rectangle(10.0f, 20.0f);
        circle.calculateArea();
        circle.displayArea();
        rectangle.calculateArea();
        rectangle.displayArea();
    }
}