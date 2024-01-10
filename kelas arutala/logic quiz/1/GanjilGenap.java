import java.util.Scanner;
public class GanjilGenap {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int X;
        X = key.nextInt();
        if(X%2 == 0){
            System.out.println("genap");
        }else{
            System.out.println("ganjil");
        }
    }
}
