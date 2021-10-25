package Package;

public class AcilStopButonu  extends GuvenlikDonanimi{
    int a;
    int b;
    int c;
    boolean isPushed;

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

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public AcilStopButonu(String name, Boolean isWorking, int licenseNo,int a,int b,int c)
    { super(name, isWorking, licenseNo);
    this.a=a;
    this.b=b;
    this.c=c;
    this.isPushed=false; }


    public boolean isPushed() {
        return isPushed;
    }

    public void setPushed(boolean pushed) {
        isPushed = pushed;
    }
}