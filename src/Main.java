import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Android android = new Android("sms", "telpon", "bluethooth");
        boolean boolCon = true;
        
        do{
            menu();
            int pilih = scanner.nextInt();

            switch(pilih) {
                case 1:
                optional("Silahkan pilih Oprating System:", 
                    "Android", "IOS");
                pilih = scanner.nextInt();
                
                if(pilih == 1) {
                    optional("Silahkan pilih brand perangkat Anda untuk proses pembuatan device Anda:", 
                    "Samsung", "Xiaomi");
                    pilih = scanner.nextInt();

                    if(pilih == 1) {
                        android(android, scanner, boolCon, "Samsung");
                    } else{
                        android(android, scanner, boolCon, "Xiaomi");
                    }
                }
                    break;
                default:
                    System.out.println("Spesifikasi belum ada!");
                }
            }while(boolCon);
            System.out.println("Program telah keluar!");
        }

        public static final void menu() {
            String menu = "Silahkan pilih spesifikasi smartphone yang adna inginkan"+
                "\n1. NFC"+
                "\n2. Camera"+
                "\n3. Fingerprint"+
                "\n4. Face recognation"+
                "\n5. GPS";
                System.out.println(menu);
                System.out.print("Masukan pilihan: ");
        }

        public static final void optional(String message, String option1, String option2) {
            String option = 
                    "\n" + message+
                    "\n1. "+ option1+
                    "\n2. "+ option2;
                System.out.println(option);
                System.out.print("Masukan pilihan: ");
        }

        public static void android(Android android, Scanner scanner, Boolean boolCon, String brand){
            System.out.print("\nSilahkan beri nama perangkat Anda:\n"+
                "Masukan nama: ");
                String name = scanner.next();
                
            android.setDeviceName(name);
            android.setBrand(brand);
            
            System.out.println("\nPembuatan device berhasil, berikut info device Anda:");
            android.display();
            
            System.out.print("\nApakan Anda ingin membuat device lagi?\n"+
            "Masukan pilihan (Y/n): ");

            String con = scanner.nextLine();
            if(con.equalsIgnoreCase("n")) {
                boolCon = false;
            }
        }
    }