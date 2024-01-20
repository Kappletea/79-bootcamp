//Parkir Malam Minggu

import java.util.Scanner;

public class No25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arrKendaraan = { 1, 2 };
        String[] kendaraan = { "Mobil", "Motor" };
        int kendaraanUser = Integer.parseInt(input.next());
        int lamaParkir = Integer.parseInt(input.next());
        int tarifPerJamMobil = 1500;
        int tarifPerJamMotor = 1000;
        int tarifTambahanPerJam = 500;
        int totalPembayaran = 0;

        switch (kendaraanUser) {
            case 1:
            if (lamaParkir > 0 && lamaParkir <= 24) {
                if (lamaParkir > 8) {
                    System.out.println("disegel");
                }else if (lamaParkir <= 5) {
                    totalPembayaran = tarifPerJamMobil * lamaParkir;
                    System.out.println(totalPembayaran);
                } else if (lamaParkir > 5) {
                    totalPembayaran = (tarifPerJamMobil + tarifTambahanPerJam) * lamaParkir;
                    System.out.println(totalPembayaran);
                } 
            }
                break;
            case 2:
                if (lamaParkir > 0 && lamaParkir <= 24) {
                    if (lamaParkir > 8) {
                        System.out.println("disegel");
                    }else if (lamaParkir <= 5) {
                        totalPembayaran = tarifPerJamMotor * lamaParkir;
                        System.out.println(totalPembayaran);
                    } else if (lamaParkir > 5) {
                        totalPembayaran = (tarifPerJamMotor + tarifTambahanPerJam) * lamaParkir;
                        System.out.println(totalPembayaran);
                    } 
                }
                break;
            default:
                break;
        }
    }
}
