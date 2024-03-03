/*
[Task 1.1] Modify class Circle
Modify class Circle, add :
1. variable color : string
2. Constructor Circle(radius : double, color : string)
3. Getter and setter for color

Author : Reqi Jumantara Hapid
Date   : 29 Februari 2024
 */
package Week4.exercise1.task123;

public class Circle {

    private double radius;

    //variable color: String
    private String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
        color = "red";
    }

    //Constructor Circle(radius: double, color: String)
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //Getter and setter for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}