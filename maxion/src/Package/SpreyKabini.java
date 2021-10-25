package Package;

public class SpreyKabini extends Makine {


    Operator KalOp1 = new Operator("Ege Sevinç",150);
    Operator KalOp2 = new Operator("Berk Alper",151);
    AyakPedali press1 = new AyakPedali("Acil Stop Butonu 1",true, 1212121);

    public SpreyKabini(String name) {
        super(name);
    }

    public SpreyKabini(String name, AyakPedali press1, Operator kalOp1, Operator kalOp2) {
        super(name);
        this.press1 = press1;
        KalOp1 = kalOp1;
        KalOp2 = kalOp2;
    }


    public Operator getKalOp1() {
        return KalOp1;
    }

    public void setKalOp1(Operator kalOp1) {
        KalOp1 = kalOp1;
    }

    public Operator getKalOp2() {
        return KalOp2;
    }

    public void setKalOp2(Operator kalOp2) {
        KalOp2 = kalOp2;
    }

    public AyakPedali getButon1() {
        return press1;
    }

    public void setButon1(AyakPedali press1) {
        this.press1 = press1;
    }
}

