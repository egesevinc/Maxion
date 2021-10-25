package Package;

import java.util.ArrayList;

public class SpreyKabini extends Makine {


    AyakPedali press1 = new AyakPedali("Acil Stop Butonu 1",true, 1212121);

    public SpreyKabini(String name) {
        super(name);
    }

    public SpreyKabini(String name, AyakPedali press1) {
        super(name);
        this.press1 = press1;

    }

    // dinamik hale gelebilir?


    public SpreyKabini(ArrayList<Operator> opList, String name, AyakPedali a1,Yonetici yonetici) {
        super(a1, opList, name,yonetici);
        this.press1 = a1;
    }
    public void run(){
        if(test()) {
            System.out.println("Döküm Tezgahı işlemleri");
            System.out.println(getPress1().isPressed);
        }
    }

    public AyakPedali getPress1() {
        return press1;
    }

    public void setPress1(AyakPedali press1) {
        this.press1 = press1;
    }
    public boolean test(){
        boolean tst =super.test();
        if(!tst){
            this.yonetici.enterMailbox("Ayak pedalı arızası, yetkili birimlere mail gönderildi");
        }

        return tst;
    }

}