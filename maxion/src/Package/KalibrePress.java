package Package;

import java.util.ArrayList;

public class KalibrePress extends Makine {
    // isWorking şimdilik true kalsın sonra kontrol ve checklist eklenecek
    // alan tarayıcı
    AlanTarayici a1 = new AlanTarayici("AlanTarayici1",true,1515151,5,4);


    public KalibrePress(ArrayList<Operator> opList, String name, AlanTarayici a1) {
        super(a1, opList, name);
        this.a1 = a1;
    }

    public AlanTarayici getA1() {
        return a1;
    }

    public void setA1(AlanTarayici a1) {
        this.a1 = a1;
    }


    public void run(){
        System.out.println("Hesaplanan alan:");
        System.out.println(getA1().getA()*getA1().getB());
    }

}
