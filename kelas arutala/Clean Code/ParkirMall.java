

import java.util.Scanner;

public class ParkirMall {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int biayaParkir, tarifJamPertama, tarifPerjam, maksimalTarif, lamaParkir = 0, kategoriKendaraan = 0;
		int minLamaParkir = 1;
		int maksLamaParkir = 24;
		String result = "";
		int[] listTarifParkirJamPertama = {5000, 2000, 10000, 25000, 1000, 100000};
		int[] listTarifPerJam = {2000, 1000, 5000, 5000, 500, 20000};
		int[] listMaksimalTarif = {25000, 10000, 50000, 75000, 5000, 300000};
		
		
		//Input User
		kategoriKendaraan = Integer.valueOf(input.nextLine());
		lamaParkir = Integer.valueOf(input.nextLine());
		
		//Validasi input lama Parkir
		if (lamaParkir >= minLamaParkir && lamaParkir <= maksLamaParkir) {
			//Menentukan Tarif Jam Pertama (done)
			
			tarifJamPertama = getTarifJamPertama(kategoriKendaraan, listTarifParkirJamPertama);
					
			//Menentukan Tarif Per Jam
			
			tarifPerjam = getTarifPerJam(kategoriKendaraan, listTarifPerJam);
						
			//Menentukan Maksimal Tarif
			
			maksimalTarif = getTarifMaksimal(kategoriKendaraan, listMaksimalTarif);
						
			//Hitung biaya Parkir
			biayaParkir = hitungTarifParkir(lamaParkir, tarifJamPertama, tarifPerjam, maksimalTarif);
				
			result = String.valueOf(biayaParkir);
		}else {
			result = "Input Error!!!";
		}
		
		System.out.println(result);
	}
	
	public static int getTarifJamPertama(int kategoriKendaraan, int[] listTarifParkirJamPertama) {
		int result = 0;
		//3
		//int[] listTarifParkirJamPertama = {5000, 2000, 10000, 25000, 1000};

		result = listTarifParkirJamPertama[kategoriKendaraan-1];		
		
		return result;
	}
	
	public static int getTarifPerJam(int kategoriKendaraan, int[] listTarifPerjam) {
		int result = 0;

		result = listTarifPerjam[kategoriKendaraan-1];		
		
		return result;
	}
	
	public static int getTarifMaksimal(int kategoriKendaraan, int[] listTarifMaksimal) {
		int result = 0;

		result = listTarifMaksimal[kategoriKendaraan-1];		
		
		return result;
	}
	
	public static int hitungTarifParkir(int lamaParkir, int tarifJamPertama, int tarifPerjam, int maksimalTarif) {
		int result = 0;

		result = tarifJamPertama + ((lamaParkir -1) * tarifPerjam);
		
		if (result > maksimalTarif) {
			result = maksimalTarif;
		}
		
		return result;
	}
}
