// Peserta Ujian Nasional pada tahun 2020 dikejutkan dengan soal yang menggemparkan yang mereka sebut Bahasa Panda. Bahasa Panda ini memiliki beberapa aturan seperti yang akan dijelaskan di bawah ini:

//     Setiap huruf akan diubah menjadi angka berdasarkan tabel berikut:

// A -> 1

// B -> 2

// C -> 3

// D -> 4

// E -> 5

// F -> 6

// G -> 7

// H -> 8

// I -> 9

// J -> 10

// K -> 11

// L -> 12

// M -> 13

// N -> 14

// O -> 15

// P -> 16

// Q -> 17

// R -> 18

// S -> 19

// T -> 20

// U -> 21

// V -> 22

// W -> 23

// X -> 24

// Y -> 25

// Z -> 26

//     Penulisan pesan hanya menggunakan huruf dan spasi.

//     Spasi digantikan dengan tanda minus (-)

//     Angka-angka dipisahkan dengan tanda titik (.).

// Fungsi yang Harus Dibuat:

//     private static int getSandiNumber(char c)

// Fungsi ini mengambil karakter sebagai argumen dan mengembalikan angka yang sesuai dengan tabel sandi pramuka.

//     private static int[] encodeToSandi(String input)

// Fungsi ini mengambil input berupa string dan mengembalikan array integer yang merepresentasikan sandi sesuai dengan aturan enkripsi yang telah diberikan.

//     private static String generateSandiString(int[] sandi)

// Fungsi ini mengambil array integer sandi dan mengembalikan string yang merupakan representasi akhir dari sandi.

//     public static void main(String[] args)

// Fungsi utama yang bertanggung jawab untuk menerima input dari pengguna, memanggil fungsi-fungsi yang diperlukan, dan menampilkan sandi yang dihasilkan.

// Tugas Anda:

// Buatlah program Java yang mengimplementasikan fungsi-fungsi di atas sesuai dengan aturan yang telah diberikan. Anda tidak perlu mengimplementasikan input yang rumit; Anda dapat mengambil input dari pengguna menggunakan Scanner. Pastikan program Anda menghasilkan sandi yang benar sesuai.

// Input

// UTBK SBMPTN

// Output

// 21.20.2.11-19.2.13.16.20.14


a
import java.util.Scanner;

public class No32 {
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
                System.out.print(code[i] + ".");
            }
        }
    }

    private static int getSandiNumber(char c){
        switch (c) {
            case 'A':
                return 1;
                case 'B':
                return 2;
                case 'C':
                return 3;
                case 'D':
                return 4;
                case 'E':
                return 5;
                case 'F':
                return 6;
                case 'G':
                return 7;
                case 'H':
                return 8;
                case 'I':
                return 9;
                case 'J':
                return 10;
                case 'K':
                return 11;
                case 'L':
                return 12;
                case 'M':
                return 13;
                case 'N':
                return 14;
                case 'O':
                return 15;
                case 'P':
                return 16;
                case 'Q':
                return 17;
                case 'R':
                return 18;
                case 'S':
                return 19;
                case 'T':
                return 20;
                case 'U':
                return 21;
                case 'V':
                return 22;
                case 'W':
                return 23;
                case 'X':
                return 24;
                case 'Y':
                return 25;
                case 'Z':
                return 26;
            default:
                return 0;
        }

    }
}
