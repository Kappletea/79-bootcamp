import java.util.Scanner;

public class Satpam {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int nomor_kasus,banyak_kasus;
        nomor_kasus = key.nextInt();
        banyak_kasus = key.nextInt();
        if(nomor_kasus==1){
            if(banyak_kasus < 4){
                System.out.println("Serahkan KTP anda !!!");
            }else if(banyak_kasus >=4){
                System.out.println("Bayar Denda 10000 !!!");
            }
        }else if(nomor_kasus == 2){
            System.out.println("Ambil STNK dulu !!!");
        }else{
            System.out.println("nomor kasus tidak ada");
        }
    }
}
