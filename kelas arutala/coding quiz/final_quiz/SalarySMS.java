import java.util.Scanner;
/*
*Created By: Rofiq Muhammad Syauqi
*Created At: 13/01/2024 
*/
public class SalarySMS {
    public static void main(String[] args) {
        //deklarasi
        Scanner inputUser = new Scanner(System.in);
        String namaKaryawan, posisiKaryawan, penempatanKaryawan, tingkatanKaryawan, statusKawinKaryawan;
        int masaKerjaKaryawan, jumlahAnakKaryawan;

        //input user
        boolean isLoop = true;
        do{
            System.out.println("Masukkan Nama Karyawan: ");
            namaKaryawan = inputUser.nextLine();
            isLoop = validateName(namaKaryawan);

        }while(isLoop);
        // System.out.println("Masukkan Posisi Karyawan: ");
        // posisiKaryawan = inputUser.nextLine();
        // System.out.println("Masukkan Penempatan Karyawan: ");
        // penempatanKaryawan = inputUser.nextLine();
        // System.out.println("Masukkan Tingkatan Karyawan: ");
        // tingkatanKaryawan = inputUser.nextLine();
        // System.out.println("Masukkan Masa Kerja Karyawan: ");
        // masaKerjaKaryawan = inputUser.nextInt();
        // inputUser.nextLine();
        // System.out.println("Masukkan Status Kawin Karyawan: ");
        // statusKawinKaryawan = inputUser.nextLine();
        // System.out.println("Masukkan Jumlah Anak Karyawan: ");
        // jumlahAnakKaryawan = inputUser.nextInt();
        // inputUser.close();

    }

    //validate function
    public static boolean validateName(String name){
        if(name.contains(" ") || (hasAlpabet(name) && isMinLength(name)) ){
            return false;
        }else{
            System.out.println("Invalid Name");
            return true;
        }
    }
    public static boolean hasAlpabet(String inputUser){
        return inputUser.matches("[a-zA-Z]+");
    }
    public static boolean isMinLength(String inputUser){
        char[] input = inputUser.toCharArray();
        if(input.length>2){
            return true;
        }else{
            return false;
        }
    }
}
