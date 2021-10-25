package Package;

import java.util.ArrayList;

public class KalibrePress extends Makine {
    // isWorking şimdilik true kalsın sonra kontrol ve checklist eklenecek
    // alan tarayıcı
    AlanTarayici a1 = new AlanTarayici("AlanTarayici1",true,1515151,5,4);
    Operator KalOp1 = new Operator("Ege Sevinç",150);
    Operator KalOp2 = new Operator("Berk Alper",151);

    public AlanTarayici getA1() {
        return a1;
    }

    public void setA1(AlanTarayici a1) {
        this.a1 = a1;
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

    public KalibrePress(String name) {
        super(name);
    }

    public KalibrePress(String name, AlanTarayici a1, Operator kalOp1, Operator kalOp2) {
        super(name);
        this.a1 = a1;
        KalOp1 = kalOp1;
        KalOp2 = kalOp2;
    }
}
