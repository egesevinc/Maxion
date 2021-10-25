package Package;

import java.util.ArrayList;

public class Makine {
    GuvenlikDonanimi g1;
    ArrayList<Operator> opList = new ArrayList<Operator>();
    String name;

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

        System.out.println("Makine çalışıyor");
    }
    public void stop(){
        System.out.println("Makine durdu");
    }

}
