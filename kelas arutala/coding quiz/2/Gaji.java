import java.util.Scanner;

public class Gaji {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String posisiJabatan, inputPerusahaan, inputPosisiJabatan;
        int inputLamaBekerja, totalGajiPokok, totalTunjanganKeluarga, totalTunjanganBekerja, totalTunjanganPosisi,
                totalGajiKotor, potonganPensiun, potonganBPJS, potonganPPH, totalPotongan, totalGajiBersih;
        boolean statusPernikahan;
        long[] listUmk = { 1961085, 3742276, 4453935, 4782935, 4330249, 3289409 };
        String[] cabangPerusahaan = { "Garut", "Bandung", "Jakarta", "Bekasi", "Bogor", "Palembang" };
        inputPerusahaan = key.next();
        inputPosisiJabatan = key.next();
        inputLamaBekerja = key.nextInt();
        statusPernikahan = key.nextBoolean();

        // get umk
        long umkCabangPerusahaan = getUmkCabangPerusahaan(inputPerusahaan, cabangPerusahaan, listUmk);
        // gaji pokok
        totalGajiPokok = (int) getGajiPokok(umkCabangPerusahaan, inputPosisiJabatan, inputLamaBekerja);
        System.out.println(totalGajiPokok);
        // get tunjangan keluarga
        totalTunjanganKeluarga = (int) getTunjanganKeluarga(totalGajiPokok, statusPernikahan);
        System.out.println(totalTunjanganKeluarga);
        // get tunjangan bekerja
        totalTunjanganBekerja = (int) getTunjanganJabatan(totalGajiPokok, inputLamaBekerja);
        System.out.println(totalTunjanganBekerja);
        // get tunjangan posisi jabatan
        totalTunjanganPosisi = getTunjanganPosisi(inputPosisiJabatan);
        System.out.println(totalTunjanganPosisi);
        // get gaji kotor
        totalGajiKotor = getGajiKotor(totalGajiPokok, totalTunjanganKeluarga, totalTunjanganBekerja,
                totalTunjanganPosisi);
        System.out.println(totalGajiKotor);
        // potongan pensiun
        potonganPensiun = (int) getPotonganPensiun(totalGajiKotor);
        System.out.println(potonganPensiun);
        // potongan BPJS
        potonganBPJS = (int) getPotonganBPJS(totalGajiKotor);
        System.out.println(potonganBPJS);
        // potongan PPH
        potonganPPH = (int) getPotonganPPH(totalGajiKotor);
        System.out.println(potonganPPH);
        // gaji bersih
        totalGajiBersih = getGajiBersih(totalGajiKotor, potonganPensiun, potonganBPJS, potonganPPH);
        System.out.println(totalGajiBersih);

    }

    public static long getUmkCabangPerusahaan(String inputPerusahaan, String[] cabangPerusahaan, long[] listUmk) {
        long umkResult = 0;
        for (int i = 0; i < cabangPerusahaan.length; i++) {
            if (cabangPerusahaan[i].equalsIgnoreCase(inputPerusahaan)) {
                umkResult = listUmk[i];
            }
        }
        return umkResult;
    }

    public static double getGajiPokok(long umkCabangPerusahaan, String posisiJabatan, int inputLamaBekerja) {
        double resultGajiPokok = 0;
        double presentase = 0.0;
        if (posisiJabatan.equalsIgnoreCase("Admin")) {
            if (inputLamaBekerja < 2) {
                presentase = 100.0 / 100.0;
                resultGajiPokok = presentase * umkCabangPerusahaan;
            } else {
                presentase = 120.0 / 100.0;
                resultGajiPokok = presentase * umkCabangPerusahaan;
            }
        } else if (posisiJabatan.equalsIgnoreCase("Coordinator")) {
            if (inputLamaBekerja < 3) {
                presentase = 110.0 / 100.0;
                resultGajiPokok = presentase * umkCabangPerusahaan;
            } else {
                presentase = 130.0 / 100.0;
                resultGajiPokok = presentase * umkCabangPerusahaan;
            }
        } else if (posisiJabatan.equalsIgnoreCase("SPV")) {
            if (inputLamaBekerja < 2) {
                presentase = 125.0 / 100.0;
                resultGajiPokok = presentase * umkCabangPerusahaan;
            } else if (inputLamaBekerja >= 2 && inputLamaBekerja <= 4) {
                presentase = 140.0 / 100.0;
                resultGajiPokok = presentase * umkCabangPerusahaan;
            } else {
                presentase = 150.0 / 100.0;
                resultGajiPokok = presentase * umkCabangPerusahaan;
            }
        } else if (posisiJabatan.equalsIgnoreCase("Manager")) {
            if (inputLamaBekerja < 3) {
                presentase = 150.0 / 100.0;
                resultGajiPokok = presentase * umkCabangPerusahaan;
            } else {
                presentase = 200.0 / 100.0;
                resultGajiPokok = presentase * umkCabangPerusahaan;
            }
        } else if (posisiJabatan.equalsIgnoreCase("Sprinter")) {
            presentase = 90.0 / 100.0;
            resultGajiPokok = presentase * umkCabangPerusahaan;
        } else if (posisiJabatan.equalsIgnoreCase("Officer")) {
            presentase = 100.0 / 100.0;
            resultGajiPokok = presentase * umkCabangPerusahaan;
        }
        return resultGajiPokok;
    }

    public static double getTunjanganKeluarga(int totalGajiPokok,boolean statusPernikahan) {
        double result = 0;
        double presentase = 10.0 / 100.0;
        if(statusPernikahan == true){
            result = presentase * totalGajiPokok;
        }else{
            result =0;
        }
        return result;
    }

    public static double getTunjanganJabatan(int totalGajiPokok, int inputLamaBekerja) {
        double result = 0;
        double presentase = 5.0 / 100.0;
        if (inputLamaBekerja > 4) {
            result = presentase * totalGajiPokok;
        }
        return result;
    }

    public static int getTunjanganPosisi(String inputPosisiJabatan) {
        int result = 0;
        if (inputPosisiJabatan.equalsIgnoreCase("Admin")) {
            result = 200000;
        } else if (inputPosisiJabatan.equalsIgnoreCase("Coordinator")) {
            result = 500000;
        } else if (inputPosisiJabatan.equalsIgnoreCase("SPV")) {
            result = 700000;
        } else if (inputPosisiJabatan.equalsIgnoreCase("Manager")) {
            result = 1000000;
        } else if (inputPosisiJabatan.equalsIgnoreCase("Sprinter")) {
            result = 200000;
        } else if (inputPosisiJabatan.equalsIgnoreCase("Officer")) {
            result = 200000;
        }
        return result;
    }

    public static int getGajiKotor(int totalGajiPokok, int totalTunjanganKeluarga, int totalTunjanganBekerja,
            int totalTunjanganPosisi) {
        int result = totalGajiPokok + totalTunjanganKeluarga + totalTunjanganBekerja + totalTunjanganPosisi;
        return result;
    }

    public static int getGajiKotor1(int totalGajiPokok, int totalTunjanganBekerja, int totalTunjanganPosisi) {
        int result = totalGajiPokok + totalTunjanganBekerja + totalTunjanganPosisi;
        return result;
    }

    public static double getPotonganPensiun(int totalGajiKotor) {
        double result = 0.0;
        double presentase = 2.0 / 100.0;
        result = presentase * totalGajiKotor;
        return result;
    }

    public static double getPotonganBPJS(int totalGajiKotor) {
        double result = 0.0;
        double presentase = 2.0 / 100.0;
        result = presentase * totalGajiKotor;
        return result;
    }

    public static double getPotonganPPH(int totalGajiKotor) {
        double result = 0.0;
        double presentase = 5.0 / 100.0;
        result = presentase * totalGajiKotor;
        return result;
    }

    public static int getGajiBersih(int totalGajiKotor, int potonganPensiun, int potonganBPJS, int potonganPPH) {
        int result = totalGajiKotor - potonganPensiun - potonganBPJS - potonganPPH;
        return result;
    }
}
