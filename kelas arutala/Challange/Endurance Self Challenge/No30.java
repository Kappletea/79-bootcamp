// Wujud Benda

// Suatu benda dikatakan berwujud cair jika suhunya berada di kisaran 0 s.d. 100 °C. Selain itu, benda dikatakan berwujud non cair.

// Buatlah sebuah program untuk menentukan wujud suatu benda jika diketahui suhunya.

// Spesifikasi Input

// Satu baris berisi bilangan riil yang menunjukkan suhu benda (-150 ≤ suhu ≤ 150).
// Spesifikasi Output

// Satu baris berisi “berwujud cair” (tanpa tanda petik) jika benda berwujud cair, atau berisi “berwujud non cair” jika benda berwujud non cair.


import java.util.Scanner;
public class No30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double suhuBenda = Double.parseDouble(input.next());
        if(suhuBenda >= -150 && suhuBenda <=150){
            if(suhuBenda >=0 && suhuBenda <=100){
                System.out.println("berwujud cair");
            }else{
                System.out.println("berwujud non cair");
            }
        }
    }
}
