package Package;

import java.util.ArrayList;

public class Yonetici {
    String name;
     int password ;
     boolean isLoggedIn = false;
    ArrayList<String> mailBox;

    public Yonetici (String name,int password){
        this.name=name;
        this.password=password;
        mailBox = new ArrayList<>();
    }
    public  void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }

    public  boolean IsLoggedIn() {
        return isLoggedIn;
    }

    public Yonetici() {
    }

    public int getPassword() {
        return password;
    }
    public static void display(){
        System.out.println("Menü açılıyor...");
        System.out.println("1: Kalibre Press");
        System.out.println("2: Sprey Kabini");
        System.out.println("3: Döküm Tezgahı");
        System.out.println("4: Display Messages");
        System.out.println("5: Menüden Çıkın");
    }

    public void enterMailbox(String s){
        this.mailBox.add(s);
    }

    public void displayMail(){
        System.out.println("Bildirimleriniz gösteriliyor...");
        System.out.println(mailBox.size());
        for(int i=0;i<mailBox.size();i++){
            System.out.println("Mail: "+(i+1));
            System.out.println(mailBox.get(i));
        }
    }

}
