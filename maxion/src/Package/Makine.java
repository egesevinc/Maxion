package Package;

import java.util.ArrayList;
import java.util.Scanner;

public class Makine {
    GuvenlikDonanimi g1;
    ArrayList<Operator> opList = new ArrayList<Operator>();
    String name;
    Yonetici yonetici;

    public Makine(GuvenlikDonanimi g1, ArrayList<Operator> opList, String name,Yonetici yonetici) {
        this.g1 = g1;
        this.opList = opList;
        this.name = name;
        this.yonetici=yonetici;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Makine(String name) {
        this.name = name;
    }

    public GuvenlikDonanimi getG1() {
        return g1;
    }

    public void setG1(GuvenlikDonanimi g1) {
        this.g1 = g1;
    }

    public ArrayList<Operator> getOpList() {
        return opList;
    }

    public void setOpList(ArrayList<Operator> opList) {
        this.opList = opList;
    }

    public void run(){
        if(this.test()){
            g1.control();
            System.out.println("Makine çalışıyor");
        }
    }
    public void stop(){
        System.out.println("Makine durdu");
    }
    public boolean test(){
        System.out.println("Donanım testi için basın");
        boolean mytest = true;
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        if(a.equalsIgnoreCase("a")){
            System.out.println("Güvenlik Donanımı Düzgün Bir Şekilde Çalışıyor");
        }else{
            System.out.println("HATA");
            mytest=false;
        }
        return mytest;
    }

}
