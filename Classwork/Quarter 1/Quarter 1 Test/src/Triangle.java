public class Triangle extends Shape{

    private double base, height, side1, side2, side3;

    public Triangle(String nam, double base, double height, double side1, double side2, double side3) {
        super(nam);

        if (base < 0){
            base *= -1;
        }
        if (height < 0){
            height *= -1;
        }
        if (side1 < 0){
            side1 *= -1;
        }
        if (side2 < 0){
            side2 *= -1;
        }
        if (side3 < 0){
            side3 *= -1;
        }

        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        return 0.5 * this.base * this.height;
    }

    public boolean equals(Triangle o) {
        if (this.getArea() == o.getArea()) return true;
        else return false;
    }

    @Override
    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }
    public double compareTo(Triangle o){
        return this.getArea() - o.getArea();
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base < 0){
            base *= -1;
        }
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0){
            height *= -1;
        }
        this.height = height;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        if (side1 < 0){
            side1 *= -1;
        }
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        if (side2 < 0){
            side2 *= -1;
        }
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        if (side3 < 0){
            side3 *= -1;
        }
        this.side3 = side3;
    }

    @Override
    public String toString() {
        return "Shape: " + this.getName() + " Base: " + this.getBase() + " Height: " + this.getHeight() + " Side 1: " + this.getSide1() + " Side 2: " + this.getSide2() + " Side 3: " + this.getSide3() + " Area: " + this.getArea() + " Perimeter: " + this.getPerimeter();
    }
}
