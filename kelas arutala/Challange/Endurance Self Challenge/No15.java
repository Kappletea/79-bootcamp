// Membuat Teks Alay

// Buatlah sebuah program untuk mengubah suatu kalimat ke dalam bentuk “alay”.

// Ketentuannya adalah:

// Huruf
	

// Diubah menjadi

// A atau a
	

// 4

// I atau i
	

// 1

// Z atau z
	

// 2

// E atau e
	

// 3

// G atau g
	

// 6

// J atau j
	

// 7

// B atau b
	

// 8


// Spesifikasi Input

// Satu baris berisi string/array karakter dengan panjang maksimal 50 karakter.
// Spesifikasi Output
// Satu baris berisi string yang sudah berada dalam bentuk “alay”.

import java.util.Scanner;
public class No15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputUser = input.nextLine();
        char[] arrKalimat = inputUser.toCharArray();
        if(arrKalimat.length <=50){
            for(int i = 0; i <arrKalimat.length; i++){
                switch (arrKalimat[i]) {
                 case 'A':
                 case 'a':
                     arrKalimat[i] = '4';
                     break;
                 case 'I':
                 case 'i':
                 arrKalimat[i] = '1';
                 break;
                 case 'Z':
                 case 'z':
                 arrKalimat[i] = '2';
                 break;
                 case 'E':
                 case 'e':
                 arrKalimat[i] = '3';
                 break;
                 case 'G':
                 case 'g':
                 arrKalimat[i] = '6';
                 break;
                 case 'J':
                 case 'j':
                 arrKalimat[i] = '7';
                 break;
                 case 'B':
                 case 'b':
                 arrKalimat[i] = '8';
                 break;
                 default:
                     break;
                }
             }
             for(int i=0; i<arrKalimat.length; i++){
                System.out.print(arrKalimat[i]);
            }
        }else{
            System.out.println("Input sudah maks");
        }
        
    }
}
