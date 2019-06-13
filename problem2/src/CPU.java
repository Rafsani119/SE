public class CPU {
    String CpuName;

    public String getCpuName() {
        return CpuName;
    }

    public void setCpuName(String cpuName) {
        CpuName = cpuName;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "CpuName='" + CpuName + '\'' +
                '}';
    }
}
