import geometric.Circle;
import geometric.Rectangle;
import geometric.Shape;
import geometric.Square;
import resizeable.Resizeable;

public class TestSize {
    public static void main(String[] args) {
        double percent = (Math.random() * 100);
        System.out.println(" Percent increased: " + percent);

        Resizeable[] resizeables = new Resizeable[3];
        resizeables[0] = new Circle(10);
        resizeables[1] = new Rectangle(10, 10);
        resizeables[2] = new Square(100);

        for (Resizeable resizeable : resizeables) {
            resizeable.increaseSize(percent);
        }

        for (Resizeable resizeable : resizeables) {
            System.out.println(resizeable);
        }
        System.out.println();
        Shape[] shapes = new Shape[3];
        shapes[0] = (Circle) resizeables[0];
        shapes[1] = (Rectangle) resizeables[1];
        shapes[2] = (Square) resizeables[2];
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
