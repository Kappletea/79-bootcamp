// Biaya Setelah Bunga

// Buatlah (lengkapilah) program di bawah ini, untuk menghitung total biaya yang harus dibayar, jika diketahui biaya awal dan persen bunga pembayarannya.

// Spesifikasi Input

// Baris pertama berisi sebuah bilangan riil yang menyatakan biaya awal, di mana biaya awal selalu positif dan kurang dari 150000 (0 < biaya awal < 150000).

// Baris kedua berisi sebuah bilangan riil yang menyatakan bunga dalam persen (0 ≤ bunga ≤ 100) .


// Spesifikasi Output

// Satu baris berisi total biaya yang harus dibayar dengan dua angka di belakang koma.

import java.util.Scanner;
public class No27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double biayaAwal = Double.parseDouble(input.next());
        double bunga = Double.parseDouble(input.next());
        double result =0;

        if(biayaAwal >0 && biayaAwal <150000){
            if(bunga>=0 && bunga <= 100){
                if(bunga !=0){
                double hitung = bunga/100.0 *biayaAwal;
                result = biayaAwal+hitung;
                System.out.printf("%.2f", result);
                }else{
                    result = biayaAwal;
                    System.out.printf("%.2f", result);
                }
            }
        }
    }
}
