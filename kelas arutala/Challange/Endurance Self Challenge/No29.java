// endapat Discount

// Buatlah program untuk menentukan jumlah uang yang harus dibayar apabila suatu barang dengan harga tertentu dan jumlah tertentu dapat mendapat potongan sebesar 15 % dari  total harga apabila jumlah barang yang dibeli adalah kelipatan 3 dan 4.

// Spesifikasi Input

// Sebuah bilangan riil yang merupakan harga barang ( 10000 ≤ hargaBarang ≤ 1000000 ) dan sebuah bilangan bulat yang merupakan jumlah barang  ( 1 ≤ jumlahBarang ≤ 100 )

// Spesifikasi Output

// Satu baris berisi total harga barang yang harus dibayar dengan dua angka dibelakang koma.


import java.util.Scanner;
public class No29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double hargaBarang = Double.parseDouble(input.next());
        int jumlahBarang= Integer.parseInt(input.next());
        double totalBarang =hargaBarang*jumlahBarang;
        double potongan = 15;
        double result =0;

        if(hargaBarang >10000 && hargaBarang<1000000){
           if(jumlahBarang >=1 && jumlahBarang <= 100){
            if(jumlahBarang%4==0 && jumlahBarang%3==0){
                double discount= potongan/100.0 *totalBarang;
                result = totalBarang - discount;
                System.out.printf("%.2f", result);
                
            }else{
                System.out.printf("%.2f", totalBarang);
            }
           }
        }
    }
}