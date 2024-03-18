package Week5.case2;

abstract public class Shape {
    //add instance variable of type String
    protected String shapeName;

    //add abstract method area()
    public abstract double area();

    //add Constructor to define the shape name
    public Shape(String shapeName){
        this.shapeName = shapeName;
    }

    //add toString() method
    public String toString(){
        return shapeName;
    }
}