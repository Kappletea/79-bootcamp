import java.util.Scanner;

public class SandiPramuka {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String inputKalimat = key.nextLine();
        key.close();

        int[] arrHasilEncode = encodeToSandi(inputKalimat);
        String hasilEncode = generateSandiString(arrHasilEncode);
        System.out.println(hasilEncode);
        // cek output
        // System.out.print("{");
        // for(int i = 0; i<arrayInputKalimat.length; i++){
        // System.out.print(arrayInputKalimat[i]+",");
        // }
        // System.out.print("}");
    }

    private static int[] encodeToSandi(String inputKalimat) {
        char[] arrayInputKalimat = inputKalimat.toCharArray();
        int[] result = new int[arrayInputKalimat.length];// array baru 3

        for (int i = 0; i < arrayInputKalimat.length; i++) {
            result[i] = getSandiNumber(arrayInputKalimat[i]);
        }

        return result;
    }

    private static int getSandiNumber(char arrayInputKalimat) {
        switch (arrayInputKalimat) {
            case 'A':
                return 1;
            case 'B':
                return 11;
            case 'C':
                return 111;
            case 'D':
                return 1111;
            case 'E':
                return 2;
            case 'F':
                return 22;
            case 'G':
                return 222;
            case 'H':
                return 2222;
            case 'I':
                return 3;
            case 'J':
                return 33;
            case 'K':
                return 333;
            case 'L':
                return 3333;
            case 'M':
                return 4;
            case 'N':
                return 44;
            case 'O':
                return 444;
            case 'P':
                return 4444;
            case 'Q':
                return 5;
            case 'R':
                return 55;
            case 'S':
                return 555;
            case 'T':
                return 5555;
            case 'U':
                return 6;
            case 'V':
                return 66;
            case 'W':
                return 666;
            case 'X':
                return 6666;
            case 'Y':
                return 7;
            case 'Z':
                return 77;
            default:
                return 0;
        }
    }

    private static int getCount(char arrayInputKalimat) {
        String str = String.valueOf(arrayInputKalimat);

        switch (str) {
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
                return 1;
            case "11":
            case "22":
            case "33":
            case "44":
            case "55":
            case "66":
            case "77":
                return 2;
            case "111":
            case "222":
            case "333":
            case "444":
            case "555":
            case "666":
                return 3;
            case "1111":
            case "2222":
            case "3333":
            case "4444":
            case "5555":
            case "6666":
                return 4;
            default:
                return 0;
        }
    }

    private static String generateSandiString(int[] sandi) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < sandi.length; i++) {
            result.append(sandi[i]);
        }

        return result.toString();
    }
}
