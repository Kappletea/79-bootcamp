import java.util.Scanner;
public class AgeMessages{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int umur;

        System.out.println("Berapa umur kau?");
        umur = input.nextInt();

        if(umur >=18){
            System.out.println("Kamu dapat membuat SIM");
        } 
    }
}