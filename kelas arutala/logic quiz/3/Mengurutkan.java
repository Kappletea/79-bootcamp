import java.util.Scanner;

public class Mengurutkan {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int x,y,z;
        x = key.nextInt();
        y = key.nextInt();
        z = key.nextInt();

        if (x < y){
            int temp = x;
            x = y;
            y = temp;
        }

        if(y < z){
            int temp = y;
            y = z;
            z = temp;
        }

        if (x < y){
            int temp = x;
            x = y;
            y = temp;
        }
        System.out.println(x + " " + y + " " + z);
    }
}
