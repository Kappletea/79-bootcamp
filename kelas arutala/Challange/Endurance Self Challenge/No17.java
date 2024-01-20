// konversi Reamur ke Kelvin

// Buatlah sebuah program untuk mengonversi suhu dalam satuan Reamur menjadi suhu dalam satuan Kelvin.
// Suhu °K = °R × 1.25 + 273

// Spesifikasi Input

// Satu baris berisi suhu dalam satuan Reamur dengan format bilangan riil, dengan jangkauan -273 ≤ suhu dalam Reamur ≤ 80.

// Spesifikasi Output

// Satu baris berisi nilai suhu dalam satuan Kelvin dengan dua angka di belakang koma.


import java.util.Scanner;
public class No17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double inputSuhuReamur = Double.parseDouble(input.next());

        if(inputSuhuReamur >= -273 && inputSuhuReamur <=80){
            double rumusKonversi = inputSuhuReamur *1.25+273.0;
            System.out.printf("%.2f", rumusKonversi);
        }
    }    
}
