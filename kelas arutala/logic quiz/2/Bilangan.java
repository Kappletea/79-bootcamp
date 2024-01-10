import java.util.Scanner;

public class Bilangan {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int X,Y;
        X = key.nextInt();
        Y = key.nextInt();
        if(X>=0 && X<=Y && Y<=100){
            for(int i = X; X<=Y; X++){
                System.out.println(X);
            }
        }else{
            System.out.println("bilangan lebih dari seratus dan kurangan dari 0");
        }
    }
}
