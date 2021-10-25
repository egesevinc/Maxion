package Package;
import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Hoşgeldiniz...");
        System.out.println("Lütfen Yönetici Şifresini giriniz");
        int pass = input.nextInt();


        // loop konabilir
        if(pass == Yonetici.getPassword()){
            System.out.println("Siteme giriş yapıldı");
        }

    }
}
