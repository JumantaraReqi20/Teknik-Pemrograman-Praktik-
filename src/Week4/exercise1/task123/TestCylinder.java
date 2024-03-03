/*
[Task 1.1] Modify class Circle
[Task 1.2] Overriding the getArea() method
[Task 1.3] Provide a toString() method
Author : Reqi Jumantara Hapid
Date   : 29 Februari 2024
 */

package Week4.exercise1.task123;

public class TestCylinder {
    public static void main(String[] args) {
        /*
        Declare and allocate a new instance of cylinder
        with defaullt color, radius, and height
         */
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder 1:"
                    + " radius = " + c1.getRadius()
                    + " height = " + c1.getHeight()
                    + " base area = " + c1.getArea()
                    + " volume = " + c1.getVolume());
        String c1Str = c1.toString();
        System.out.println(c1Str);

        /*
        Declare and allocate a new instance of cylinder
        with specifying height, and default radius, and color
         */
        Cylinder c2 = new Cylinder(10.0);
        System.out.println("\nCylinder 2:"
                + " radius = " + c2.getRadius()
                + " height = " + c2.getHeight()
                + " base area = " + c2.getArea()
                + " volume = " + c2.getVolume());
        String c2Str = c2.toString();
        System.out.println(c2Str);

        /*
        Declare and allocate a new instance of cylinder
        with specifying height and radius, with default color
         */
        Cylinder c3= new Cylinder(2.0,10.0);
        System.out.println("\nCylinder 3:"
                + " radius = " + c3.getRadius()
                + " height = " + c3.getHeight()
                + " base area = " + c3.getArea()
                + " volume = " + c3.getVolume());
        String c3Str = c3.toString();
        System.out.println(c3Str);
    }
}
