import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        double finalPrice,diskon,total_diskon;
        int total_barang, jumlah_barang,harga_barang;
        harga_barang = key.nextInt();
        jumlah_barang = key.nextInt();
        if (jumlah_barang % 3 == 0 && jumlah_barang % 4 == 0) {
            total_barang = harga_barang*jumlah_barang;
            diskon = (double)15/100;
            total_diskon = total_barang*diskon;
            finalPrice = total_barang-total_diskon;
            String hasil = String.format("%.2f", finalPrice);
            System.out.println(hasil);
        }else{
            finalPrice = harga_barang*jumlah_barang;
            String hasil = String.format("%.2f", finalPrice);
            System.out.println(hasil);
        }
    }
}
