public class ComputerB extends Computer {
    ComputerB()
    {
        this.setDisplayLength(350);
        this.setDisplayWidth(250);
        this.setCpu(new cpuB());
        this.setMmu(new mmuB());
        this.setCompName("Computer_B");
    }
}
