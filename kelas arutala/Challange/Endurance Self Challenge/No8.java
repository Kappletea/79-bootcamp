//Eva sedang jalan-jalan di luar negeri dan ingin mengambil  x dolar Amerika dari sebuah ATM. Mesin ATM hanya mau mengeluarkan uang dalam kelipatan 5 USD. Untuk setiap transaksi, Eva akan dikenakan transaksi 0.5 USD.
//Buatlah program untuk menghitung saldo rekening Eva setelah dilakukan transaksi.
// input
//Satu baris berisi bilangan bulat jumlah uang yang akan diambil Eva dan bilangan riil yang berisi saldo di rekening Eva dengan 2 angka dibelakang koma.
//output 
// Satu baris saldo rekening Eva setelah dikenakan transaksi, dengan dua angka dibelakang koma.
// Jika saldo rekening Eva tidak cukup untuk melakukan transaksi, keluarkan saldo rekening semula.

import java.util.Scanner;

public class No8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int uangDiambil = Integer.parseInt(input.next());
        double saldoRekening = Double.parseDouble(input.next());
        double saldoRekeningSemula = saldoRekening;
        double biayaTransaksi = 0.5;
        double result = 0;
        if(saldoRekening - uangDiambil == 0){
           System.out.printf("%.2f",saldoRekeningSemula);
        }else{
           if(uangDiambil%5 ==0){
            result = saldoRekening - uangDiambil -biayaTransaksi;
            System.out.printf("%.2f",result);
           }else{
            System.out.printf("%.2f", saldoRekeningSemula);
           }
        }
    }
}
