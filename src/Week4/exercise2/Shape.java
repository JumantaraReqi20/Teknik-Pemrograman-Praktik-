/*
Exercise 2: Superclass Shape and its Subclasses Circle, Rectangle and Square

Author : Reqi Jumantara Hapid
Date   : 29 Februari 2024
 */

package Week4.exercise2;

public class Shape {
    private String color;
    private boolean filled;

    public Shape(){
        color = "green";
        filled = true;
    }

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String toString(){
        return "Shape [color " + color + " , filled = " + filled +"]";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
