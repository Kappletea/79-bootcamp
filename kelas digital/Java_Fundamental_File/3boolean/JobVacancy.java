import java.util.Scanner;

public class JobVacancy {

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String nama, jenisKelamin, lulusan;
        int umur, pengalaman;
        double penampilan;
        boolean koor1, koor2,admin1, admin2,criteria1,criteria2;

        System.out.println("Masukkan Nama Anda: ");
        nama = keyboard.next();
        
        System.out.println("Masukkan Umur Anda: ");
        umur = keyboard.nextInt();

        System.out.println("Masukkan Jenis Kelamin Anda(Pria/Wanita): ");
        jenisKelamin = keyboard.next();

        System.out.println("Masukkan Riwayat Pendidikan Anda(SMA/SMK/D3/S1)(Huruf Kapital): ");
        lulusan = keyboard.next();

        System.out.println("Masukkan Pengalaman Kerja Anda (Tahun): ");
        pengalaman = keyboard.nextInt();

        System.out.println("Menurut anda dari skala 1-10, seberapa menarik penampilan anda? ");
        penampilan = keyboard.nextFloat();

        koor1 =jenisKelamin.equalsIgnoreCase("Pria") && umur>=21 && umur <=30 && (lulusan.equalsIgnoreCase("SMK")||lulusan.equalsIgnoreCase("D3")) && pengalaman>=2;
        
        koor2 = jenisKelamin.equalsIgnoreCase("Pria") && umur>30 && lulusan.equalsIgnoreCase("S1") && pengalaman >=5;

        admin1 = jenisKelamin.equalsIgnoreCase("Wanita") && umur>=20 && umur<=25 && lulusan.equalsIgnoreCase("D3") && penampilan>=7 && pengalaman>=1 ;

        admin2 = jenisKelamin.equalsIgnoreCase("Wanita") && umur>25 && lulusan.equalsIgnoreCase("S1") && penampilan>=7 && pengalaman>=5 ;
       
        

        criteria1 = koor1||koor2;
        criteria2 = admin1||admin2;
       
        System.out.println(nama + ", terima kasih sudah mengikuti lowongan kerja di PT. Secret Semut.");
        System.out.println("Berikut Hasil Dari Rekrutmen: ");
        System.out.println("Hasil Kelulusan untuk Koordinator: " + criteria1);
        System.out.println("Hasil Kelulusan untuk Admin: "+ criteria2);

    }
}