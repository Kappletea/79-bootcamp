import java.util.Scanner;

public class Promo {
    public static void main(String[] args) {
    Scanner key = new Scanner(System.in);
    double jumlahMN;
    int ttl;
    jumlahMN = key.nextDouble();
    ttl = key.nextInt();

    if(jumlahMN>=50000){
        double temp = jumlahMN;
        jumlahMN=0.02*ttl*jumlahMN;
        jumlahMN=temp-jumlahMN;
        String hasil = String.format("%.2f",jumlahMN);
        System.out.println(hasil);
    }else{
        String hasil = String.format("%.2f",jumlahMN);
        System.out.println(hasil);
    }
    }
}
