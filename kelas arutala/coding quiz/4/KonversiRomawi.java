import java.util.Scanner;

public class KonversiRomawi {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int inputAngka = key.nextInt();

        if (inputAngka < 1 || inputAngka > 3999) {
            System.out.println("Angka tidak valid");
        } else {
            String hasil = "";

            int[] nilai = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
            String[] romawi = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

            for (int i = nilai.length - 1; i >= 0; i--) {
                while (inputAngka >= nilai[i]) {
                    hasil += romawi[i];
                    inputAngka -= nilai[i];
                }
            }
            System.out.println(hasil);
        }
    }
}
