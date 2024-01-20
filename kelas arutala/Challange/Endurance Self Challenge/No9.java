//Biaya Parkir
// Buatlah sebuah program untuk menghitung total biaya parkir motor atau mobil dengan ketentuan berikut:

// Mobil dikenakan tarif Rp2.000 untuk satu jam pertama dan Rp1.000 untuk setiap satu jam berikutnya;
// Motor dikenakan tarif Rp1.000 untuk satu jam pertama dan Rp5.00 untuk setiap satu jam berikutnya.

//input 
//Baris pertama berisi angka 1 jika kendaraan yang parkir adalah mobil, atau angka 2 jika kendaraan yang parkir adalah motor.
// Baris kedua berisi bilangan bulat berupa lama waktu parkir dalam satuan jam (0 < lama parkir ≤ 24).

// output
// Satu baris berisi bilangan bulat berupa total biaya parkir yang harus dibayarkan dalam rupiah.


import java.util.Scanner;
public class No9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arrKendaraan = {1,2};
        String[] kendaraan = {"Mobil", "Motor"};
        int kendaraanUser= Integer.parseInt(input.next());
        int lamaParkir = Integer.parseInt(input.next());
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
