package Package;

public class DokumTezgahi extends Makine {


    Operator KalOp1 = new Operator("Ege Sevinç",150);
    Operator KalOp2 = new Operator("Berk Alper",151);
    AcilStopButonu buton1 = new AcilStopButonu("Acil Stop Butonu 1",true, 1212121);

    public DokumTezgahi(String name) {
        super(name);
    }

    public DokumTezgahi(String name, AcilStopButonu buton1, Operator kalOp1, Operator kalOp2) {
        super(name);
        this.buton1 = buton1;
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

    public AcilStopButonu getButon1() {
        return buton1;
    }

    public void setButon1(AcilStopButonu buton1) {
        this.buton1 = buton1;
    }

}