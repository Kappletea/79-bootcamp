import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int uang_diambil;
        double saldosebelum, saldosekarang, biayaTransaksi = 0.5;
        uang_diambil = key.nextInt();
        saldosebelum = key.nextDouble();
        saldosekarang = saldosebelum;
        if (uang_diambil % 5 == 0) {
            saldosekarang = (saldosekarang - uang_diambil) - biayaTransaksi;
            if (saldosekarang < 0) {
                // String hasil = String.format("%.2f", saldosebelum);
                // System.out.println(hasil);
                
                System.out.println("%.2f", saldosebelum);
            } else {
                String hasil = String.format("%.2f", saldosekarang);
                System.out.println(hasil);
            }

        } else {
            String hasil = String.format("%.2f", saldosekarang);
            System.out.println(hasil);
        }
    }
}
