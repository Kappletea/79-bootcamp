import java.util.InputMismatchException;
import java.util.Scanner;

/*
*Created By: Rofiq Muhammad Syauqi
*Created At: 13/01/2024 15:49 PM
*finished At: 15/01/2024 12:2 4AM
*/
public class SalarySMS {
    public static void main(String[] args) {
        // deklarasi
        Scanner inputUser = new Scanner(System.in);
        String namaKaryawan, jabatanKaryawan, penempatanKaryawan, tingkatanKaryawan, statusKawinKaryawan;
        int masaKerjaKaryawan, jumlahAnakKaryawan, indexPenempatanKaryawan, indexJabatanKaryawan, indexTingkatanKaryawan;
        double rateGaji;
        long gajiPokok, tunjanganKeluarga, tunjanganAnak, tunjanganJabatan, tunjanganTingkatan, tunjanganTransportasi, gajiBruto, potonganPph, potonganBPJSTenagaKerja, potonganBPJSKesehatan, totalTakeHomePay;
        boolean statusKawin;
        // data
        String[] arrJabatan = { "Programmer", "Tester", "Scrum Master", "HRD" };
            String[] arrPenempatan = { "Bandung", "Garut", "Jakarta", "Bekasi", "Bogor", "Karawang" };
            long[] arrUMK=           {3800000, 2000000, 4500000, 4800000, 4300000, 5000000};
        String[] arrTingkatan= {"Intern","Junior", "Middle", "Senior"};
        String[] arrStatusKawin = {"Kawin", "Belum Kawin", "Cerai"};
        long[] arrTunjanganTingkatan = {0, 250000, 500000, 1000000};
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
               }         
        };
        
        
        //inisialisasi 
        indexJabatanKaryawan = 0;
        indexPenempatanKaryawan = 0;
        indexTingkatanKaryawan = 0;
        masaKerjaKaryawan =0;
        rateGaji=0.0;
        gajiPokok = 0;
        statusKawin = false;
        jumlahAnakKaryawan = 0;
        gajiBruto = 0;
        boolean isInvalidInput = true;
// input user

// input nama

        do {
            System.out.print("Masukkan Nama Karyawan: ");
            namaKaryawan = inputUser.nextLine();
            if(!isString(namaKaryawan)){
                System.out.println("Input Harus Berupa Huruf!");
            }else if(!isMinLengthString(namaKaryawan)){
                System.out.println("Input Harus Lebih Dari 2!");
            }else{
                isInvalidInput = false;
            }
        } while (isInvalidInput);

// input jabatan

        do {
            isInvalidInput = true;
            System.out.print("Masukkan Jabatan Karyawan: ");
            jabatanKaryawan = inputUser.nextLine();
            if(!isString(jabatanKaryawan)){
                System.out.println("Input Harus Berupa Huruf!");
            }else if(!isMinLengthString(jabatanKaryawan)){
                System.out.println("Input Harus Lebih Dari 2!");
            }else if(!isDataExist(jabatanKaryawan, arrJabatan)){
                System.out.println("Jabatan Tersebut Tidak Tercantum!");
            }else{
                isInvalidInput = false;
                indexJabatanKaryawan = getArrayIndex(jabatanKaryawan, arrJabatan);
            }
        } while (isInvalidInput);
        
// input divisi
      
        do {
            isInvalidInput = true;
            System.out.print("Masukkan Penempatan Karyawan: ");
            penempatanKaryawan = inputUser.nextLine();
            if(!isString(penempatanKaryawan)){
                System.out.println("Input Harus Berupa Huruf!");
            }else if(!isMinLengthString(penempatanKaryawan)){
                System.out.println("Input Harus Lebih Dari 2!");
            }else if(!isDataExist(penempatanKaryawan, arrPenempatan)){
                System.out.println("Divisi Tersebut Tidak Tercantum!");
            }else{
                isInvalidInput = false;
                indexPenempatanKaryawan = getArrayIndex(penempatanKaryawan, arrPenempatan);
            }
        } while (isInvalidInput);

//input tingkatan karyawan:

       

        do {
            isInvalidInput = true;
            System.out.print("Masukkan Tingkatan Karyawan: ");
            tingkatanKaryawan = inputUser.nextLine();
            if(!isString(tingkatanKaryawan)){
                System.out.println("Input Harus Berupa Huruf!");
            }else if(!isMinLengthString(tingkatanKaryawan)){
                System.out.println("Input Harus Lebih Dari 2!");
            }else if(!isDataExist(tingkatanKaryawan, arrTingkatan)){
                System.out.println("Tingkatan Tersebut Tidak Tercantum di Posisi " + jabatanKaryawan);
            }else if(jabatanKaryawan.equalsIgnoreCase("Programmer") || jabatanKaryawan.equalsIgnoreCase("Tester") || jabatanKaryawan.equalsIgnoreCase("Scrum Master")){
                if(tingkatanKaryawan.equalsIgnoreCase("Intern")){
                    System.out.println("Tingkatan Intern Tidak Termasuk Di Jabatan "+ jabatanKaryawan);
                }else{
                    indexTingkatanKaryawan = getArrayIndex(tingkatanKaryawan, arrTingkatan);
                    isInvalidInput= false;
                }
            }else{
                indexTingkatanKaryawan = getArrayIndex(tingkatanKaryawan, arrTingkatan);
                isInvalidInput= false;
            }
        } while (isInvalidInput);
   

//input masa kerja
        isInvalidInput=true;
        do {
            System.out.print("Masukkan Masa Kerja Karyawan: ");
            try {
                if (inputUser.hasNextInt()) {
                    masaKerjaKaryawan = Integer.valueOf(inputUser.nextLine());
                    if (!isNumber(masaKerjaKaryawan)) {
                        System.out.println("Input Harus Berupa angka");
                    } else if (!isMinLengthInteger(masaKerjaKaryawan)) {
                        System.out.println("Input tidak boleh lebih dari 30 dan kurang dari 0");
                    } else {
                        isInvalidInput = false;
                        
                    }
                } else {
                    System.out.println("Input Harus Angka");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input Harus angka");
            }
        } while (isInvalidInput);
        

        
// status kawin
        isInvalidInput = true;
        do{
            System.out.print("Masukkan Status Kawin Karyawan: ");
            statusKawinKaryawan = inputUser.nextLine();
            if(!isString(statusKawinKaryawan)){
                System.out.println("Input Harus Huruf");
            }else if(!isMinLengthString(statusKawinKaryawan)){
                System.out.println("Input Harus Lebih Dari 2 Huruf");
            }else if(!isDataExist(statusKawinKaryawan, arrStatusKawin)){
                System.out.print("\n");
                System.out.println("Status Yang Anda Sebutkan Tidak Tercantum");
                System.out.println("Status Yang Harus Di isi adalah:");
                for(int i=0; i<arrStatusKawin.length; i++){
                    System.out.println(arrStatusKawin[i]);
                }
            }else {
                statusKawin = isEmployeeMaried(statusKawinKaryawan);
                isInvalidInput = false;
            }
        }while(isInvalidInput);

//jumlah anak
        isInvalidInput = true;
        do{
            System.out.print("Masukkan Jumlah Anak Karyawan: ");
            try{
                if(inputUser.hasNextInt()){
                jumlahAnakKaryawan = inputUser.nextInt();
                inputUser.nextLine();
                if(!isNumber(jumlahAnakKaryawan)){
                    System.out.println("Input Harus Berupa Angka");
                }else if(!isMinLengthInteger(jumlahAnakKaryawan)){
                    System.out.println("Input Tidak Boleh Lebih dari 30 dan Kurang dari 0");
                }else{
                    isInvalidInput = false;
                }
                }else{
                    System.out.println("Input Harus Berupa Angka");
                    inputUser.next();
                }
            }catch(InputMismatchException e){
                System.out.println("Input Harus Berupa Angka");
                inputUser.next();
            }     
        }while(isInvalidInput);
        inputUser.close();


        if(jabatanKaryawan.equalsIgnoreCase("Programmer") || jabatanKaryawan.equalsIgnoreCase("Tester")|| jabatanKaryawan.equalsIgnoreCase("Scrum Master")){
            rateGaji= getRatesGaji(indexJabatanKaryawan, masaKerjaKaryawan, indexTingkatanKaryawan-1, arrRatesGaji);
        }else{
            rateGaji= getRatesGaji(indexJabatanKaryawan, masaKerjaKaryawan, indexTingkatanKaryawan, arrRatesGaji);
        }

        gajiPokok = kalkulasiGajiPokok(rateGaji, arrUMK, indexPenempatanKaryawan);
        tunjanganJabatan= kalkulasiTunjJabatan(jabatanKaryawan, gajiPokok);
        tunjanganKeluarga = kalkulasiTunjKeluarga(statusKawin, gajiPokok);
        tunjanganAnak = kalkulasiTunjAnak(jumlahAnakKaryawan, gajiPokok);
        tunjanganTingkatan= kalkulasiTunjTingkatan(arrTunjanganTingkatan, indexTingkatanKaryawan);
        tunjanganTransportasi= kalkulasiTunjTransport(penempatanKaryawan);
        long[] arrTunjangan ={tunjanganJabatan, tunjanganKeluarga, tunjanganAnak, tunjanganTingkatan, tunjanganTransportasi};
        gajiBruto = kalkulasiGajiBruto(gajiPokok, arrTunjangan);
        potonganPph = kalkulasiPph(gajiBruto, statusKawin, jumlahAnakKaryawan);
        potonganBPJSTenagaKerja = kalkulasiPotonganBpjsTenagaKerja(gajiBruto);
        potonganBPJSKesehatan = kalkulasiPotonganBpjsKesehatan(gajiBruto);
        long[] arrPotongan={potonganPph, potonganBPJSTenagaKerja, potonganBPJSKesehatan};
        totalTakeHomePay = kalkulasiTakeHomePay(gajiBruto, arrPotongan);
        
        System.out.println("---------{Receipt Gaji Karyawan}---------");
        System.out.println("Gaji Pokok: " + formatCurrency(gajiPokok));
        System.out.println("Tunjangan Jabatan: "+ formatCurrency(tunjanganJabatan));
        System.out.println("Tunjangan Keluarga: "+ formatCurrency(tunjanganKeluarga));
        System.out.println("Tunjangan Anak: "+ formatCurrency(tunjanganAnak));
        System.out.println("Tunjangan Tingkatan: "+ formatCurrency(tunjanganTingkatan));
        System.out.println("Tunjangan Transportasi: "+ formatCurrency(tunjanganTransportasi));
        System.out.println("Gaji Bruto: "+ formatCurrency(gajiBruto));
        System.out.println("Potongan PPH: "+ formatCurrency(potonganPph));
        System.out.println("Potongan BPJS Tenaga Kerja: "+ formatCurrency(potonganBPJSTenagaKerja));
        System.out.println("Potongan BPJS Kesehatan: "+ formatCurrency(potonganBPJSKesehatan));
        System.out.println("Take Home Pay/Gaji Bersih: "+ formatCurrency(totalTakeHomePay));
        
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
        if(inputUser>=0 && inputUser<=30){
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

    public static Boolean isEmployeeMaried(String inputUser){
            if(inputUser.equalsIgnoreCase("Kawin")){
                return true;
            }else{
                return false;
            }
    }
    //end validate function
    
//get funciton
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

    //get rates gaji
    public static double getRatesGaji(int indexJabatanKaryawan, int masaKerjaKaryawan, int indexTingkatanKaryawan, int[][][] arrRatesGaji){
        double result = arrRatesGaji[indexJabatanKaryawan][masaKerjaKaryawan][indexTingkatanKaryawan];
        return result;
    }


//function kalkulasi
    //kalulasigajipokok
    public static long kalkulasiGajiPokok(double rateGaji, long[] arrUMK, int indexPenempatanKaryawan){
        double result = 0.0;
        result = rateGaji/100.0 * arrUMK[indexPenempatanKaryawan];
        return (long)result;
    }

    //cek status kawin

    //kalkulasi tunjangan keluarga
    public static long kalkulasiTunjKeluarga(boolean isEmployeeMaried, long gajiPokok){
        double result = 0;
        double presentaseTunjangan = 5.0/100.0;
        if(isEmployeeMaried == true){
            result = presentaseTunjangan * gajiPokok;
            return (long)result;
        }else{
            return 0;
        }
    }

    public static long kalkulasiTunjAnak(int jumlahAnakKaryawan, long gajiPokok){
        int maxAnak = 4;
        double presentaseTunjangan = 2.5/100.0;
        double result;
        result = presentaseTunjangan *gajiPokok * Math.min(jumlahAnakKaryawan,maxAnak);
        return (long)result;
    }

    public static long kalkulasiTunjJabatan(String jabatanKaryawan, long gajiPokok){
        double presentaseTunjangan;
        switch(jabatanKaryawan.toLowerCase()){
            case "programmer":
                presentaseTunjangan = 10.0;
                break;
            case "tester":
                presentaseTunjangan = 15.0;
                break;
            case "scrum master":
                presentaseTunjangan = 20.0;
                break;
            case "hrd":
                presentaseTunjangan = 10.0;
                break;
            default:
                presentaseTunjangan = 0.0;
            break;
        }

        return (long)(presentaseTunjangan/100.0*gajiPokok);
    }

    public static long kalkulasiTunjTingkatan(long[] arrTunjanganTingkatan,int indexTingkatanKaryawan){
        long result = arrTunjanganTingkatan[indexTingkatanKaryawan];
        return result;
    }

    public static long kalkulasiTunjTransport(String penempatanKaryawan){
        long result = 0;
        if(penempatanKaryawan.equalsIgnoreCase("Jakarta") || penempatanKaryawan.equalsIgnoreCase("Bandung")){
            result = 250000;
        }else{
            result = 0;
        }
        return result;
    }

    public static long kalkulasiGajiBruto(long gajiPokok,long[] arrTunjangan){
        long result=0;
        long totalTunjangan =0;
        for(int i =0; i<arrTunjangan.length; i++){
            totalTunjangan += arrTunjangan[i];
        }
        return result = gajiPokok +totalTunjangan;
    }

    public static long kalkulasiPph(long gajiBruto, boolean statusKawin,int jumlahAnakKaryawan){
        long pkp, pph, pphPerBulan;
        long persyaratanWajibPajak = 4000000;
        long ptkp = 36000000;
        int maxAnak = 3;
        if(statusKawin==true){
            ptkp += 3000000;
        }
        if(jumlahAnakKaryawan>0){
            ptkp += Math.min(jumlahAnakKaryawan, maxAnak)*3000000;
        }
        long gajiBrutoPerTahun = gajiBruto*12;
        if(gajiBrutoPerTahun <= persyaratanWajibPajak){
            pkp = Math.max(gajiBrutoPerTahun-ptkp, 0);
            pph = (long)(5.0/100.0 * pkp);
            pphPerBulan = pph/12;
        }else{
            return 0;
        }
        
       return pkp;
    }

    public static long kalkulasiPotonganBpjsTenagaKerja(long gajiBruto){
        long result =0;
        double potongan = 3.5/100.0;
        result = (long)(potongan*gajiBruto);
        return result;
    }
    public static long kalkulasiPotonganBpjsKesehatan(long gajiBruto){
        long result =0;
        double potongan = 1.5/100.0;
        result = (long)(potongan*gajiBruto);
        return result;
    }
    public static long kalkulasiTakeHomePay(long gajiBruto, long[] arrPotongan){
        long result=gajiBruto;
        for(int i=0; i <arrPotongan.length;i++){
            result = (long)(result-arrPotongan[i]);
        }
        return result;
    }

//format currency
    public static String formatCurrency(long nominal){
        String formattedValue = String.format("Rp.%,.0f", (double)nominal);
        return formattedValue;
    }
}
