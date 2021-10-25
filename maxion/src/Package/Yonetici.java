package Package;

public class Yonetici {
    final static int password = 2510;
    static boolean isLoggedIn = false;

    public static void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }

    public static boolean IsLoggedIn() {
        return isLoggedIn;
    }

    public Yonetici() {
    }

    public static int getPassword() {
        return password;
    }
    public static void display(){
        System.out.println("Menü açılıyor...");
        System.out.println("1: Kalibre Press");
        System.out.println("2: Sprey Kabini");
        System.out.println("3: Döküm Tezgahı");
    }
}
