package Week4.exercise2;

public class TestShape {
    public static void main(String[] args) {

        Square square = new Square(15, "biru", true);
        System.out.println(square.toString());
        System.out.println("Base Area form this square is " + square.getArea());

        /*
        Shape shape = new Shape("black", false);
        System.out.println(shape.getColor());
        System.out.println(shape.isFilled());
        System.out.println(shape.toString());
        */
    }
}
