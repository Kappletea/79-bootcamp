//volume limas
// Buatlah sebuah program untuk menghitung volume limas dengan alas segi empat.

// Rumus: V = 1 / 3 × P × L × T, dengan V menunjukkan volume, P menunjukkan panjang alas limas, L menunjukkan lebar alas limas, dan T menunjukkan tinggi limas.

//input 
// Baris pertama berisi bilangan riil P. Baris kedua berisi bilangan riil L. Baris ketiga berisi bilangan riil T.

// Jangkauan nilai ketiga variabel tersebut adalah 0 < P, L, T < 20.

// output
// Satu baris berisi volume limas dengan enam angka di belakang koma.

import java.util.Scanner;
public class No11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double inputPanjang = Double.parseDouble(input.next());
        double inputLuas = Double.parseDouble(input.next());
        double inputTinggi= Double.parseDouble(input.next());
        double rumusVolume = 0;
        double result = 0;
        if(inputPanjang >0 && inputPanjang <20 && inputLuas >0 && inputLuas <20 && inputTinggi >0 && inputTinggi <20){
            rumusVolume = 1.0/3.0 * inputPanjang * inputLuas * inputTinggi;
            result = rumusVolume;
            System.out.printf("%.8f", result);
        }
    }
}
