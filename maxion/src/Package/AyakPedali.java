package Package;

public class AyakPedali extends GuvenlikDonanimi {
    public AyakPedali(String name, Boolean isWorking, int licenseNo) { super(name, isWorking, licenseNo); this.isPressed=false; }
    boolean isPressed;

    public AyakPedali(String name, Boolean isWorking, int licenseNo,boolean isPressed)
    { super(name, isWorking, licenseNo);
        this.isPressed=isPressed;
    }

    public boolean isPressed() {
        return isPressed;
    }

    public void setPressed(boolean pressed) {
        isPressed = pressed;
    }
}