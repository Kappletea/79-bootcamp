import java.util.Scanner;

public class KarakteristikHewan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan persentase kesamaan minimal (N):");
        double persentaseMinimal = scanner.nextDouble();

        System.out.println("Masukkan ciri-ciri hewan A:");
        scanner.nextLine(); // Mengonsumsi karakter newline
        String ciriHewanA = scanner.nextLine().toLowerCase();

        System.out.println("Masukkan ciri-ciri hewan B:");
        String ciriHewanB = scanner.nextLine().toLowerCase();

        boolean hasilPerbandingan = bandingkanHewan(ciriHewanA, ciriHewanB, persentaseMinimal);

        if (hasilPerbandingan) {
            System.out.println("Hewan A dan Hewan B mirip.");
        } else {
            System.out.println("Hewan A dan Hewan B tidak mirip.");
        }
    }

    public static boolean bandingkanHewan(String ciriHewanA, String ciriHewanB, double persentaseMinimal) {
        int kesamaan = 0;

        for (int i = 0; i < ciriHewanA.length(); i++) {
            char c = ciriHewanA.charAt(i);
            if (ciriHewanB.contains(String.valueOf(c))) {
                kesamaan++;
            }
        }

        double persentaseKesamaan = ((double) kesamaan / Math.max(ciriHewanA.length(), ciriHewanB.length())) * 100;

        return persentaseKesamaan >= persentaseMinimal;
    }
}
