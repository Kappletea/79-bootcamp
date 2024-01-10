import java.util.Scanner;

public class BiayaParkir {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int Kendaraan, lamaParkir,tarifJPBIL, tarifJPTOR, tarif1,tarif2,total;
        Kendaraan = key.nextInt();
        lamaParkir = key.nextInt();
        tarifJPBIL= 2000;
        tarifJPTOR= 1000;
        tarif1 = 1000;
        tarif2 = 500;
        total = 0;
        if (Kendaraan == 1) {
            if (lamaParkir > 0 && lamaParkir <= 24) {
                if(lamaParkir==1){
                    System.out.println(tarifJPBIL);
                }else{
                    lamaParkir = lamaParkir-1;
                    total = tarifJPBIL + (tarif1*lamaParkir);
                    System.out.println(total);
                }
            }
        } else if (Kendaraan == 2) {
            if (lamaParkir > 0 && lamaParkir <= 24) {
                if(lamaParkir==1){
                    System.out.println(1000);
                }else{
                    lamaParkir = lamaParkir-1;
                    total = tarifJPTOR+(tarif2*lamaParkir);
                    System.out.println(total);
                }
            }
        } else {
            System.out.println("kendaraan tidak tercantum");
        }
    }
}
