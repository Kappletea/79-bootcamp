import java.util.Scanner;

/*
*Created By: Rofiq Muhammad Syauqi
*Created At: 13/01/2024 
*/
public class SalarySMS {
    public static void main(String[] args) {
        // deklarasi
        Scanner inputUser = new Scanner(System.in);
        String namaKaryawan, jabatanKaryawan, penempatanKaryawan, tingkatanKaryawan, statusKawinKaryawan;
        int masaKerjaKaryawan, jumlahAnakKaryawan, indexPenempatanKaryawan, indexJabatanKaryawan, indexTingkatanKaryawan;
        // data
        String[] arrJabatan = { "Programmer", "Tester", "Scrum Master", "HRD" };
            String[] arrPenempatan = { "Bandung", "Garut", "Jakarta", "Bekasi", "Bogor", "Karawang" };
            long[] arrUMK=           {3800000, 2000000, 4500000, 4800000, 4300000, 5000000};
        String[] arrTingkatan= {"Intern","Junior", "Middle", "Senior"};

        // debuggin function
        // jabatanKaryawan = inputUser.nextLine();
        // String is= isPosisiExist(jabatanKaryawan, arrJabatan);
        // System.out.println(is);
        // System.out.println(arrTingkatan[indexTingkatanKaryawan]);
        
        //inisialisasi 
        indexJabatanKaryawan = 0;
        indexPenempatanKaryawan = 0;
        indexTingkatanKaryawan = 0;
        
        // input user
        boolean isInvalidInput = true;

// input nama

        // do {
        //     System.out.print("Masukkan Nama Karyawan: ");
        //     namaKaryawan = inputUser.nextLine();
        //     if(!isString(namaKaryawan)){
        //         System.out.println("Input Harus Berupa Huruf!");
        //     }else if(!isMinLength(namaKaryawan)){
        //         System.out.println("Input Harus Lebih Dari 2!");
        //     }else{
        //         isInvalidInput = false;
        //     }
        // } while (isInvalidInput);

// input jabatan

        // do {
        //     isInvalidInput = true;
        //     System.out.print("Masukkan Jabatan Karyawan: ");
        //     jabatanKaryawan = inputUser.nextLine();
        //     if(!isString(jabatanKaryawan)){
        //         System.out.println("Input Harus Berupa Huruf!");
        //     }else if(!isMinLength(jabatanKaryawan)){
        //         System.out.println("Input Harus Lebih Dari 2!");
        //     }else if(!isDataExist(jabatanKaryawan, arrJabatan)){
        //         System.out.println("Jabatan Tersebut Tidak Tercantum!");
        //     }else{
        //         isInvalidInput = false;
        //         indexJabatanKaryawan = getArrayIndex(jabatanKaryawan, arrJabatan);
        //     }
        // } while (isInvalidInput);

// input divisi
      
        // do {
        //     isInvalidInput = true;
        //     System.out.print("Masukkan Penempatan Karyawan: ");
        //     penempatanKaryawan = inputUser.nextLine();
        //     if(!isString(penempatanKaryawan)){
        //         System.out.println("Input Harus Berupa Huruf!");
        //     }else if(isMinLength(penempatanKaryawan)){
        //         System.out.println("Input Harus Lebih Dari 2!");
        //     }else if(isDataExist(penempatanKaryawan, arrPenempatan)){
        //         System.out.println("Divisi Tersebut Tidak Tercantum!");
        //     }else{
        //         isInvalidInput = false;
        //         indexPenempatanKaryawan = getArrayIndex(penempatanKaryawan, arrPenempatan);
        //     }
        // } while (isInvalidInput);

//input tingkatan karyawan:

       

        // do {
        //     isInvalidInput = true;
        //     System.out.print("Masukkan Tingkatan Karyawan: ");
        //     tingkatanKaryawan = inputUser.nextLine();
        //     if(!isString(tingkatanKaryawan)){
        //         System.out.println("Input Harus Berupa Huruf!");
        //     }else if(!isMinLength(tingkatanKaryawan)){
        //         System.out.println("Input Harus Lebih Dari 2!");
        //     }else if(!isDataExist(tingkatanKaryawan, arrTingkatan)){
        //         System.out.println("Tingkatan Tersebut Tidak Tercantum di Posisi " + jabatanKaryawan);
        //     }else if(jabatanKaryawan.equalsIgnoreCase("Programmer") || jabatanKaryawan.equalsIgnoreCase("Tester") || jabatanKaryawan.equalsIgnoreCase("Scrum Master")){
        //         if(tingkatanKaryawan.equals("Intern")){
        //             System.out.println("Tingkatan Intern Tidak Termasuk Di Jabatan "+ jabatanKaryawan);
        //         }else{
        //             indexTingkatanKaryawan = getArrayIndex(tingkatanKaryawan, arrTingkatan);
        //             isInvalidInput= false;
        //         }
        //     }else{
        //         indexTingkatanKaryawan = getArrayIndex(tingkatanKaryawan, arrTingkatan);
        //         isInvalidInput= false;
        //     }
        // } while (isInvalidInput);

        // System.out.println(arrTingkatan[indexTingkatanKaryawan]);
        
        System.out.println("Masukkan Masa Kerja Karyawan: ");
        masaKerjaKaryawan = inputUser.nextInt();
        System.out.println(isNumber(masaKerjaKaryawan));
        
        
        // inputUser.nextLine();
        // System.out.println("Masukkan Status Kawin Karyawan: ");
        // statusKawinKaryawan = inputUser.nextLine();
        // System.out.println("Masukkan Jumlah Anak Karyawan: ");
        // jumlahAnakKaryawan = inputUser.nextInt();
        // inputUser.close();

    }

    // validate function
    public static boolean isString(String name) {
        if (name.contains(" ") || (isAlpabet(name))) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isAlpabet(String inputUser) {
        return inputUser.matches("[a-zA-Z]+");
    }

    public static boolean isNumber(int inputUser) {
        String inputString = Integer.toString(inputUser);
        return inputString.matches("[0-9]+");
    }

    public static boolean isMinLength(String inputUser) {
        char[] input = inputUser.toCharArray();
        if (input.length > 2) {
            return true;
        } else {
            return false;
        }
    }

    public static Boolean isDataExist(String inputUser, String[] arrData) {
        for (int i = 0; i < arrData.length; i++) {
            if (inputUser.equalsIgnoreCase(arrData[i])) {
                return true;
            }
        }
        return false;
    }

    

    //get index array
    public static int getArrayIndex(String inputUser, String[] arrData){
        int result = 0;
        for(int i=0; i<arrData.length;i++){
            if(inputUser.equalsIgnoreCase(arrData[i])){
                result=i;
            }
        }
        return result;
    }
}
