public class Circle extends Shape {
    private double radius;
    Circle(double rad)
    {
        this.setShapeName("Circle");
        radius = rad;
        this.setArea(3.1416*rad*rad);
        this.setPerimeter(2*3.1416*rad);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
