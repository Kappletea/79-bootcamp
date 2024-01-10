import java.util.Scanner;

public class pola1 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int x = key.nextInt();

        for (int i = 1; i <= x; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
