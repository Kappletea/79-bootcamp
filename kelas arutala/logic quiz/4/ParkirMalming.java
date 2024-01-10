import java.util.Scanner;

public class ParkirMalming {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int kendaraan, lama_parkir, total_parkir;
        int parkir_mobil = 1500;
        int parkir_motor = 1500;

        kendaraan = key.nextInt();
        lama_parkir = key.nextInt();
        if (kendaraan == 1) {
            if (lama_parkir > 5 && lama_parkir<=8) {
                parkir_mobil = 1500 + 500;
                total_parkir = parkir_mobil * lama_parkir;
                System.out.println(total_parkir);
            } else if (lama_parkir > 8) {
                System.out.println("disegel");
            } else {
                total_parkir = parkir_mobil * lama_parkir;
                System.out.println(total_parkir);
            }
        } else if (kendaraan == 2) {
            if (lama_parkir > 5 && lama_parkir<=8) {
                parkir_motor = 1000 + 500;
                total_parkir = parkir_mobil * lama_parkir;
                System.out.println(total_parkir);
            } else if (lama_parkir > 8) {
                System.out.println("disegel");
            } else {
                total_parkir = parkir_motor * lama_parkir;
                System.out.println(total_parkir);
            }
        }
    }
}
