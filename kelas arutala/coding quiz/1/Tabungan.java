import java.util.Scanner;

public class Tabungan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahAnggota = scanner.nextInt();
        int lamaTabungan = scanner.nextInt();

        long totalTabungan = hitungTotalTabungan(jumlahAnggota, lamaTabungan);
        System.out.println(totalTabungan);
    }

    public static long hitungTotalTabungan(int jumlahAnggota, int lamaTabungan) {
        long totalTabungan = 0;

        for (int bulan = 1; bulan <=lamaTabungan; bulan++) {

            int jumlahHari = 31;
            if (bulan == 2) {
                jumlahHari = 29;
            } else {
                jumlahHari = 31;
            }

            for (int hari = 1; hari <= jumlahHari; hari++) {
                totalTabungan += (long) hari * jumlahAnggota * 1000;
            }
        }

        return totalTabungan;
    }
}