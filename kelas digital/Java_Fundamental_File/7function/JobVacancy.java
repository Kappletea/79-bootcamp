import java.util.Scanner;



public class JobVacancy {

    public static boolean Koordinator(String jenisKelamin, String lulusan, int umur, int pengalaman){
      boolean syarat1,syarat2;
      syarat1 = jenisKelamin.equalsIgnoreCase("pria") && (umur >=21 && umur <=30) && (lulusan.equalsIgnoreCase("SMK") || lulusan.equalsIgnoreCase("D3")) && pengalaman >=2;
      syarat2= jenisKelamin.equalsIgnoreCase("Pria") && umur >= 30 && lulusan.equalsIgnoreCase("S1") && pengalaman >=5;
      if(syarat1 || syarat2){
        return true;
      }else{
        return false;
      }
    }
    public static boolean Admin(String jenisKelamin, String lulusan, int umur, float penampilan, int pengalaman){
        boolean syarat1,syarat2, syarat3;
        syarat1 = jenisKelamin.equalsIgnoreCase("Wanita") && (umur >=20 && umur <=25) && lulusan.equalsIgnoreCase("D3") && (penampilan>=8.5||pengalaman>=1);
        syarat2= jenisKelamin.equalsIgnoreCase("Wanita") && umur >=25 && lulusan.equalsIgnoreCase("S1") && penampilan>=8.5 && pengalaman>=3;
        syarat3= jenisKelamin.equalsIgnoreCase("Pria") && (umur >=20 && umur <=30) && (lulusan.equalsIgnoreCase("D3")||lulusan.equalsIgnoreCase("S1")) && penampilan>=8.5 && pengalaman>=2;
        if(syarat1 || syarat2 || syarat3){
          return true;
        }else{
          return false;
        }
    }
    public static boolean SPV(String jenisKelamin, String lulusan, int umur, int pengalaman){
        boolean syarat1,syarat2;
        syarat1= (jenisKelamin.equalsIgnoreCase("Wanita") || jenisKelamin.equalsIgnoreCase("Pria")) && (umur >=23 && umur <=30) && lulusan.equalsIgnoreCase("S1") && pengalaman>1;
        syarat2= (jenisKelamin.equalsIgnoreCase("Wanita") || jenisKelamin.equalsIgnoreCase("Pria")) && (umur >=25 && umur <= 35) && lulusan.equalsIgnoreCase("D3") && pengalaman>4;
        
        if(syarat1 || syarat2){
          return true;
        }else{
          return false;
        }
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String nama, jenisKelamin, lulusan, posisi;
        int umur, pengalaman;
        float penampilan;

        System.out.println("Masukkan Nama Anda: ");
        nama = keyboard.next();
        System.out.println("Masukkan umur anda: ");
        umur = keyboard.nextInt();
        System.out.println("Masukkan jenis kelamin anda(Pria/Wanita): ");
        jenisKelamin = keyboard.next();
        System.out.println("Masukkan lulusan: ");
        lulusan = keyboard.next();
        System.out.println("Masukkan pengalaman: ");
        pengalaman = keyboard.nextInt();
        System.out.println("Masukkan penampilan: ");
        penampilan = keyboard.nextInt();
        System.out.println("Masukkan posisi yang akan dilamar(SPV, Admin, Koordinator): ");
        posisi = keyboard.next();


        if (Koordinator(jenisKelamin, lulusan, umur, pengalaman)|| Admin(jenisKelamin, lulusan, umur, penampilan, pengalaman) || SPV(jenisKelamin, lulusan, umur, pengalaman)) {
                System.out.println("Berikut Hasil dari Rekrutmen:");
                System.out.println("Selamat " + nama);
                System.out.println("Anda memenuhi syarat kerja pada " +posisi+ " " + nama);
        } else{
          System.out.println("maaf persyaratan anda tidak terpenuhi");
        }
    }
}

