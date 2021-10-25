package Package;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        // admin devam
        // Yonetici static olmaktansa obje ve dinamik şekilde olabilir


        ArrayList<Operator> kalibrepressList = new ArrayList<Operator>();
        Operator KalOp12 = new Operator("Ege Sevinç",152320);
        Operator KalOp22= new Operator("Berk Alper",1512323);
        kalibrepressList.add(KalOp12);
        kalibrepressList.add(KalOp22);
        AlanTarayici g1 = new AlanTarayici("Alan tarayıcı",true,555,20,20);
        Makine makine = new KalibrePress(kalibrepressList,"Kalibre Press",g1);


        ArrayList<Operator> dokumList = new ArrayList<Operator>();
        Operator dokOp1 = new Operator("Erdem Fuat Yazıcı",23232323);
        Operator dokOp2= new Operator("Ali Efe Baruş",2323232);
        kalibrepressList.add(dokOp1);
        kalibrepressList.add(dokOp2);
        AcilStopButonu f1 = new AcilStopButonu("Alan tarayıcı",true,555,20,20,10);
        DokumTezgahi d1 = new DokumTezgahi(dokumList,"Dokum",f1);



        Scanner input = new Scanner(System.in);
        System.out.println("Hoşgeldiniz...");
        System.out.println("Lütfen Yönetici Şifresini giriniz");
        int pass = input.nextInt();
        if(pass == Yonetici.getPassword()){
            System.out.println("Sisteme giriş yapıldı");
            Yonetici.setLoggedIn(true);
        }

        if(Yonetici.isLoggedIn){
            Yonetici.display();
            int choice = input.nextInt();
            switch (choice){
                case 1:
                    makine.run();
                case 2:
                    d1.run();
                case 3:

            }
        }
        // loop konabilir


    }
}
