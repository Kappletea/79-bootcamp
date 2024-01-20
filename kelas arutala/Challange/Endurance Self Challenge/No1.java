//Dibaca dua bilangan bulat X dan Y. 
//Tampilkan semua bilangan bulat dari X hingga  Y, masing-masing dalam satu baris.

import java.util.Scanner;
public class No1{
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int bilangan1 = Integer.parseInt(key.next());
        int bilangan2 = Integer.parseInt(key.next());

        if(bilangan1 >= 0 && bilangan1 <=100 && bilangan2 >=0 && bilangan2 <= 100){
            for(int i = bilangan1; i<=bilangan2; i++){
                System.out.println(i);
            }
        }
        
    }   
}