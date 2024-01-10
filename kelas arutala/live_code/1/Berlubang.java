import java.util.Scanner;

public class Berlubang {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String karakter = key.nextLine();
        int jumlahLubang=0;
        char[] array = karakter.toCharArray();
        for(int i = 0; i<array.length; i++){
            if(array[i] == 'A' || array[i] == 'D' || array[i] == 'O' || array[i] == 'P' || array[i] == 'R' ||array[i] == 'Q' || array[i]=='B'){
                if(array[i] == 'B'){
                    jumlahLubang = jumlahLubang+1;
                }
                jumlahLubang = jumlahLubang+1;
            }else if (array[i]=='a' || array[i]=='b' || array[i]=='e' || array[i]=='o' || array[i]=='p' || array[i]=='q' || array[i] =='g'){
                if(array[i] == 'g'){
                    jumlahLubang = jumlahLubang+1;
                }else{
                    jumlahLubang = jumlahLubang+1;
                }
            }
        }
        System.out.println(jumlahLubang);
    }
}
