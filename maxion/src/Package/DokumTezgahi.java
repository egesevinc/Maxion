package Package;

import java.util.ArrayList;

public class DokumTezgahi extends Makine {

    // dinamik hale gelebilir?
    AcilStopButonu buton1 = new AcilStopButonu("Acil Stop Butonu 1",true, 1212121,2,3,2);


    public DokumTezgahi(ArrayList<Operator> opList, String name, AcilStopButonu a1) {
        super(a1, opList, name);
        this.buton1 = a1;
    }
    public void run(){
        System.out.println("Döküm Tezgahı işlemleri");
        System.out.println(getButon1().getA()* buton1.getB()*getButon1().getC());
    }

    public AcilStopButonu getButon1() {
        return buton1;
    }

    public void setButon1(AcilStopButonu buton1) {
        this.buton1 = buton1;
    }

}