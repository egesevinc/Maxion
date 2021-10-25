package Package;

public class AlanTarayici extends GuvenlikDonanimi {
    int a;
    int b;

    public AlanTarayici(String name, Boolean isWorking, int licenseNo) {
        super(name, isWorking, licenseNo);
    }

    public AlanTarayici(String name, Boolean isWorking, int licenseNo, int a, int b) {
        super(name, isWorking, licenseNo);
        this.a = a;
        this.b = b;
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

}
