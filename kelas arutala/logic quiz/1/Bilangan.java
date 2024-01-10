import java.util.Scanner;

public class Bilangan{
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int X;
        X = key.nextInt();
        if(X >= 0 && X<=100){
            System.out.print(X*2);
        }else{
            System.out.println("input harus kurang dari seratus");
        }
    }
}