//Biaya Parkir
//Buatlah sebuah program untuk menghitung total biaya parkir motor atau mobil dengan ketentuan berikut:

// Mobil dikenakan tarif Rp2.000 untuk satu jam pertama dan Rp1.000 untuk setiap satu jam berikutnya;
// Motor dikenakan tarif Rp1.000 untuk satu jam pertama dan Rp5.00 untuk setiap satu jam berikutnya.


import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int[] arrKendaraan = {1,2};
        String[] kendaraan = {"Mobil", "Motor"};
        int kendaraanUser= Integer.parseInt(key.next());
        int lamaParkir = Integer.parseInt(key.next());
        int tarifJamPertamaMobil = 2000;
        int tarifPerJamMobil = 1000;
        int tarifJamPertamaMotor = 1000;
        int tarifPerJamMotor = 500;
        int totalPembayaran = 0;

        switch (kendaraanUser) {
            case 1:
                if(lamaParkir>0 && lamaParkir<=24){
                    if(lamaParkir==1){
                        totalPembayaran += tarifJamPertamaMobil;
                    }else{
                        totalPembayaran = tarifPerJamMobil*(lamaParkir-1);
                        totalPembayaran += tarifJamPertamaMobil;
                    }       
                    System.out.println(totalPembayaran);
                }
                break;
            case 2:
            if(lamaParkir>0 && lamaParkir<=24){
                if(lamaParkir==1){
                    totalPembayaran += tarifJamPertamaMotor;
                }else{
                    totalPembayaran = tarifPerJamMotor*(lamaParkir-1);
                    totalPembayaran += tarifJamPertamaMotor;
                }     
                System.out.println(totalPembayaran);  
            }
                break;
            default:
                break;
        }
       
    }
}
