// Ganjil, Genap, atau Nol
//Buatlah sebuah program untuk menentukan apakah suatu bilangan termasuk bilangan ganjil atau genap.


import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int inputBilangan = Integer.parseInt(key.next());
        
        if(inputBilangan>=0 && inputBilangan <=100){
           if(inputBilangan == 0){
                System.out.println("nol");
           }else{
            if(inputBilangan%2==0){
                System.out.println("genap");
            }else if(inputBilangan%2==1) {
                System.out.println("ganjil");
            }
           }
        }
    }    
}
