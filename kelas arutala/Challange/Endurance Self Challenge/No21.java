// Pola-1

// Buatlah program untuk membuat pola seperti pada contoh input dan contoh output.

// Spesifikasi Input

// Satu baris berisi satu buah bilangan bulat N (1 ≤ N ≤ 10).

// Spesifikasi Output

// Pola berukuran N × N dengan pola seperti pada contoh output.

// For example:
// Input 	Result

// 5

	

// *
// * *
// * * *
// * * * *
// * * * * *

import java.util.Scanner;

public class No21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan = Integer.parseInt(input.next());
        if(bilangan >= 1 && bilangan <=10){
            for(int i=0; i<bilangan; i++){
                for(int j = 0; j<=i; j++){
                    System.out.print("*" + " ");
                }
                System.out.print("\n");
            }
        }
    }
}
