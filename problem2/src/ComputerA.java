public class ComputerA extends Computer{
    ComputerA()
    {
        this.setDisplayLength(200);
        this.setDisplayWidth(200);
        this.setCpu(new cpuA());
        this.setMmu(new mmuA());
        this.setCompName("Computer_A");
    }
}
