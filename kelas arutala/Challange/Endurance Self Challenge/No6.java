//Luas Lingkaran
//Lengkapilah prototipe di bawah ini untuk menghitung luas lingkaran jika diketahui jari-jarinya
// Rumus: L = π ×  R2, dengan L menunjukkan luas lingkaran,  R  menunjukkan jari-jari lingkaran, dan πbernilai 3.14.

import java.util.Scanner;
public class No6 { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double inputBIlanganR = Double.parseDouble(input.next());
        double rumusLingakaran = 0;
        double total=0;
        if(inputBIlanganR > 0 && inputBIlanganR <=100){
            rumusLingakaran = 3.14 * Math.pow(inputBIlanganR,2);
            total = rumusLingakaran;
            System.out.printf("%.2f", total);
        }
    }
    
}
