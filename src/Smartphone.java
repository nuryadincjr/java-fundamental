public abstract class Smartphone {
    
    private String sms;
    private String telpon;
    private String bluethooth;

    public Smartphone(String sms, String telpon, String bluethooth) {
        this.sms = sms;
        this.telpon = telpon;
        this.bluethooth = bluethooth;
    }
    
    public void setSms(String sms) {
        this.sms = sms;
    }

    public void setTelpon(String telpon) {
        this.telpon = telpon;
    }

    public void setBluethooth(String bluethooth) {
        this.bluethooth = bluethooth;
    }

    public String getSms() {
        return sms;
    }

    public String getTelpon() {
        return telpon;
    }
    
    public String getBluethooth() {
        return bluethooth;
    }

    public abstract String fitur();
    public abstract String os();
    public abstract String brand();

    public void display() {
        System.out.println("1. Fitur dasar\t\t: " + telpon + ", "+sms+", " + bluethooth);
    }
}
