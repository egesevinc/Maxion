package Package;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class KalibrePress extends Makine {
    // isWorking şimdilik true kalsın sonra kontrol ve checklist eklenecek
    // alan tarayıcı
    AlanTarayici a1 = new AlanTarayici("AlanTarayici1",true,1515151,5,4);



    public KalibrePress(ArrayList<Operator> opList, String name, AlanTarayici a1,Yonetici yonetici) {
        super(a1, opList, name,yonetici);
        this.a1 = a1;
    }

    public AlanTarayici getA1() {
        return a1;
    }

    public void setA1(AlanTarayici a1) {
        this.a1 = a1;
    }

    public void stop(){
        System.out.println("Dar Alanda çalışamaz");
        this.yonetici.enterMailbox("Alan dar makinayı daha geniş bir alana çekin");
    }

    public void run(){

        if((int)this.a1.getA()*this.a1.getB() > 20) {
            if (test()) {
                System.out.println("Hesaplanan alan:");
                System.out.println(getA1().getA() * getA1().getB());
            }
        }
        else{

            this.stop();
        }
    }

    public boolean test(){
        boolean tst =super.test();
        if(!tst){
            this.yonetici.enterMailbox("Alan tarayıcı arızası, yetkili birimlere mail gönderildi");
        }

        return tst;
    }


}
