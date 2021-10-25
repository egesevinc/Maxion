package Package;

public class AcilStopButonu  extends GuvenlikDonanimi{
    boolean isPushed;

    public AcilStopButonu(String name, Boolean isWorking, int licenseNo) { super(name, isWorking, licenseNo); this.isPushed=false; }


    public boolean isPushed() {
        return isPushed;
    }

    public void setPushed(boolean pushed) {
        isPushed = pushed;
    }
}
