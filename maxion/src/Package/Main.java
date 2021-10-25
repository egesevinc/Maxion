package Package;
import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        // admin devam
        // Yonetici static olmaktansa obje ve dinamik şekilde olabilir


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
        }


        Operator KalOp12 = new Operator("Ege Sevinç",152320);
        Operator KalOp22= new Operator("Berk Alper",1512323);

        Makine makine = new KalibrePress("press");

        // eğer dept == kalibrepress ekle: otomasyon > loop ile
        makine.getOpList().add(KalOp12);
        makine.getOpList().add(KalOp22);


        for(int i=0;i<makine.getOpList().size();i++){
            System.out.println(makine.getOpList().get(i).getName());
        }
        // loop konabilir


    }
}
