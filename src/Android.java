public class Android extends Smartphone{

    String deviceName;
    String brand;

    public Android(String sms, String telpon, String bluethooth) {
        super(sms, telpon, bluethooth);
    }

    public Android(String sms, String telpon, String bluethooth, String deviceName) {
        super(sms, telpon, bluethooth);
        this.deviceName = deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String fitur() {
        return "NFC";
    }

    @Override
    public String os() {
        return "Android";
    }

    @Override
    public String brand() {
        return brand;
    }

    @Override
    public void display() {
        System.out.println("\n0. Nama perangkat Anda\t: "+ getDeviceName());
        super.display();
        System.out.println("2. Fitur lainnya\t: " + fitur());
        System.out.println("3. OS\t\t\t: " + os());
        System.out.println("4. Brand pendukung\t: "+ brand());
    }
}
