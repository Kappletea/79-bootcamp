// Maksimal Tiga Bilangan


// Buatlah sebuah program untuk menentukan bilangan terbesar dari tiga bilangan yang dimasukkan.


// Spesifikasi Input

// Tiga baris, masing-masing berisi satu bilangan bulat Xi (-30 ≤ Xi ≤ 30).

// Spesifikasi Output

// Satu baris berisi bilangan bulat terbesar dari tiga bilangan bulat input.

// For example:

// Input 	Result

// 12
// 5
// 3

	

// 12

// 9
// 6
// 10

	

// 10

// 30
// 30
// 30

	

// 30

// 0
// 1
// -1

	

// 1


import java.util.Scanner;
public class No23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan1 = Integer.parseInt(input.nextLine());
        int bilangan2 = Integer.parseInt(input.nextLine());
        int bilangan3 = Integer.parseInt(input.nextLine());

        if(bilangan1 >=-30 && bilangan1 <=30 && bilangan2 >=-30 && bilangan2 <=30 && bilangan3 >=-30 && bilangan3 <=30){
            if(bilangan1>= bilangan2 && bilangan1 >= bilangan3){
                System.out.println(bilangan1);
            }else if(bilangan2>= bilangan1 && bilangan2 >= bilangan3){
                System.out.println(bilangan2);
            }else if(bilangan3>= bilangan1 && bilangan3 >= bilangan2){
                System.out.println(bilangan3);
            }
        }
    }
}
