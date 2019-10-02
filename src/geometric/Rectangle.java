package geometric;

import resizeable.Resizeable;

public class Rectangle extends Shape implements Resizeable {
    @Override
    public void increaseSize(double percent) {
//        setWidth(getWidth() * percent);
//        setLength(getLength() * percent);
        this.width = getWidth()*percent/100;
        this.length = getLength()*percent/100;
    }

    private double width;
    private double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle( double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return width * length;
    }

    public double getPerimeter(){
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }
}
