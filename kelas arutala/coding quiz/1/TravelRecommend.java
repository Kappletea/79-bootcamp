import java.util.Scanner;

public class TravelRecommend {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int jumlahOrang, lamaMenginap;
        long budget;
        String[] destinasiTravel = { "Lombok", "Bangkok", "Singapura", "Tokyo" };
        long[] transportationFee = { 2170000, 3780000, 1200000, 4760000 };
        long[] hotelFee = { 125000, 155000, 170000, 170000 };
        long[] culinaryFee = { 75000, 55000, 85000, 105000 };
        long[] rekreasiFee = { 250000, 300000, 360000, 325000 };

        jumlahOrang = key.nextInt();
        lamaMenginap = key.nextInt();
        budget = key.nextLong();

        // hitung total fee per destinasi (include per malam per orang)
        // CONTOH:
        // 3420000
        // 5130000
        // 2835000
        // 6460000
        long[] listTotalFeePerDestinasi = menghitungTotalFeePerDestinasi(transportationFee, hotelFee, culinaryFee,
                rekreasiFee, jumlahOrang, lamaMenginap);

        //validasi apakah budget mencukupi
        for (int i = 0; i < listTotalFeePerDestinasi.length; i++) {
            if (budget < listTotalFeePerDestinasi[i]) {
                System.out.println("Need more budget");
                break;
            } else {

                // cari total fee destinasi yang closest bersama budget (menggunakan selisih)
                // contoh :
                // 3080000
                // 1370000
                // 3665000
                // 40000
                long[] listBudgetTerdekat = menghitungDestinasiTerdekatDenganBudget(listTotalFeePerDestinasi, budget);
               
                // cari nilai selisih terkecil lalu cari index nya
                // dari contoh di atas kalau dengan mata bisa terlihat bahwa nilai yang paling
                // terkecil adalah index ke 3
                int indexSelisihTerkecil = cariIndeksSelisihTerkecil(listBudgetTerdekat);
                // samakan index selisih dengan index destinasi
                System.out.print(destinasiTravel[indexSelisihTerkecil]);
                System.out.println(" " + listTotalFeePerDestinasi[indexSelisihTerkecil]);
                break;
            }
        }

    }

    public static long[] menghitungTotalFeePerDestinasi(long[] transportationFee, long[] hotelFee, long[] culinaryFee,
        long[] rekreasiFee, int jumlahOrang, int lamaMenginap) {
        long[] result = new long[4];
        for (int i = 0; i < transportationFee.length; i++) {
            result[i] = (transportationFee[i] + ((hotelFee[i] + culinaryFee[i]) * lamaMenginap) + rekreasiFee[i])
                    * jumlahOrang;
        }
        return result;
    }

    public static long[] menghitungDestinasiTerdekatDenganBudget(long[] totalFeePerDestinasi, long budget) {
        long[] hitungResult = new long[4];
        for (int i = 0; i < totalFeePerDestinasi.length; i++) {
            hitungResult[i] = Math.abs(totalFeePerDestinasi[i] - budget);
        }
        return hitungResult;
    }

    public static int cariIndeksSelisihTerkecil(long[] listBudgetTerdekat) {
        int indeksSelisihTerkecil = -1;
        long selisihTerkecil = Long.MAX_VALUE;

        for (int i = 0; i < listBudgetTerdekat.length; i++) {
            if (listBudgetTerdekat[i] < selisihTerkecil) {
                selisihTerkecil = listBudgetTerdekat[i];
                indeksSelisihTerkecil = i;
            }
        }
        return indeksSelisihTerkecil;
    }

}
