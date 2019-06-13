public class ComputerC extends Computer {
    ComputerC()
    {
        this.setDisplayLength(550);
        this.setDisplayWidth(430);
        this.setCpu(new cpuC());
        this.setMmu(new mmuC());
        this.setCompName("Computer_C");
    }
}
