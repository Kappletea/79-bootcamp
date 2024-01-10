import java.util.Scanner;
public class BiayaSetelahBunga {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        double BiayaAwal,Bunga,Total;
        BiayaAwal = key.nextDouble();
        Bunga = key.nextDouble();
        Total = BiayaAwal + (BiayaAwal * Bunga / 100);
        if(BiayaAwal>0 && BiayaAwal <150000){
            String hasil = String.format("%.2f", Total);
            System.out.println(hasil);
        }else{
            System.out.println("biaya awal harus angka positif");
        }
    }
}
