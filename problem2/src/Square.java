public class Square extends Shape {
    private double length;
    Square(double len)
    {
        this.setShapeName("Square");
        length = len;
        this.setArea(len*len);
        this.setPerimeter(4*len);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
