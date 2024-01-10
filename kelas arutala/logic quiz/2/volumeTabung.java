import java.util.Scanner;

public class volumeTabung {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        double V, phi;
        int R, t;
        phi = 3.14;
        R = key.nextInt();
        t = key.nextInt();
        if ((R > 0 && R <= 100) && (t > 0 && t <= 100)) {
            V = phi * Math.pow(R, 2) * t;
            String hasil = String.format("%.2f", V);
            System.out.println(hasil);
        }else{
            System.out.println("out of bound");
        }
    }

}
