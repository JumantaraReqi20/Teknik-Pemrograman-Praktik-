package Week5.case2;

public class Rectangle extends Shape{
    private double length;
    private double width;

    //-----------------------------------
    //  Constructor: Sets up the Triangle
    //-----------------------------------
    public Rectangle(double length, double width){
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    //------------------------------------------
    //  Returns the surface area of the triangle
    //------------------------------------------
    @Override
    public double area() {
        return length*width;
    }

    //-----------------------------------
    //  Return the triangle as a String
    //-----------------------------------
    @Override
    public String toString() {
        return super.toString() + " with length = " + length + " and width = " + width;
    }

    //-------------------------
    //  Getter and setter
    //-------------------------
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}