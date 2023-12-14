import java.util.Scanner;
import interfaces.Phone;


public class MainApp {
    public static void main(String[] args) {
        //membuat object phone menggunakan instansiasi dari class xiaomi
        Phone redmiNote10 = new Xiaomi();

        //membuat object phoneuser
        PhoneUser pik = new PhoneUser(redmiNote10);

        //nyalakan dulu hp
        pik.turnOnThePhone();

        //membuat tampilan
        Scanner input = new Scanner(System.in);
        int aksi;
        boolean isLooping = true;

        do{
            System.out.println("++++Aplikasi interface++++");
            System.out.println("[1] nyalakan hp");
            System.out.println("[2] matikan hp");
            System.out.println("[3] perbesar volume");
            System.out.println("[4] perkecil volume");
            System.out.println("[0] keluar");
            System.out.println("++++++++++++++++++++++++++");

            System.out.println("Pilih aksi: ");
            aksi = input.nextInt();

            if (aksi == 1) {
                pik.turnOnThePhone();
            } else if (aksi == 2) {
                pik.turnOffThePhone();
            } else if (aksi == 3) {
                pik.makePhoneLouder();
            } else if (aksi == 4) {
                pik.makePhoneSilent();
            } else if (aksi == 0) {
                isLooping = false;
            } else {
                System.out.println("aksi yang dipilih tidak tersedia");
                System.out.println("silahkan pilih aksi kembali!");
            }
        } while(isLooping);

        }

    }

