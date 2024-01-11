import java.util.Scanner;
public class GajiKaryawan {
    public static void main(String[] args) {
        //data
           
            //lokasi divisi
            String[] arrlokasiDivisi = {"Surabaya", "Jakarta" ,"Bandung", "Medan", "Makassar"};
            // gajiPokok 
            long[][] arrGajiPokok = {{8000000, 9000000, 7500000, 7200000, 8500000},
                                    {7000000, 8000000, 6500000, 6200000, 7500000},
                                    {7500000, 8500000, 7000000, 6800000, 8000000},
                                    {10000000, 11000000, 9500000, 9200000, 10500000},
                                    {7500000, 8500000, 7000000, 6800000, 8000000}	
                                    };
            //tunjangan transportasi
            long[] arrTunjanganTransportasi= 
                                    {1000000, 1500000, 1200000, 1100000, 1300000};
                                    
        //jabatan
        String[] posisiJabatan={"Software Engineer", 
                                "Data Analyst", 
                                "UX Designer", 
                                "Project Manager", 
                                "QA Engineer"};
        

        //input
        Scanner key = new Scanner(System.in);
        String jabatanKaryawan =String.valueOf(key.nextLine());
        String lokasiDivisiKaryawan =String.valueOf(key.nextLine());
        key.close();
        cetakGaji(lokasiDivisiKaryawan, jabatanKaryawan, arrlokasiDivisi, arrGajiPokok, arrTunjanganTransportasi, posisiJabatan);
        
       

    }   

    //get index lokasiKaryawan
    public static int getLokasiDivisiKaryawan(String lokasiDivisiKaryawan, String[] lokasiDivisi){
        int result = 0;
        for(int i=0; i<lokasiDivisi.length;i++){
            if(lokasiDivisi[i].equalsIgnoreCase(lokasiDivisiKaryawan)){
                result=i;
            }
        }
        return result;
    }

    //get index posisi karyawan
    public static int getPosisiKaryawan(String posisiKaryawan, String[] posisiJabatan){
        int result = 0;
        for(int i=0; i<posisiJabatan.length;i++){
            if(posisiJabatan[i].equalsIgnoreCase(posisiKaryawan)){
                result=i;
            }
        }
        return result;
    }

    //get gaji pokok berdasarkan profil karyawan
    public static long getGajiPokok(int indexLokasiDivisiKaryawan, int indexJabatanKaryawan, long[][] arrGajiPokok){
        long result=0;
        result =arrGajiPokok[indexJabatanKaryawan][indexLokasiDivisiKaryawan];
        return result;
    }
    
    //get Tunjangan Transport
    public static long getTunjanganTransport(int indexLokasiDivisiKaryawan,long[] arrTunjanganTransportasi){
        long result;
        result = arrTunjanganTransportasi[indexLokasiDivisiKaryawan];
        return result;
    }

    // get tunjangan makan
    public static long hitungTunjanganMakan(long makanPerHari){
        long result;
        result = 50000*makanPerHari;
        return result;
    }
    //hitung tunjangan kesehatan
    public static double hitungTunjanganKesehatan(long gajiPokokKaryawan){
        double result;
        result = (2.0/100.0)*gajiPokokKaryawan;
        return result;
    }
    // hitung tunjangan BPJS
    public static double hitungPotonganBPJS(long gajiPokokKaryawan){
        double result;
        result = (3.0/100.0)*gajiPokokKaryawan;
        return result;
    }
    // hitung tunjangan PPH
    public static double hitungPotonganPPH(long gajiPokokKaryawan){
        double result;
        result = (5.0/100.0)*gajiPokokKaryawan;
        return result;
    }
    
    //hitung gaji bersih
    public static long hitungGajiBersih(long[] semuaTunjangan,double[] potonganKaryawan, long gajiPokokKaryawan){
        long result=gajiPokokKaryawan;
        
        for(int i=0; i <semuaTunjangan.length;i++){
            result = result+semuaTunjangan[i];
        }
        for(int i=0; i <potonganKaryawan.length;i++){
            result = (long)(result-potonganKaryawan[i]);
        }
    
        return result;
    }

    //format currency
    public static String formatCurrency(long totalGajiBersih){
        String formattedValue = String.format("%,.2f", (double)totalGajiBersih);
        return formattedValue;
    }

    public static void getArrayData(){
        
    }

    public static void cetakGaji(String lokasiDivisiKaryawan, String jabatanKaryawan, String[] arrlokasiDivisi, long[][] arrGajiPokok, long[] arrTunjanganTransportasi, String[] posisiJabatan){
        //ambil data
        int indexLokasiDivisiKaryawan = getLokasiDivisiKaryawan(lokasiDivisiKaryawan, arrlokasiDivisi);
        int indexJabatanKaryawan = getPosisiKaryawan(jabatanKaryawan, posisiJabatan);
        long gajiPokokKaryawan = getGajiPokok(indexLokasiDivisiKaryawan, indexJabatanKaryawan, arrGajiPokok);
        long tunjanganTransportasiKaryawan = getTunjanganTransport(indexLokasiDivisiKaryawan, arrTunjanganTransportasi);
        long tunjanganKesehatanKaryawan = (long)hitungTunjanganKesehatan(gajiPokokKaryawan);
        int makanPerHari = 22;
        long tunjanganMakanKaryawan = hitungTunjanganMakan(makanPerHari);
        long[] semuaTunjangan = {tunjanganTransportasiKaryawan, tunjanganKesehatanKaryawan, tunjanganMakanKaryawan};
        double potonganBPJSKaryawan = hitungPotonganBPJS(gajiPokokKaryawan);
        double potonganPPHKaryawan = hitungPotonganPPH(gajiPokokKaryawan);
        double[] potonganKaryawan = {potonganBPJSKaryawan,potonganPPHKaryawan};
        long totalGajiBersih = hitungGajiBersih(semuaTunjangan,potonganKaryawan, gajiPokokKaryawan);
        System.out.println(posisiJabatan[indexJabatanKaryawan]);
        System.out.println(arrlokasiDivisi[indexLokasiDivisiKaryawan]);
        System.out.println(makanPerHari + " hari");
        System.out.println(formatCurrency(totalGajiBersih));
    }
}
