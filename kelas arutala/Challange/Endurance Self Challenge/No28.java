// gajil genap
import java.util.Scanner;
public class No28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputBilangan = Integer.parseInt(input.next());
        
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
