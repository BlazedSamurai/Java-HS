public class Circle extends Shape{
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        if (radius < 0){
            radius *= -1;
        }
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        if (radius < 0){
            radius *= -1;
        }
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (this.radius*this.radius);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "Shape: " + this.getName() + " Radius: " + this.getRadius() + " Area: " + this.getArea() + " Circumference: " + this.getPerimeter();
    }

    public boolean equals(Circle o) {
        if (this.getArea() == o.getArea()) return true;
        else return false;
    }


    public double compareTo(Circle o){
        return this.getArea() - o.getArea();
    }
}
