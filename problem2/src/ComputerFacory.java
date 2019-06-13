public class ComputerFacory {
    Computer getComputer(String ComputerName)
    {
        if(ComputerName.equalsIgnoreCase("ComputerA"))
        {
            return new ComputerA();
        }
        else if(ComputerName.equalsIgnoreCase("ComputerB"))
        {
            return new ComputerB();
        }
        else if(ComputerName.equalsIgnoreCase("ComputerC"))
        {
            return new ComputerC();
        }
        else return null;
    }
}
