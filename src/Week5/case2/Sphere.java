package Week5.case2;

public class Sphere extends Shape{
    private double radius;

    //-----------------------------------
    //  Constructor: Sets up the Sphere
    //-----------------------------------
    public Sphere(double r){
        super("Sphere");
        radius = r;
    }

    //------------------------------------------
    //  Returns the surface area of the Sphere
    //------------------------------------------
    @Override
    public double area() {
        return 4*Math.PI*radius*radius;
    }

    //-----------------------------------
    //  Return the sphere as a String
    //-----------------------------------
    @Override
    public String toString() {
        return super.toString() + " with radius = " + radius;
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
}