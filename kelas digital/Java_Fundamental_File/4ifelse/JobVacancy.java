import java.util.Scanner;

public class JobVacancy {
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

        // if(jenisKelamin.equalsIgnoreCase("Pria") && (umur>=21&&umur<=30) &&
        // (lulusan.equalsIgnoreCase("SMK")||lulusan.equalsIgnoreCase("D3")) &&
        // pengalaman >=2 && posisi.equalsIgnoreCase("Koordinator")){
        // System.out.println(nama+", terima kasih sudah mengikuti lowongan kerja di PT.
        // Scret Semut.");
        // System.out.println("Berikut Hasil dari Rekrutmen:");
        // System.out.println("Selamat "+nama);
        // System.out.println("Anda memenuhi syarat kerja pada posisi koordinator
        // "+nama);
        // }else if(jenisKelamin.equalsIgnoreCase("Pria") && (umur>=30) &&
        // lulusan.equalsIgnoreCase("S1") && pengalaman >=5 &&
        // posisi.equalsIgnoreCase("Koordinator")){
        // System.out.println(nama+", terima kasih sudah mengikuti lowongan kerja di PT.
        // Scret Semut.");
        // System.out.println("Berikut Hasil dari Rekrutmen:");
        // System.out.println("Selamat "+nama);
        // System.out.println("Anda memenuhi syarat kerja pada posisi koordinator
        // "+nama);
        // }else{
        // if()
        // }

        if (posisi.equalsIgnoreCase("Koordinator")) {
            if (jenisKelamin.equalsIgnoreCase("Pria")) {
                if (lulusan.equalsIgnoreCase("SMK") || lulusan.equalsIgnoreCase("D3")) {
                    if (umur >= 21 && umur <= 30) {
                        if (pengalaman >= 2) {
                            System.out.println(
                                    nama + ", terima kasih sudah mengikuti lowongan kerja di PT. Scret Semut.");
                            System.out.println("Berikut Hasil dari Rekrutmen:");
                            System.out.println("Selamat " + nama);
                            System.out.println("Anda memenuhi syarat kerja pada posisi koordinator ");
                        } else {
                            System.out.println("Mohon maaf, pengalaman anda tidak memenuhi persyaratan");
                        }
                    } else {
                        System.out.println("Mohon maaf, umur rekruitment tidak sesuai dengan persyaratan.");
                    }
                } else if (lulusan.equalsIgnoreCase("S1")) {
                    if (umur >= 30) {
                        if (pengalaman >= 5) {
                            System.out.println(
                                    nama + ", terima kasih sudah mengikuti lowongan kerja di PT. Scret Semut.");
                            System.out.println("Berikut Hasil dari Rekrutmen:");
                            System.out.println("Selamat " + nama);
                            System.out.println("Anda memenuhi syarat kerja pada posisi koordinator ");
                        } else {
                            System.out.println("Mohon maaf, pengalaman anda tidak memenuhi persyaratan");
                        }
                    } else {
                        System.out.println("Mohon maaf, umur rekruitment tidak sesuai dengan persyaratan.");
                    }
                } else {
                    System.out.println(
                            "Mohon Maaf, posisi koordinator hanya diperuntunkan untuk retruitmen yang berlulusan SMK/D3/S1");
                }
            } else {
                System.out.println(
                        "Mohon maaf, posisi koordinator hanya diperuntunkan untuk rekruitmen berjenis kelamin pria");
            }
        } else if (posisi.equalsIgnoreCase("Admin")) {
            if (jenisKelamin.equalsIgnoreCase("Pria")) {
                if (lulusan.equalsIgnoreCase("D3") || lulusan.equalsIgnoreCase("S1")) {
                    if (umur >= 20 && umur <= 30) {
                        if (pengalaman >= 2) {
                            if (penampilan > 8.5) {
                                System.out.println("Berikut Hasil dari Rekrutmen:");
                                System.out.println("Selamat " + nama);
                                System.out.println("Anda memenuhi syarat kerja pada posisi admin " + nama);
                            } else {
                                System.out.println("mohon maaf, penampilan anda tidak memenuhi syarat");
                            }
                        } else {
                            System.out.println("Mohon maaf pengalaman kerja tidak memenuhi syarat");
                        }
                    } else {
                        System.out.println("Mohon maaf, umur tidak memenuhi persyaratan");
                    }
                } else {
                    System.out.println("Mohon maaf, riwayat pendidikan terakhir tidak memenuhi syarat");
                }
            } else {
                if (lulusan.equalsIgnoreCase("D3")) {
                    if (umur >= 20 && umur <= 25) {
                        if (pengalaman >= 1 || penampilan > 8.5) {
                            System.out.println("Berikut Hasil dari Rekrutmen:");
                            System.out.println("Selamat " + nama);
                            System.out.println("Anda memenuhi syarat kerja pada posisi admin " + nama);
                        } else {
                            System.out.println("Mohon maaf pengalaman kerja/penampilan tidak memenuhi syarat");
                        }
                    } else {
                        System.out.println("Mohon maaf, umur tidak memenuhi persyaratan");
                    }
                } else if (lulusan.equalsIgnoreCase("S1")) {
                    if (umur > 25) {
                        if (pengalaman >= 3) {
                            if (penampilan >= 8.5) {
                                System.out.println("Berikut Hasil dari Rekrutmen:");
                                System.out.println("Selamat " + nama);
                                System.out.println("Anda memenuhi syarat kerja pada posisi admin " + nama);
                            } else {
                                System.out.println("mohon maaf penampilan anda tidak memenuhi syarat");
                            }
                        } else {
                            System.out.println("mohon maaf pengalaman anda tidak memenuhi syarat");
                        }
                    } else {
                        System.out.println("Mohon maaf, umur tidak memenuhi syarat");
                    }
                } else {
                    System.out.println("Mohon maaf, riwayat pendidikan terakhir tidak memenuhi syarat");
                }
            }
        } else if (posisi.equalsIgnoreCase("SPV")) {
            if (jenisKelamin.equalsIgnoreCase("Pria")||jenisKelamin.equalsIgnoreCase("Wanita")) {
                if (lulusan.equalsIgnoreCase("S1")) {
                    if(umur >=23 && umur <=30){
                        if (pengalaman >1) {
                            System.out.println("Berikut Hasil dari Rekrutmen:");
                                System.out.println("Selamat " + nama);
                                System.out.println("Anda memenuhi syarat kerja pada posisi SPV " + nama);
                        }else{
                            System.out.println("mohon maaf pengalaman kerja anda tidak memenuhi syarat");
                        }
                    }else{
                        System.out.println("Mohon maaf umur anda tidak memenuhi syarat");
                    }
                } else if(lulusan.equalsIgnoreCase("D3")) {
                    if(umur >=25 && umur <=35){
                        if (pengalaman >4) {
                            System.out.println("Berikut Hasil dari Rekrutmen:");
                                System.out.println("Selamat " + nama);
                                System.out.println("Anda memenuhi syarat kerja pada posisi SPV " + nama);
                        }else{
                            System.out.println("mohon maaf pengalaman kerja anda tidak memenuhi syarat");
                        }
                    }else{
                        System.out.println("Mohon maaf umur anda tidak memenuhi syarat");
                    }
                }
            } else {
                System.out.println("maaf kami hanya membutuhkan orang yang lurus");
            }
        } else {
            System.out.println("Posisi yang anda cari tidak ada");
        }

    }
}
