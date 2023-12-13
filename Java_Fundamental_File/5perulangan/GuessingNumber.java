import java.util.Scanner;
import java.util.Random;
public class GuessingNumber {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        int tebakanUser, nomorAcakSistem,tries;

        System.out.println("I am thinking of number from 1 to 10");
        nomorAcakSistem = rand.nextInt(11);
        System.out.println("You must guess what it is in three tries");
        

        // do{
        //     System.out.println("Enter a guess:");
        //     tebakanUser = keyboard.nextInt();
        //     if(tebakanUser+3 == nomorAcakSistem){
        //         System.out.println("dingin");
        //     }else if(tebakanUser+2 == nomorAcakSistem){
        //         System.out.println("hangat");
        //     }else if(tebakanUser+1 == nomorAcakSistem){
        //         System.out.println("panas");
        //     }
        // }while(tebakanUser != nomorAcakSistem);
        // if(tebakanUser == nomorAcakSistem){
        //     System.out.println("correct");
        // }else{
        //     System.out.println("wrong");
        // }

        for(tries = 0 ; tries <=3; tries++){
            System.out.println("Enter a Guess: ");
            tebakanUser = keyboard.nextInt();
            // if(tebakanUser+3 == nomorAcakSistem){
            //     System.out.println("dingin");
            // }else if(tebakanUser+2 == nomorAcakSistem){
            //     System.out.println("hangat");
            // }else if(tebakanUser+1 == nomorAcakSistem){
            //     System.out.println("panas");
            // }else if(tebakanUser == nomorAcakSistem){
            //     tries=3;
            //     System.out.println("correct");
            // }
            
            if(tebakanUser!=nomorAcakSistem){
                if(tebakanUser+3 == nomorAcakSistem){
                    System.out.println("dingin");
                }else if(tebakanUser+2 == nomorAcakSistem){
                    System.out.println("hangat");
                }else{
                    System.out.println("panas");
                }
            }else if(tries==3 && tebakanUser != nomorAcakSistem){
                System.out.println("You have lost the game");
                System.out.println("The correct number was "+nomorAcakSistem);
            }else{
                tries=3;
                System.out.println("correct");
            }
            
        }
       
        

    }
}
