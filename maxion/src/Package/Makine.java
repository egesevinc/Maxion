package Package;

public class Makine {
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


    // Try-catch bloğu ekle controle
    public void control(){
        System.out.println("Kontrol tamamlandı");
        // kontrol geçmezse error mesajı
    }
    public void run(){
        control();
        System.out.println("Makine çalışıyor");
    }
    public void stop(){
        System.out.println("Makine durdu");
    }

}
