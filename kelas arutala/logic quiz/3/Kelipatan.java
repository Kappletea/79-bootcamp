import java.util.Scanner;

public class Kelipatan {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int bilangan;
        int cek;

        cek = 0;
        bilangan = key.nextInt();
        if(bilangan % 3 == 0 && bilangan % 4 == 0){
            cek = 1;
            System.out.println(cek);
        }else{
            System.out.println(cek);
        }
    }
}
