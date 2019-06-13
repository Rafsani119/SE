public class MMU {
    String MmuName;

    public String getMmuName() {
        return MmuName;
    }

    public void setMmuName(String mmuName) {
        MmuName = mmuName;
    }

    @Override
    public String toString() {
        return "MMU{" +
                "MmuName='" + MmuName + '\'' +
                '}';
    }
}
