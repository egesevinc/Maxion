package Package;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        // admin devam
        // Yonetici static olmaktansa obje ve dinamik şekilde olabilir

        Yonetici yonetici = new Yonetici("Erdem",2510);
        ArrayList<Operator> kalibrepressList = new ArrayList<Operator>();
        Operator KalOp12 = new Operator("Ege Sevinç",152320);
        Operator KalOp22= new Operator("Berk Alper",1512323);
        kalibrepressList.add(KalOp12);
        kalibrepressList.add(KalOp22);
        AlanTarayici g1 = new AlanTarayici("Alan tarayıcı",true,555,1,1);
        KalibrePress makine = new KalibrePress(kalibrepressList,"Kalibre Press",g1,yonetici);


        ArrayList<Operator> dokumList = new ArrayList<Operator>();
        Operator dokOp1 = new Operator("Erdem Fuat Yazıcı",23232323);
        Operator dokOp2= new Operator("Ali Efe Baruş",2323232);
        dokumList.add(dokOp1);
        dokumList.add(dokOp2);
        AcilStopButonu f1 = new AcilStopButonu("Alan tarayıcı",true,555,20,20,10);
        DokumTezgahi d1 = new DokumTezgahi(dokumList,"Dokum",f1,yonetici);


        ArrayList<Operator> spreyList = new ArrayList<Operator>();
        Operator sprOp1 = new Operator("Erdem Fuat Yazıcı",23232323);
        Operator sprOp2= new Operator("Ali Efe Baruş",2323232);
        spreyList.add(dokOp1);
        spreyList.add(dokOp2);
        AyakPedali ay1 = new AyakPedali("Alan tarayıcı",true,55550,true);
        SpreyKabini sprrr1 = new SpreyKabini(spreyList,"Sprey",ay1,yonetici);


        Scanner input = new Scanner(System.in);
        System.out.println("Hoşgeldiniz...");

        int pass=0;
        do {
            System.out.println("Lütfen Yönetici Şifresini giriniz");
            pass = input.nextInt();


        }while(pass != yonetici.getPassword());
        System.out.println("Sisteme giriş yapıldı");
        yonetici.setLoggedIn(true);
        int choice=0;
        while (true) {
            if (yonetici.isLoggedIn) {
                Yonetici.display();
                 choice = input.nextInt();
                switch (choice) {
                    case 1:
                        makine.run();
                        break;
                    case 2:
                        d1.run();
                        break;
                    case 3:
                        sprrr1.run();
                        break;
                    case 4:
                        yonetici.displayMail();
                        break;
                    case 5:
                        yonetici.setLoggedIn(false);
                        break;
                    case 6:
                        //operatör ekle
                        break;
                    case 7:
                        //operatör çıkar
                        break;
                    case 8:
                        //operatör göster
                        break;
                }
            }
        }
        // loop konabilir


    }
}
