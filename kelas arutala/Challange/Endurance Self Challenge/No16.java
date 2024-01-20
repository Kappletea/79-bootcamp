// Parkir Malam Minggu

// Setiap malam Minggu, Ima pergi dengan “adik angkat”-nya. Ia menyimpan kendaraannya di suatu tempat parkir. Kendaraan yang digunakan Ima ketika bermalam Minggu bisa motor ataupun mobil, tergantung “adik angkat”-nya ingin dijemput dengan apa.

// Di tempat parkir tersebut, ketentuan yang berlaku adalah:

//     Parkir mobil: Rp1.500/jam
//     Parkir motor: Rp1.000/jam
//     Jika kendaraan sudah parkir lebih dari 5 jam, maka akan kena tarif tambahan sebesar Rp500/jam (baik motor maupun mobil).
//     Jika kendaraan sudah parkir lebih dari 8 jam, maka kendaraan akan disegel oleh pengelola parkir.

// Malam Minggu ini Ima sedang kesepian, dan ia mengajakmu sebagai “adik angkat”-nya Ima. Sebagai “adik angkat” yang baik, bantulah Ima untuk menentukan biaya parkir yang harus dibayar dan memberitahu jika kendaraannya ternyata harus disegel!

// Spesifikasi Input

// Baris pertama berisi angka 1 jika kendaraan yang parkir adalah mobil, atau angka 2 jika kendaraan yang parkir adalah motor.
// Baris kedua berisi bilangan bulat berupa lama waktu parkir dalam satuan jam (0 < lama parkir ≤ 24).

// Spesifikasi Output

// Satu baris berisi bilangan bulat berupa total biaya parkir yang harus dibayarkan dalam rupiah, atau keluarkan “disegel” jika ternyata kendaraan Ima harus disegel.

import java.util.Scanner;

public class No16 {
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
