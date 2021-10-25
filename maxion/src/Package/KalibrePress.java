package Package;

import java.util.ArrayList;

public class KalibrePress extends Makine {
    // isWorking şimdilik true kalsın sonra kontrol ve checklist eklenecek
    // alan tarayıcı
    AlanTarayici a1 = new AlanTarayici("AlanTarayici1",true,1515151,5,4);
    ArrayList<Operator> opList = new ArrayList<Operator>();
    Operator KalOp1 = new Operator("Ege Sevinç",150);
    Operator KalOp2 = new Operator("Berk Alper",151);


    public KalibrePress(String name) {
        super(name);
    }
}
