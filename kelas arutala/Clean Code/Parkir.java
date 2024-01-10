import java.util.Scanner;

public class Parkir {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int kendaraan = key.nextInt();
        int jam = key.nextInt();

        if (jam > 0 && jam <= 24) {
            switch (kendaraan) {
                case 1:
                    System.out.println(Parkir.Mobil(jam));
                    break;
                case 2:
                    System.out.println(Parkir.Motor(jam));
                    break;
                case 3:
                    System.out.println(Parkir.Box(jam));
                    break;
            }
        }else{
            System.out.println("Input Error!!!");
        }
    }

    public static int Mobil(int jam) {
        int tarif = 0;
        if (jam == 1) {
            tarif = 5000;
        } else if (jam >= 1) {
            jam = jam-1;
            tarif = 5000 + (2000 * jam);
        }
        if(tarif > 25000){
            tarif = 25000;
        }
        return tarif;
    }

    public static int Motor(int jam){
        int tarif = 0;
        if (jam == 1) {
            tarif = 2000;
        } else if (jam >= 1) {
            jam = jam-1;
            tarif = 2000 + (1000 * jam);
        }
        if(tarif > 10000){
            tarif = 10000;
        }
        return tarif;
    }

    public static int Box(int jam){
    int tarif = 0;
        if (jam == 1) {
            tarif = 10000;
        } else if (jam >= 1) {
            jam = jam-1;
            tarif = 10000 + (5000 * jam);
        }
        if(tarif>50000){
            tarif = 50000;
        }
        return tarif;
    }
}