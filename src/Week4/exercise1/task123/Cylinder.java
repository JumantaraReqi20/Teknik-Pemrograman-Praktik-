/*
[Task 1.2] Overriding the getArea() method
Method Overriding and "Super": The subclass Cylinder inherits getArea() method from
its superclass Circle. Try overriding the getArea() method in the subclass Cylinder to compute the
surface area (=2π×radius×height + 2×base-area) of the cylinder instead of base area. That is,
if getArea() is called by a Circle instance, it returns the area. If getArea() is called by
a Cylinder instance, it returns the surface area of the cylinder.
If you override the getArea() in the subclass Cylinder, the getVolume() no longer works. This is
because the getVolume() uses the overridden getArea() method found in the same class. (Java
runtime will search the superclass only if it cannot locate the method in this class). Fix
the getVolume().

[Task 1.3] Provide a toString() Method
Provide a toString() method to the Cylinder class, which overrides the toString() inherited from the superclass Circle


Author : Reqi Jumantara Hapid
Date   : 29 Februari 2024
 */

package Week4.exercise1.task123;
public class Cylinder extends Circle{
    private double height;

    //constructor with default color, radius, and height
    public Cylinder(){
        super();
        height = 1.0;
    }

    public Cylinder(double height){
        super();
        this.height = height;
    }

    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color){
        super(radius, color);
        this.height = height;
    }

    @Override
    public double getArea() {
        return (2*Math.PI*getRadius()*height + (2*super.getArea()));
    }

    @Override
    public String toString() {
        return "Cylinder: Subclass of " + super.toString() + " height = " + height;
    }

    public double getVolume(){
        return super.getArea()*height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
