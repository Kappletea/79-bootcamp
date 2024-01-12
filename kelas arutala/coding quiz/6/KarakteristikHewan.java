import java.util.Scanner;
public class KarakteristikHewan {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        double persentaseMinimal = key.nextDouble();
        key.nextLine();
        String ciriHewanA = key.nextLine().toLowerCase();
        String ciriHewanB = key.nextLine().toLowerCase();
        key.close();

        boolean hasilPerbandingan = bandingkanHewan(ciriHewanA, ciriHewanB, persentaseMinimal);

        if (hasilPerbandingan) {
            System.out.println("sama");
        } else {
            System.out.println("tidak sama");
        }
    }

    public static boolean bandingkanHewan(String ciriHewanA, String ciriHewanB, double persentaseMinimal) {
        int kesamaan = 0;
        char[] hewanA = ciriHewanA.toCharArray();
        char[] hewanB = ciriHewanB.toCharArray();
        int unik = hewanA.length + hewanB.length;
        for (int i = 0; i < hewanA.length; i++) {
            for(int j = 0; j< hewanB.length; j++){
                if(hewanA[i] == hewanB[j]){
                    kesamaan++;
                }
            }
        }

        double persentaseKesamaan = ((double) kesamaan / unik) * 100;

        return persentaseKesamaan >= persentaseMinimal;
    }
}
