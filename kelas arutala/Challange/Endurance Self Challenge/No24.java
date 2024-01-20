// Menghitung Huruf Berlubang smile


// Seorang programmer menulis suatu teks pada sebuah kertas dan sekarang dia ingin mengetahui berapa banyak "lubang" yang terdapat pada teks tersebut.

// Apa yang dimaksud dengan “lubang”?

// Huruf ‘A’, ‘D’, ‘O’, dan ‘P’ mempunyai satu lubang. Huruf ‘B’ mempunyai 2 lubang. Sedangkan huruf ‘C’, ‘E’, ‘F’, dan lainnya tidak memiliki lubang.

//  Jadi, dapat dikatakan bahwa jumlah lubang pada teks tersebut sama dengan jumlah total lubang dari setiap huruf yang ada.

//  Bantulah programmer tersebut untuk menghitung berapa banyak lubang yang terdapat pada sebuah teks dengan membuat sebuah program!

// Spesifikasi Input

// Satu baris berisi string/array karakter dengan panjang maksimal 50 karakter, hanya terdiri dari huruf-huruf alfabet, dan hanya berupa huruf kapital.

// Spesifikasi Output

// Satu baris berisi bilangan bulat yang menyatakan jumlah lubang pada string tersebut.

import java.util.Scanner;
public class No24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputKalimat= String.valueOf(input.nextLine());
        char[] arrKalimat = inputKalimat.toCharArray();
        int jumlahLubang = 0;
        for(int i = 0; i<arrKalimat.length; i++){
            if(arrKalimat[i] =='A' || arrKalimat[i] =='D' || arrKalimat[i] =='O' || arrKalimat[i] =='P' || arrKalimat[i] == 'R' || arrKalimat[i] == 'Q'){
                jumlahLubang= jumlahLubang +1;
            }else if(arrKalimat[i] == 'B'){
                jumlahLubang = jumlahLubang+2;
            }
        }
        System.out.println(jumlahLubang);
    }
}
