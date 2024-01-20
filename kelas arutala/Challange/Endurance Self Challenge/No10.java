// program satpanm
//Satpam sebuah gedung membutuhkan sebuah program untuk mengetahui tindakan yang harus dilakukan kepada pengguna kendaraan bermotor yang parkir di tempat parkir kampus dan melakukan suatu pelanggaran.
//Berikut pelanggaran yang terjadi :

// 1.       Kehilangan karcis motor

// 2.       Tidak membawa STNK

// Berikut tindakan yang akan dilakukan :

// a.       Kasus 1 dilakukan sebanyak kurang dari 4 kali, satpam berhak meminta KTP mahasiwa sebagai jaminan

// b.      Kasus 1 dilakukan 4 kali atau lebih, satpam berhak meminta denda sebesar 10000 per-karcis

// c.       Kasus 2 terjadi, mahasiswa diminta untuk pulang dan mengambil STNK terlebih dahulu
// Bantulah satpam Polban untuk menentkan tindakan yang harus dilakukan.

// input
// Satu baris berisi bilangan bulat yang menunjukkan nomor kasus dan banyaknya kasus yang terjadi.

//output 
// Satu baris berisi tindakkan yang harus dilakukan oleh satpam.


import java.util.Scanner;
public class No10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nomorKasus = Integer.parseInt(input.next());
        int banyakKasus= Integer.parseInt(input.next());
        switch (nomorKasus) {
            case 1:
                if(banyakKasus <4){
                    System.out.println("Serahkan KTP anda !!!");
                }else if(banyakKasus>=4){
                    System.out.println("Bayar Denda 10000 !!!");
                }
                break;
            case 2:
                System.out.println("Ambil STNK dulu !!!");
                break;
            
            default:
            System.out.println("nomor kasus tersebut tidak tercantum");
                break;
        }

    }
}
