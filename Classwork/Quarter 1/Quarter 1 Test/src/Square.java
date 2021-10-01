import java.util.Objects;

public class Square extends Shape{

    private double side;

    public Square(String name, double side) {
        super(name);
        if (side < 0){
            side *= -1;
        }
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Shape: " + this.getName() + " Side: " + this.getSide() + " Area: " + this.getArea() + " Perimeter: " + this.getPerimeter();
    }

    public boolean equals(Square o) {
        if (this.getArea() == o.getArea()) return true;
        else return false;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side < 0){
            side *= -1;
        }
        this.side = side;
    }

    public double compareTo(Square o){
        return this.getArea() - o.getArea();
    }
}
