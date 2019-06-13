public class Computer {
    CPU c;
    MMU m;
    int displayLength;
    int displayWidth;
    String CompName;

    public String getCompName() {
        return CompName;
    }

    public void setCompName(String compName) {
        CompName = compName;
    }

    public CPU getCpu() {
        return c;
    }

    public void setCpu(CPU c) {
        this.c = c;
    }

    public MMU getMmu() {
        return m;
    }

    public void setMmu(MMU m) {
        this.m = m;
    }

    public int getDisplayLength() {
        return displayLength;
    }

    public void setDisplayLength(int displayLength) {
        this.displayLength = displayLength;
    }

    public int getDisplayWidth() {
        return displayWidth;
    }

    public void setDisplayWidth(int displayWidth) {
        this.displayWidth = displayWidth;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "c=" + c +
                ", m=" + m +
                ", displayLength=" + displayLength +
                ", displayWidth=" + displayWidth +
                '}';
    }
    boolean Draw(Shape X)
    {
        if(X.getClass() == new Triangle(0,0,0).getClass())
        {
            Triangle arg = (Triangle) X;
            if(arg.getA() > this.displayWidth || arg.getB() > this.getDisplayWidth() || arg.getC() >this.displayWidth
            || arg.getA() > this.getDisplayLength() || arg.getB() > this.getDisplayLength() || arg.getC() >this.getDisplayLength()    ) {
                System.out.println(this.getCompName() + " Cannot Draw this " + X.getShapeName() + "\nArea = " + X.getArea() + " Peimeter = " + X.getPerimeter());
                System.out.println("-----------------------------------------------------");
                return false;
            }
            else
            {
                System.out.println(this.getCompName() + " Can Draw this "+ X.getShapeName() + "\nArea = " + X.getArea() + " Peimeter = "+ X.getPerimeter());
                System.out.println("-----------------------------------------------------");
                return true;
            }
        }
        if(X.getClass() == new Rectangle(0,0).getClass())
        {
            Rectangle r = (Rectangle) X;
            if(r.getWidth() > this.displayWidth || r.getLength()>this.getDisplayLength())
            {
                System.out.println(this.getCompName() + " Cannot Draw this " + X.getShapeName() + "\nArea = " + X.getArea() + " Peimeter = " + X.getPerimeter());
                System.out.println("-----------------------------------------------------");
                return false;
            }
            else
            {
                System.out.println(this.getCompName() + " Can Draw this "+ X.getShapeName() + "\nArea = " + X.getArea() + " Peimeter = "+ X.getPerimeter());
                System.out.println("-----------------------------------------------------");
                return true;
            }
        }
        if(X.getClass() == new Circle(0).getClass())
        {
            Circle c = (Circle) X;
            if(2*c.getRadius() > this.displayWidth || 2*c.getRadius() > this.getDisplayLength())
            {
                System.out.println(this.getCompName() + " Cannot Draw this " + X.getShapeName() + "\nArea = " + X.getArea() + " Peimeter = " + X.getPerimeter());
                System.out.println("-----------------------------------------------------");
                return false;
            }
            else
            {
                System.out.println(this.getCompName() + " Can Draw this "+ X.getShapeName() + "\nArea = " + X.getArea() + " Peimeter = "+ X.getPerimeter());
                System.out.println("-----------------------------------------------------");
                return true;
            }


        }

        if(X.getClass() == new Square(0).getClass())
        {
            Square s = (Square) X;
            if(s.getLength() > this.getDisplayLength() || s.getLength() > this.getDisplayWidth())
            {
                System.out.println(this.getCompName() + " Cannot Draw this " + X.getShapeName() + "\nArea = " + X.getArea() + " Peimeter = " + X.getPerimeter());
                System.out.println("-----------------------------------------------------");
                return false;
            }
            else
            {
                System.out.println(this.getCompName() + " Can Draw this "+ X.getShapeName() + "\nArea = " + X.getArea() + " Peimeter = "+ X.getPerimeter());
                System.out.println("-----------------------------------------------------");
                return true;
            }
        }
        return false;
    }
}
