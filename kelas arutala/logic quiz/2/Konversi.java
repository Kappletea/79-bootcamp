import java.util.Scanner;

public class Konversi {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        double R, K;
        String hasil;
        R = key.nextInt();
        if (R == 0) {
            System.out.println(273.00);
        } else if(R >= -273 && R <= 80){
            K = Math.ceil(R * 1.2 + 273.15);
            hasil = String.format("%.2f", K);
            System.out.println(hasil);
        }else{
            System.out.println("melebihi batas");
        }
    }
}
