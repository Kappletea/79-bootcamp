// Promo Pujasera Polban

// Di Pujasera 79 terdapat promo untuk karyawan yang berulang tahun. Promo tersebut berlaku jika karyawan yang berulang tahun memesan makanan atau minuman dengan jumlah harga minimal Rp 50000.

// Jika memenuhi kriteria tersebut maka karyawan tersebut akan mendapat potongan harga sebesar :

// 2% x Tanggal Lahir x Jumlah Harga Makanan atau Minuman
// Bantulah seorang karyawan yang berulang tahun untuk menghitung uang yang harus dibayar jika pada hari ulang tahunnya dia membeli makanan atau minuman di Pujasera 79.

// Spesifikasi Input
// Satu baris berisi bilangan riil yang menujukkan jumlah harga makanan atau minuman yang sudah dipesan dan bilangan bulat yang menunjukkan tanggal lahir mahasiwa.

// Spesifikasi Output
// Satu baris berisi bilangan riil total uang yang harus dibayar mahasiwa yang berulang tahun dengan dua angka dibelakang koma.

import java.util.Scanner;
public class No26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double jumlahHarga = Double.parseDouble(input.next());
        int tanggalLahir= Integer.parseInt(input.next());
        int minimalHarga = 50000;
        double perhitungan = 0;
        double result = 0;
        if(jumlahHarga >= minimalHarga){

            perhitungan = 2.0/100 * tanggalLahir * jumlahHarga;   
            result = jumlahHarga-perhitungan;
            System.out.printf("%.2f",result);
        }else{
            System.out.printf("%.2f",jumlahHarga);
        }
        

    }
}
