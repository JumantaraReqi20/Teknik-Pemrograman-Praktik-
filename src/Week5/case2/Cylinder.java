package Week5.case2;

public class Cylinder extends Shape{
    private double radius;
    private double height;

    //-----------------------------------
    //  Constructor: Sets up the Cylinder
    //-----------------------------------
    public Cylinder(double radius, double height){
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    //------------------------------------------
    //  Returns the surface area of the Cylinder
    //------------------------------------------
    @Override
    public double area() {
        return Math.PI*radius*radius*height;
    }

    //-----------------------------------
    //  Return the Cylinder as a String
    //-----------------------------------
    @Override
    public String toString() {
        return super.toString() + " with radius = " + radius + " and height = " + height;
    }

    //-------------------------
    //  Getter and setter
    //-------------------------
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
