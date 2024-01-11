import java.util.Scanner;

public class SandiPramuka {
    private static char previousChar = '\0';
    private static int count = 0;
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
        int[] result = new int[arrayInputKalimat.length];//array baru 3
        
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
    

    private static int getCount(char arrayInputKalimat){//4444,444
        if (arrayInputKalimat == previousChar) {
            // If the current character is the same as the previous one, increase the count
            count++;
        } else {
            // If the current character is different, reset the count to one
            count = 1;
        }

        // Update the previousChar for the next call
        previousChar = arrayInputKalimat;
        return count;
    }
    private static String generateSandiString(int[] sandi) {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i<sandi.length;i++){
            count = getCount((char)sandi[i]);
            if(count>1){
                result.append("-");
            }
            result.append(sandi[i]);
        }
        
        return result.toString();
    }
}
