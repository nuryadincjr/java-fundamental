import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        Android android = new Android("sms", "telpon", "bluethooth");
        boolean boolContinue = true;
        
        do{
            System.out.println("Silahkan pilih spesifikasi smartphone yang adna inginkan");
            System.out.println("1. NFC");
            System.out.println("2. Camera");
            System.out.println("3. Fingerprint");
            System.out.println("4. Face recognation");
            System.out.println("5. GPS");

            System.out.print("Masukan pilihan: ");
            int pilih = Integer.parseInt(scanner.nextLine());

            switch(pilih) {
                case 1:
                    System.out.println("\nSilahkan pilih Oprating System:");
                    System.out.println("1. Android");
                    System.out.println("2. IOS");

                    System.out.print("Masukan pilihan: ");
                    pilih = Integer.parseInt(scanner.nextLine());
                    
                    if(pilih == 1) {
                        System.out.println("\nSilahkan pilih brand perangkat Anda untuk proses pembuatan device Anda:");
                        System.out.println("1. Samsung");
                        System.out.println("2. Xiaomi");

                        System.out.print("Masukan pilihan: ");
                        pilih = Integer.parseInt(scanner.nextLine());

                        if(pilih == 1) {
                            System.out.println("\nSilahkan beri nama perangkat Anda:");
                            System.out.print("Masukan nama: ");
                            String name = scanner.nextLine();
                            
                            android.setDeviceName(name);
                            android.setBrand("Samsung");
                            
                            System.out.println("Pembuatan device berhasil, berikut info device Anda:");
                            android.display();
                            
                            System.out.println("\nApakan Anda ingin membuat device lagi?");
                            System.out.print("Masukan pilihan (Y/n): ");
                            String con = scanner.nextLine();
                            if(con.equalsIgnoreCase("n")) {
                                boolContinue = false;
                            }

                        } else{
                            System.out.println("\nSilahkan beri nama perangkat Anda:");
                            System.out.print("Masukan nama: ");
                            String name = scanner.nextLine();

                            android.setDeviceName(name);
                            android.setBrand("Xiaomi");
                            
                            System.out.println("Pembuatan device berhasil, berikut info device Anda:");
                            android.display();
                            
                            System.out.println("\nApakan Anda ingin membuat device lagi?");
                            System.out.print("Masukan pilihan (Y/n): ");
                            String con = scanner.nextLine();
                            if(con.equalsIgnoreCase("n")) {
                                boolContinue = false;
                            }
                        }
                    } else{
                        // ios
                    }
                    
                    break;
                default:
                    System.out.println("Spesifikasi belum ada!");
                }
            }while(boolContinue);

            System.out.println("Program telah keluar!");
        }
    }
    