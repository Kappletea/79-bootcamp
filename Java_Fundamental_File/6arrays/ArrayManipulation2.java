import java.util.Scanner;

public class ArrayManipulation2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int posisi,nilaiGanti=0;
        int bilangan[] = { 3, 2, 5, 11, 7, 10, 11, 3, 15, 11, 17, 10, 5 };
        
        System.out.println("Merubah Nilai dari Array Numbers!");
        System.out.println("array: ");
        System.out.println("{ 3, 2, 5, 11, 7, 10, 11, 3, 15, 11, 17, 10, 5 }");

        
        System.out.print("Masukkan posisi yang mau diganti 1-13: ");
        posisi = keyboard.nextInt();

        System.out.print("Masukkan nilai yang ingin diganti: ");
        nilaiGanti=keyboard.nextInt();

        for(int i = 0; i<bilangan.length; i++){
            if(posisi -1 == i){
                bilangan[i] = nilaiGanti;
            }
        }

        System.out.println("hasil penggantian: ");
        System.out.print("{ ");
        for(int i = 0; i<bilangan.length;i++){
            System.out.print(bilangan[i] + ", ");
        }
        System.out.println(" }");
       
    }
}   
