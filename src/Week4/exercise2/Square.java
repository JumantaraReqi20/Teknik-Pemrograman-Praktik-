package Week4.exercise2;

public class Square extends Rectangle{

    public Square(){
        super();
    }

    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public double getSide(){
        return super.getWidth();
    }

    public void setSide (double side){
        super.setWidth(side);
        super.setLength(side);
    }

    public void setLength (double side){
        super.setLength(side);
    }

    public void setWidth (double side){
        super.setWidth(side);
    }

    public String toString(){
        return "A square with side " + getSide() + ", which is a subclass of " + super.toString();
    }

    /*
    Sebenarnya kita tidak perlu meng override kedua method di bawah ini
    karena formula untuk mendapatkan luas dan keliling pada kedua objek
    ini sama, sehingga hanya akan menghabiskan memori saja jika tetap di override
     */
    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }
}

