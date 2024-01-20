//Dibaca sebuah bilangan bulat X dan Y. 
//Tampilkan  semua bilangan bulat dari X  hingga  Y dalam satu baris (dipisahkan oleh 1 spasi).
import java.util.Scanner;

public class No7 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int bilangan1, bilangan2;
    bilangan1 = Integer.parseInt(input.next());
    bilangan2 = Integer.parseInt(input.next());
    if(bilangan1 >= 0 && bilangan1 <=100 && bilangan2>=0 && bilangan2<=100){
        for(int i = bilangan1; i<=bilangan2; i++){
            System.out.print(i + " ");
        }
    }
   } 
}
