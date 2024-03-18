package Week5.case2;

public class Paint {
    private double coverage;

    //-----------------------------------
    //  Constructor: Sets up the Triangle
    //-----------------------------------
    public Paint(double coverage){
        this.coverage = coverage;
    }

    //----------------------------------------------
    // Returns the amount of paint needed to paint
    // the shape given as the parameter
    //----------------------------------------------
    public double amount(Shape shape){
        System.out.println("Computing amount for " + shape);

        return shape.area()/coverage;
    }
}
