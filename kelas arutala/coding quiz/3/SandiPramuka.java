import java.util.Scanner;


public class SandiPramuka {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String inputKalimat = key.next();
        int[] hasil = encodeToSandi(inputKalimat);
        for (int code : hasil) {
            System.out.print(code + " ");
        }

    }

    private static int[] encodeToSandi(String input) {
        char[] abjad = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
                'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ' };
        int[] code = { 1, 11, 111, 1111, 2, 22, 222, 2222, 3, 33, 333, 3333, 4, 44, 444, 4444, 5, 55, 555, 5555, 6, 66,
                666, 6666, 7, 77, 0};
        char[] arrayInputKalimat = input.toCharArray();
        int[] result = new int[arrayInputKalimat.length]; 
        for (int i = 0; i < arrayInputKalimat.length; i++) {
            for (int j = 0; j < abjad.length; j++) {
                if (arrayInputKalimat[i] == abjad[j] && arrayInputKalimat[i] != ' ') {
                    result[i] = code[j];
                }else if(arrayInputKalimat[i] == ' '){
                    result[i] = code[26];
                }
            }
        }
        return result;
    }

    private static int getSandiNumber(char c){

    }

    private static int getCount(char c){

    }
    private static String generateSandiString(int[] sandi){}
}
