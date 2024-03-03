/*
Exercise 2: Superclass Shape and its Subclasses Circle, Rectangle and Square

Author : Reqi Jumantara Hapid
Date   : 29 Februari 2024
 */

package Week4.exercise2;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(){
        super();
    }

    public Rectangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getArea(){
        return width*length;
    }

    public double getPerimeter(){
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width = " + width + " and length = " + length + " , which is a subclass of " + super.toString();
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
}
