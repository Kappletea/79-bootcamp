// Luas N-Lingkaran

// Lengkapilah prototipe di bawah ini untuk menghitung Jumlah Luas N buah Lingkaran yang identik jika diketahui jari-jarinya.
// Gunakan Rumus: L = π × R2 , dengan L menunjukkan luas lingkaran, R menunjukkan jari-jari lingkaran, dan π bernilai 3,14.

// Spesifikasi Input

// Satu baris berisi bilangan riil R (0 < R ≤ 100) dan bilangan bulat N  (0 < N ≤ 50)

// Spesifikasi Output

// Satu baris berisi jumlah luas N-lingkaran dengan jari-jari R dan sebanyak N yang menjadi input, dengan dua angka di belakang koma.

import java.util.Scanner;
public class No18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double jariJari = Double.parseDouble(input.next());
        int berapaKali = Integer.parseInt(input.next());
        double result =0;
        if(jariJari>0 && jariJari<=100 && berapaKali >0 && berapaKali <=50){
            for(int i = 0; i<berapaKali ; i++){
                double rumusKonversi = 3.14 * Math.pow(jariJari, 2);
                result = result +rumusKonversi;
            }
            System.out.printf("%.2f", result);
        }
    }
    
}
