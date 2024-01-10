import java.util.Scanner;

public class Bilangan2 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int X, Y;
        X = key.nextInt();
        Y = key.nextInt();
        for (int i = X; X <= Y; X++) {
            System.out.print(X+" ");
        }
    }
}
