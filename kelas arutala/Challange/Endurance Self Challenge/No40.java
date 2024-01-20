// Deskripsi Soal

// Parkir pada Mall Tujuh Sembilan dibagi menjadi Tiga Kategori:

// Mobil dikenakan tarif Rp5.000 untuk satu jam pertama dan Rp2.000 untuk setiap satu jam berikutnya.

// Motor dikenakan tarif Rp2.000 untuk satu jam pertama dan Rp1.000 untuk setiap satu jam berikutnya.

// Box dikenakan tarif Rp10.000 untuk satu jam pertama dan Rp.5.000 untuk setiap satu jam berikutnya.


// Biaya Parkir Maksimal untuk setiap kategori berbeda.

// Mobil, Biaya/Tarif maksimal adalah Rp25.000.

// Motor, Biaya/Tarif maksimal adalah Rp10.000.

// Box, Biaya/Tarif maksimal adalah Rp50.000


// Spesifikasi Input

// Baris pertama berisi angka 1 jika kendaraan yang parkir adalah mobil, angka 2 jika kendaraan yang parkir adalah motor, dan angka 3 jika kendaraan yang parkir adalah box.

// Baris kedua berisi bilangan bulat berupa lama waktu parkir dalam satuan jam (0 < lama parkir ≤ 24).


// Spesifikasi Output

// Satu baris berisi bilangan bulat berupa total biaya parkir yang harus dibayarkan dalam rupiah.

import java.util.Scanner;

public class No40 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int kendaraanUser= Integer.parseInt(key.next());
        int lamaParkir = Integer.parseInt(key.next());
        int tarifJamPertamaMobil = 5000;
        int tarifPerJamMobil = 2000;
        int biayaMaksMobil = 25000;
        int tarifJamPertamaMotor = 2000;
        int tarifPerJamMotor = 1000;
        int biayaMaksMotor = 10000;
        int tarifJamPertamaBox = 10000;
        int tarifPerJamBox = 5000;
        int biayaMaksBox = 10000;
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
                    
                    if(totalPembayaran >= biayaMaksMobil){
                        System.out.println(biayaMaksMobil);
                    }else{
                        System.out.println(totalPembayaran);
                    }
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
                if(totalPembayaran >= biayaMaksMotor){
                    System.out.println(biayaMaksMotor);
                }else{
                    System.out.println(totalPembayaran);
                }  
            }
                break;

                case 3:
                if(lamaParkir>0 && lamaParkir<=24){
                    if(lamaParkir==1){
                        totalPembayaran += tarifJamPertamaBox;
                    }else{
                        totalPembayaran = tarifPerJamBox*(lamaParkir-1);
                        totalPembayaran += tarifJamPertamaBox;
                    }     
                    if(totalPembayaran >= biayaMaksMobil){
                        System.out.println(biayaMaksBox);
                    }else{
                        System.out.println(totalPembayaran);
                    }
                }
                    break;
            default:
                break;
        }
       
    }
}
