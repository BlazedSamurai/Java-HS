public class Rectangle extends Shape{

    private double length;
    private double width;

    public Rectangle(String nam, double length, double width) {
        super(nam);

        if (width < 0){
            width *= -1;
        }
        if (length < 0){
            length *= -1;
        }

        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public double getPerimeter() {
        return (2 * this.width) + (2*this.length);
    }

    @Override
    public String toString() {
        return "Shape: " + this.getName() + " Length: " + this.getLength() + " Width: " + this.getWidth() + " Area: " + this.getArea() + " Perimeter: " + this.getPerimeter();
    }

    public boolean equals(Rectangle o) {
        if (this.getArea() == o.getArea()) return true;
        else return false;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 0){
            length *= -1;
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0){
            width *= -1;
        }
        this.width = width;
    }

    public double compareTo(Rectangle o){
        return this.getArea() - o.getArea();
    }

}
