package Package;

public class GuvenlikDonanimi {
    String name;
    Boolean isWorking;
    int LicenseNo;

    public GuvenlikDonanimi(String name, Boolean isWorking, int licenseNo) {
        this.name = name;
        this.isWorking = isWorking;
        LicenseNo = licenseNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getWorking() {
        return isWorking;
    }

    public void setWorking(Boolean working) {
        isWorking = working;
    }

    public int getLicenseNo() {
        return LicenseNo;
    }

    public void setLicenseNo(int licenseNo) {
        LicenseNo = licenseNo;
    }
    // Try-catch bloğu ekle controle
    public void control(){
        System.out.println("Kontrol tamamlandı");
        // kontrol geçmezse error mesajı
    }
}
