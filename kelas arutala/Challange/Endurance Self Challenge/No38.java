// Sandi Pramuka

// Table of Content : 

// Variable, Boolean Expression, IF(IF, Else, Else IF), Switch-Case, Looping (FOR, WHILE, DO-WHILE), Array, Function.

// Sebagai seorang anggota pramuka, Anda ditugaskan untuk mengirimkan pesan rahasia kepada pembina pramuka yang berada di kamp penjagaan yang berjarak sangat jauh dari lokasi Anda. Pesan tersebut harus dienkripsi dengan metode sandi pramuka berikut:

//     Setiap huruf akan diubah menjadi angka berdasarkan tabel berikut:


// A 	1 	E 	2 	I 	3 	M 	4 	Q 	5 	U 	6 	Y 	7
// B 	11 	F 	22 	J 	33 	N 	44 	R 	55 	V 	66 	Z 	77
// C 	111 	G 	222 	K 	333 	O 	444 	S 	555 	W 	666 	  	 
// D 	1111 	H 	2222 	L 	3333 	P 	4444 	T 	5555 	X 	6666 	  	 

//     Dua huruf bersebelahan yang memiliki sandi angka yang sama, dipisahkan dengan tanda minus (-). Contoh: POS disandikan menjadi 4444-444555.

//     Spasi disandikan dengan 0.

//     Penulisan pesan tidak boleh menggunakan karakter selain huruf dan spasi.


// Bantulah anggota pramuka tersebut untuk mengubah teks ke dalam bentuk sandi sesuai ketentuan. Dalam penulisan program, sandi disimpan di dalam array bertipe integer.

// List Function utama yang harus ada:

//     public static void main(String[] args)

// Fungsi ini adalah entry point dari program Java. Ini adalah tempat di mana eksekusi program dimulai. Di dalam fungsi ini, program bisa mengatur aliran eksekusi dan memanggil fungsi-fungsi lain yang diperlukan untuk menjalankan tugas tertentu.

//     private static int[] encodeToSandi(String input)

// Fungsi ini bertanggung jawab untuk mengubah string input menjadi array of integer yang merupakan representasi sandi sesuai dengan aturan encoding yang telah didefinisikan. Fungsi ini juga menerapkan aturan encoding yang terdiri dari mengubah karakter ke angka sesuai dengan getSandiNumber(), dan menghitung pengulangan karakter sesuai dengan getCount().

//     private static int getSandiNumber(char c)

// Fungsi ini mengembalikan angka yang merupakan kode sandi untuk karakter yang diberikan. Fungsi ini mengikuti aturan kode sandi yang didefinisikan dalam switch-case.

//     private static int getCount(char c)

// Fungsi ini mengembalikan jumlah pengulangan karakter berdasarkan karakter yang diberikan. Fungsi ini juga mengikuti aturan yang telah didefinisikan dalam switch-case.

//     private static String generateSandiString(int[] sandi)

// Fungsi ini bertanggung jawab untuk mengubah array of integer yang merepresentasikan sandi menjadi string sandi yang akhir. Fungsi ini melakukan konversi dari array integer ke bentuk string sesuai dengan aturan tertentu.

// Ketentuan Input :
// - 1 Baris kalimat yang nantinya akan disandikan / dirubah menjadi sandi.
// - Input dipastikan berupa huruf kapital

// Ketentuan Output:
// - 1 Baris berupa sandi hasil perubahan dari kalimat pada input dengan ketentuan seperti tertera pada soal.

// For example:
// Test 	Input 	Result

// 1

	

// SIAP KONSENTRASI

	

// 5553144440333444-445552445555-5515553

a
import java.util.Scanner;
public class No38 {

    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        String inputKalimat = inputUser.nextLine();
        char[] c = inputKalimat.toCharArray();
        int[] code = new int[c.length];
        for(int i = 0; i<c.length; i++){
            code[i] = getSandiNumber(c[i]);
        }
        for(int i = 0; i<code.length; i++){
            if(code[i] == 0){
                System.out.print("-");
            }else{
                System.out.print(code[i]);
            }
           
        }
    }

    private static int getSandiNumber(char c){
        switch (c) {
            case 'A':
                return 1;
                case 'B':
                return 11;
                case 'C':
                return 111;
                case 'D':
                return 1111;
                case 'E':
                return 2;
                case 'F':
                return 22;
                case 'G':
                return 222;
                case 'H':
                return 2222;
                case 'I':
                return 3;
                case 'J':
                return 33;
                case 'K':
                return 333;
                case 'L':
                return 3333;
                case 'M':
                return 4;
                case 'N':
                return 44;
                case 'O':
                return 444;
                case 'P':
                return 4444;
                case 'Q':
                return 5;
                case 'R':
                return 55;
                case 'S':
                return 555;
                case 'T':
                return 5555;
                case 'U':
                return 6;
                case 'V':
                return 66;
                case 'W':
                return 666;
                case 'X':
                return 6666;
                case 'Y':
                return 7;
                case 'Z':
                return 77;
            default:
                return 0;
        }

    }
   
}

