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
    // is working neye göre true neye göre false
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
    public boolean control(){
        boolean test = false;
        try{
            if(isWorking){
                System.out.println("Kontrol tamamlandı");
                System.out.println("Devam edebilirsiniz");
                test=true;
            }
            else{
                System.out.println("Hata var kontrol gerekiyor.");
                test=false;
            }


            // kontrol geçmezse error mesajı
        }catch(Exception e){
            System.out.println("Error!");
            System.out.println(e);
        }
        return test;
    }
}
