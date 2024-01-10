import java.util.Scanner;

public class cekTankiBensin {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int bayar;
        String hasil;
        double kapasitasKendaraan, totalLiter;
        bayar = key.nextInt();
        kapasitasKendaraan = key.nextDouble();
        totalLiter = (double) 15000 / 7600;
       if(kapasitasKendaraan>totalLiter){

        if(totalLiter>kapasitasKendaraan){
        hasil = String.format("%.2f", totalLiter);
        System.out.println(hasil);
        System.out.println("Bensin Berlebih");
       }else{
        hasil = String.format("%.2f", totalLiter);
        System.out.println(hasil);
       }
       }
    }
}
