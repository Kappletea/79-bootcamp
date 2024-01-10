import java.util.Scanner;

public class LuasNLingkaran {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        double Luas,phi;
        int jari,buah;
        Luas = 0;
        phi = 3.14;
        jari = key.nextInt();
        buah = key.nextInt();
        for(int i = 1; i<=buah;i++){
            Luas = phi*Math.pow(jari,2);
            Luas = Luas*i;
        }
        String hasil = String.format("%.2f", Luas);
        System.out.println(hasil);
    }
}
