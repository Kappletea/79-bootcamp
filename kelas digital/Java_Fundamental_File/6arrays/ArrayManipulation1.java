import java.util.Scanner;

public class ArrayManipulation1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int cari, jumlah = 0;
        boolean ada = false;
        int bilangan[] = { 3, 2, 5, 11, 7, 10, 11, 3, 15, 11, 17, 10, 5 };

        System.out.print("masukkan angka yang anda cari: ");
        cari = keyboard.nextInt();
        for (int i = 0; i < bilangan.length; i++) {
            if (cari == bilangan[i]) {
                ada = true;
                jumlah++;
            }
        }
        if (ada == true) {
            System.out.println("Angka " + cari + " yang anda cari ditemukan didalam array bilangan");
            System.out.println("ada " + jumlah + " angka " + cari + " didalam array bilangan");
            System.out.println("yaitu pada index ke: ");
            for(int i = 0; i<bilangan.length;i++){
                if(cari == bilangan[i]){
                    System.out.print(i+ " ");
                }
            }
        }else{
            System.out.println("angka yang anda cari: " + cari+ " tidak ditemukan didalam array");
        }
    }
}
