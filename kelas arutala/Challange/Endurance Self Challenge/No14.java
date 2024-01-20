// Jumlah Volume Perbandingan 3 Bola

// Buatlah program untuk menghitung jumlah volume 3 buah bola yang memiliki perbandingan jari-jari R1 : R2 : R3, jika diketahui  r jari-jari bola ke-1.
// Gunakan Rumus: V = 4/3 x π × R3 , dengan V menunjukkan volume bola, R menunjukkan jari-jari lingkaran, dan π bernilai 3,14.

// Spesifikasi Input

// Satu baris berisi bilangan bulat R1,R2,R3 yang menunjukkan rasio jari-jari setiap bola  (1 ≤ R1,R2,R3 ≤ 100) dan bilangan riil r yang menunjukkan jari-jari bola ke 1  (0 < r  ≤ 99)

// Spesifikasi Output

// Satu baris berisi jumlah volume 3 buah bola dengan perbandingan setiap jari-jarinya R1,R2,R3 dan jari-jari r  yang menjadi input, dengan dua angka di belakang koma.

// For example:
// Input 	Result

// 1 2 3 3.00

	

// 4069.44

// 3 2 1 6.00

	

// 1205.76

a
import java.util.Scanner;
public class No14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilanganR1 = Integer.parseInt(input.next());
        int bilanganR2 = Integer.parseInt(input.next());
        int bilanganR3 = Integer.parseInt(input.next());
        double jariJari = Double.parseDouble(input.next());
        double rumusVolume = 0;
        double result = 0;

        if(bilanganR1 >= 1 && bilanganR1 <=100 && bilanganR2 >=1 && bilanganR2 <=100 && bilanganR3 >=1 &&bilanganR3 <=100){
            if(jariJari > 0 && jariJari<=99){
                rumusVolume = 4.0/3.0 * 3.14 * Math.pow(bilanganR1,3);

            }
        }

    }
    
}
