import java.util.Scanner;

public class Berlubang {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String inputKarakter = key.nextLine();
        char[] inputKarakterArray = inputKarakter.toCharArray();
        char[] karakterBerlubang = { 'A', 'B', 'D', 'O', 'P', 'Q', 'R','a', 'b', 'd', 'e', 'g', 'o', 'p', 'q', '6','8','9','0','4',};
        cekKarakter(karakterBerlubang, inputKarakterArray);

    }

    public static void cekKarakter(char[] karakterBerlubang, char[] inputKarakterArray) {
        int jumlahLubang = 0;
        for (int i = 0; i < inputKarakterArray.length; i++) {
            for (int j = 0; j < karakterBerlubang.length; j++) {
                if (inputKarakterArray[i] == karakterBerlubang[j]) {
                    if ( karakterBerlubang[j] =='B' || karakterBerlubang[j]=='8') {
                        jumlahLubang = jumlahLubang + 1;
                    }
                    jumlahLubang = jumlahLubang + 1;
                }
            }
        }
        System.out.println(jumlahLubang);
    }
}
