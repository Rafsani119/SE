public class problem2
{
    public static void main(String[] args) {
        ComputerFacory fc = new ComputerFacory();
        Computer test;
        test = fc.getComputer("ComputerA");
        Shape s ;

        s = new Triangle(10,20,100);
        test.Draw(s);
        s = new Circle(125);
        test.Draw(s);
        s = new Square(260);
        test.Draw(s);
        s = new Rectangle(150,250);
        test.Draw(s);

        test = fc.getComputer("ComputerB");
        s = new Triangle(10,20,100);
        test.Draw(s);
        s = new Circle(125);
        test.Draw(s);
        s = new Square(260);
        test.Draw(s);
        s = new Rectangle(150,250);
        test.Draw(s);


        test = fc.getComputer("ComputerC");
        s = new Triangle(10,20,100);
        test.Draw(s);
        s = new Circle(125);
        test.Draw(s);
        s = new Square(260);
        test.Draw(s);
        s = new Rectangle(150,250);
        test.Draw(s);
    }
}
