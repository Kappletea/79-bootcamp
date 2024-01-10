import java.util.Scanner;

public class KonversiWaktu {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int inputDetik = key.nextInt();

        int detikToHari = inputDetik / 86400;
        int sisaDetikHari = inputDetik % 86400;
        int detikToJam = sisaDetikHari / 3600;
        int sisaDetikJam = sisaDetikHari % 3600;
        int detikToMenit = sisaDetikJam / 60;
        int detikSisa = sisaDetikJam % 60;

        System.out.println(detikToHari);
        System.out.println(detikToJam);
        System.out.println(detikToMenit);
        System.out.println(detikSisa);

    }
}
