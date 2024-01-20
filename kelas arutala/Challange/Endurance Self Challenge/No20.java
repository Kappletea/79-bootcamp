// Mengurutkan Data Integer

// Buatlah program untuk mengurutkan tiga data integer yang dimasukkan secara descending (dari besar ke kecil).

// Spesifikasi Input

// Satu baris berisi tiga buah bilangan bulat. Masing-masing bilangan bulat memiliki jangkauan nilai -300 ≤ data ≤ 300.

// Spesifikasi Output

// Satu baris berisi tiga buah bilangan bulat yang sudah terurut secara descending, dipisahkan oleh satu spasi.


//
// For example:
// Input 	Result

// 5 8 6

	

// 8 6 5

// 100 150 300

	

// 300 150 100

// -2 -1 -300

	

// -1 -2 -300


import java.util.Scanner;
a
public class No20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan1 = Integer.parseInt(input.next());
        int bilangan2 = Integer.parseInt(input.next());
        int bilangan3 = Integer.parseInt(input.next());
        int[] arrBilangan = {bilangan1, bilangan2, bilangan3};
        int[] arrSorted = new int[arrBilangan.length];
        int MIN_INT = Integer.MIN_VALUE;
        if(bilangan1>=-300 && bilangan1 <=300 && bilangan2>=-300 && bilangan2 <=300 && bilangan3>=-300 && bilangan3 <=300){
            for(int i =0; i<arrBilangan.length; i++){
                if(arrBilangan[i] > MIN_INT){
                    arrSorted[i] = arrBilangan[i];
                }
            }
        }
        for(int i =0; i < arrSorted.length; i++){
            System.out.println(arrSorted[i] + " ");
        }  
    }
}
