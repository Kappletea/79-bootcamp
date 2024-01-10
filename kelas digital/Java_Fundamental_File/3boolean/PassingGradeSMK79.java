import java.util.Scanner;

public class PassingGradeSMK79 {
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        int math= 0;
        int bInd= 0;
        int bIng= 0;
        int iPa= 0;
        int total = 0;
        double passInd =73;
        double passIng =73;
        double passMath =80;
        double average = 73;
        boolean syarat1;
        boolean syarat2;
        boolean syarat3;

        System.out.println("Masukan nilai ujian Matematika");
        math = keyboard.nextInt();
        syarat1 = math > passMath;
        System.out.println("Masukan nilai ujian Bhs.Indonesia");
        bInd = keyboard.nextInt();
        System.out.println("Masukan nilai ujian Bhs.Inggris");
        bIng = keyboard.nextInt();
        syarat2 = bInd > passInd && bIng > passIng;

        System.out.println("Masukan nilai ujian IPA");
        iPa = keyboard.nextInt();

        total = math + bInd + bIng + iPa/4;
        syarat3 = total>=average;
        
        System.out.println("Hasil dari Simulasi untuk Persyaratan penerimaan Calon Siswa di SMK Padepokan 79 adalah sebagai berikut:");
        System.out.println("Apakah anda memenuhi syarat untuk masuk ke SMK Padepokan 79: " + syarat3);
        System.out.println("Apakah anda memenuhi syarat untuk masuk ke jurusan sastra: " + syarat2);
        System.out.println("Apakah anda memenuhi syarat untuk masuk jurusan Teknik Komputer Jaringan: " + syarat1);
        
    }
}
