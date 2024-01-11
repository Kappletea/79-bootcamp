import java.util.Scanner;

public class SistemBaru {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String inputKalimat = key.nextLine();

        char[] hasil= hapusSpasi(inputKalimat);
        String hasilHapusSpasi ="";
        for(char h:hasil){
            hasilHapusSpasi += h;
        }
        System.out.println(hasilHapusSpasi);
        System.out.println(isPalindrom(hasilHapusSpasi));
        System.out.println(hitungJumlahHuruf(hasilHapusSpasi));
        if(isPalindrom(hasilHapusSpasi)){
            System.out.println("Silahkan Masuk");
        }else{
            System.out.println("Akses Ditolak");
        }
        
    }

    public static char[] hapusSpasi(String inputKalimat){
        char[] arrayKalimat= inputKalimat.toCharArray();
        int ukuranArrayBaru=0;
        for(int i=0; i<arrayKalimat.length;i++){
            if(arrayKalimat[i]!=' '){
                ukuranArrayBaru++;
            }
        }
        
        char[] resultArray = new char[ukuranArrayBaru];
        int index = 0;
        for(int j=0; j<arrayKalimat.length;j++){
            if(arrayKalimat[j] != ' '){
                resultArray[index++]= arrayKalimat[j];
            }
        }

        return resultArray;
    }

    public static boolean isPalindrom(String hasilKalimat){
        String reversedString = new StringBuilder(hasilKalimat).reverse().toString();
        return hasilKalimat.equalsIgnoreCase(reversedString);
    }

    public static int hitungJumlahHuruf(String inputKalimat){
        char[] arrayKalimat= inputKalimat.toCharArray();
        return arrayKalimat.length;
    }
}
