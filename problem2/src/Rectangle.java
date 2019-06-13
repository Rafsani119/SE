public class Rectangle extends Shape {
    private double length,width;
    Rectangle(double len, double width)
    {
        this.setShapeName("Rectangle");
        this.length = len;
        this.width = width;
        this.setArea(len*width);
        this.setPerimeter(2*(len+width));
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
