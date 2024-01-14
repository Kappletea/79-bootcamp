import java.util.InputMismatchException;
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
        String[] arrStatusKawin = {"Kawin", "Belum Kawin", "Cerai"};
        int[][][] arrRatesGaji = {
            {//programmer
             {120,150,170},
             {120,150,170},
             {120,150,170},
             {140,160,170},
             {140,160,200},
             {140,160,200},
             {142,162,202},
             {144,164,204},
             {146,166,206},
             {148,168,208},
             {150,170,210}
            }, 
            {//tester
                {100,130,150},
                {100,130,150},
                {100,130,150},
                {120,140,150},
                {120,140,160},
                {120,140,160},
                {122,142,162},
                {124,144,164},
                {126,146,166},
                {128,148,168},
                {130,150,170}
            }, 
            {//scrum master
             {130,160,180},
             {130,160,180},
             {130,160,180},
             {150,175,180},
             {150,175,200},
             {150,175,200},
             {152,176,202},
             {154,177,204},
             {156,178,206},
             {158,179,208},
             {160,180,210}
            }, 
            {//hrd
                {80,100,120,140},
                {80,100,120,140},
                {80,100,120,140},
                {80,100,130,150},
                {80,100,130,150},
                {80,110,130,150},
                {100,110,130,150},
                {100,112,132,152},
                {100,114,134,154},
                {100,116,136,156},
                {100,118,138,158}
            },         
        };
        int jbtnPro = 0;
        int masKerpro = 1;
        int  

        System.out.println(arrRatesGaji[0][1][0]);


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
        //     }else if(!isMinLengthString(namaKaryawan)){
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
        //     }else if(isMinLengthString(penempatanKaryawan)){
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
        //     }else if(!isMinLengthString(tingkatanKaryawan)){
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
        // isInvalidInput=true;
        // do {
        //     System.out.println("Masukkan Masa Kerja Karyawan: ");
        //     try {
        //         if (inputUser.hasNextInt()) {
        //             masaKerjaKaryawan = inputUser.nextInt();

        //             if (!isNumber(masaKerjaKaryawan)) {
        //                 System.out.println("Input Harus Berupa angka");
        //             } else if (!isMinLengthInteger(masaKerjaKaryawan)) {
        //                 System.out.println("Input tidak boleh lebih dari 30 dan kurang dari 0");
        //             } else {
        //                 isInvalidInput = false;
        //             }
        //         } else {
        //             System.out.println("Input Harus Angka");
        //             inputUser.next();
        //         }

        //     } catch (InputMismatchException e) {
        //         System.out.println("Input Harus angka");
        //         inputUser.next();
        //     }
        // } while (isInvalidInput);
        
        
        
        
        // isInvalidInput = true;
        // do{
        //     System.out.println("Masukkan Status Kawin Karyawan: ");
        //     statusKawinKaryawan = inputUser.nextLine();
        //     if(!isString(statusKawinKaryawan)){
        //         System.out.println("Input Harus Huruf");
        //     }else if(!isMinLengthString(statusKawinKaryawan)){
        //         System.out.println("Input Harus Lebih Dari 2 Huruf");
        //     }else if(!isDataExist(statusKawinKaryawan, arrStatusKawin)){
        //         System.out.println("Status Yang Anda Sebutkan Tidak Tercantum");
        //         System.out.println("Status Yang Harus Di isi adalah:");
        //         for(int i=0; i<arrStatusKawin.length; i++){
        //             System.out.println(arrStatusKawin[i]);
        //         }
        //     }else {
        //         isInvalidInput = false;
        //     }
        // }while(isInvalidInput);

        // isInvalidInput = true;
        // do{
        //     System.out.println("Masukkan Jumlah Anak Karyawan: ");
        //     try{
        //         if(inputUser.hasNextInt()){
        //         jumlahAnakKaryawan = inputUser.nextInt();
        //         inputUser.nextLine();
        //         if(!isNumber(jumlahAnakKaryawan)){
        //             System.out.println("Input Harus Berupa Angka");
        //         }else if(!isMinLengthInteger(jumlahAnakKaryawan)){
        //             System.out.println("Input Tidak Boleh Lebih dari 30 dan Kurang dari 0");
        //         }else{
        //             isInvalidInput = false;
        //         }
        //         }else{
        //             System.out.println("Input Harus Berupa Angka");
        //             inputUser.next();
        //         }
        //     }catch(InputMismatchException e){
        //         System.out.println("Input Harus Berupa Angka");
        //         inputUser.next();
        //     }     
        // }while(isInvalidInput);
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

    public static boolean isMinLengthString(String inputUser) {
        char[] input = inputUser.toCharArray();
        if (input.length > 2) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isMinLengthInteger(int inputUser){
        if(inputUser>0 && inputUser<=30){
            return true;
        }
        return false;
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
