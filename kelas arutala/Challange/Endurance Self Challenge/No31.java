import java.util.Scanner;
public class No31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long[] hargaBus = {2300000, 2000000, 1800000, 1500000, 1300000};
        int[] kursiBus = {60, 45, 32, 18, 12};
        long rekomendasiHargaBus;
        int inputKursi = Integer.parseInt(input.next());
        if(inputKursi > 60){
            rekomendasiHargaBus = hargaBus[0]*2;
            System.out.println(rekomendasiHargaBus);
        }else{
            long[] hargaBusTersedia = getHargaBus(kursiBus, hargaBus, inputKursi);
            rekomendasiHargaBus = getHargaBusTermurah(hargaBusTersedia);
            System.out.println(rekomendasiHargaBus);
        }
       

    }

    public static long[] getHargaBus(int[] kursiBus, long[] hargaBus, int inputKursi){
        long[] result;
        int index =0;
        for(int i = 0; i<kursiBus.length; i++){
            if(kursiBus[i] >= inputKursi){
                index++;
            }
        }
        result = new long[index];
        for(int i=0; i<hargaBus.length; i++){
            if(kursiBus[i] >= inputKursi){
                result[i] = hargaBus[i];
            }
        }
        return result;
    }

    public static long getHargaBusTermurah(long[] hargaBusTersedia){
        long result = 0;
        long MAX_LONG = Long.MAX_VALUE;
        for(int i =0; i <hargaBusTersedia.length; i++){
           if(hargaBusTersedia[i] <MAX_LONG){
                result = hargaBusTersedia[i];
           }
        }
        return result;
    }
    
}
