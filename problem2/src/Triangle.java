import static java.lang.Math.abs;

public class Triangle extends Shape {
int a,b,c;
Triangle(int x,int y, int z)
{
    this.setShapeName("Triangle");
    a=x;
    b=y;
    c=z;
    int s = (a+b+c)/2;
    this.setArea(Math.sqrt(abs(s*(s-a)*(s-b)*(s-c))));
    this.setPerimeter(a+b+c);
}

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
