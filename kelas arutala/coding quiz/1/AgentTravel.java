import java.util.Scanner;

public class AgentTravel{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahPenumpang = Integer.valueOf(input.next());
        int[] kapasitasBus = {60, 45, 32, 18,12};
        int[] hargaKapasitasBus = {2300000, 2000000, 1800000, 1500000, 1300000};
        int hargaBusTermurah;
        
        if (cekInputUser(jumlahPenumpang) == 0) {
            System.out.println("Invalid Input");
        }else{
            kapasitasBus = cekKapasitasBus(kapasitasBus, jumlahPenumpang);
            hargaKapasitasBus= cekHargaKapasitas(kapasitasBus, hargaKapasitasBus,jumlahPenumpang);
            hargaBusTermurah= cekHargaTermurah(hargaKapasitasBus);
            System.out.println(hargaBusTermurah);
        }
    }

    public static int cekInputUser(int jumlahPenumpang){
        if(jumlahPenumpang>0 && jumlahPenumpang<=120){
            return jumlahPenumpang;
        }else{
            return 0;
        }
    }
    
    public static int[] cekKapasitasBus(int[] kapasitasBus, int jumlahPenumpang){
        int countKapasitas=0;
        for(int i = 0; i<kapasitasBus.length; i++){
            if (kapasitasBus[i]>=jumlahPenumpang) {
                countKapasitas++;
            }
        }

        int[] listKapasitasTersedia= new int[countKapasitas];
        for(int i = 0 ; i<kapasitasBus.length;i++){
            if(kapasitasBus[i] >= jumlahPenumpang){
                listKapasitasTersedia[i] = kapasitasBus[i];
            }
        }
        return listKapasitasTersedia;
    } 

    public static int[] cekHargaKapasitas(int[] kapasitasBus, int[] hargaKapasitasBus, int jumlahPenumpang){
        int countKapasitas=0;
        for(int i = 0; i<kapasitasBus.length; i++){
            if (kapasitasBus[i]>=jumlahPenumpang) {
                countKapasitas++;
            }
        }

        int[] listKapasitasTersedia= new int[countKapasitas];
        int[] listHargaTersedia= new int[countKapasitas];
        for(int i = 0 ; i<kapasitasBus.length;i++){
            if(kapasitasBus[i] >= jumlahPenumpang){
                listKapasitasTersedia[i] = kapasitasBus[i];
            }
        }
        for(int i=0; i<listKapasitasTersedia.length; i++){
            listHargaTersedia[i] = hargaKapasitasBus[i];    
        }

        return listHargaTersedia;
    }

    public static int cekHargaTermurah(int[] hargaKapasitasBus){
        if(hargaKapasitasBus.length == 0){
            throw new IllegalArgumentException("Array is empty");
        }
        int hargaTermurah=hargaKapasitasBus[0];
        for(int i = 0; i<hargaKapasitasBus.length;i++){
            if(hargaKapasitasBus[i] < hargaTermurah){
                hargaTermurah = hargaKapasitasBus[i];
            }
        }
        return hargaTermurah;
    }


}