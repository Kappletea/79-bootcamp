import java.util.Scanner;

public class IPK {

	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		String[] arrNamaModule;
		String[] arrHarkat;
		int [] arrSks;
		int [] arrScore;
		
		String statusYudisium = "";
		int banyakModule = 0;
		double ipk, totalSks = 0, totalScore = 0;
		boolean isPending = false;

		//Input banyak module
		banyakModule = Integer.valueOf(input.nextLine());
		
		//inisialisasi semua Array yang dibutuhkan berdasarkan Banyak module
		arrNamaModule = new String[banyakModule];
		arrHarkat = new String[banyakModule];
		arrScore = new int [banyakModule];
		arrSks = new int [banyakModule];
		
		//Lengkapi Kodingan Berikut ini, Agar Looping input data Module berdasarkan Banyak Module Bisa berjalan Sesuai dengan Kebutuhan.
		//Type Code Here
		
		
		totalScore = calculateTotalValue(arrScore);
		totalSks = calculateTotalValue(arrSks);	
		ipk = calculateIpk(totalSks, totalScore);
		isPending = isPendingValildation(arrHarkat);
		statusYudisium = getYudisium(isPending, ipk);
		//print hasil
		printHasil(ipk, totalSks, statusYudisium, arrNamaModule, arrHarkat);
	}	
	
	//menghitung total nilai pada sebuah array
	public static int calculateTotalValue(int[] arrValue) {
		int total = 0;
		//Lanjutkan Kodingan disini
		return total;
	}
	
	//Konversi Harkat ke Nilai
	public static int convertHarkat(String harkat) {
		int value = 0;
		//Lanjutkan Kodingan disini
		return value;
	}
	
	//Menantukan Yudisium
	public static String getYudisium(boolean isPending, double ipk) {
		String statusYudisium = "";
		//Lanjutkan Kodingan disini
		return statusYudisium;
	}
	
	//Menghitung IPK
	public static double calculateIpk(double totalSks, double totalScore) {
		double ipk = 0;
		//Lanjutkan Kodingan disini
		return ipk;
	}
	
	//Print Hasil
	public static void printHasil(double ipk, double totalSks, String statusYudisium, String[] arrModule, String[] arrHarkat) {
		int number =1;
		
		System.out.println("Yudisium: "+statusYudisium);
		System.out.print("IPK: ");
		System.out.printf("%.2f",ipk);
		
		//Lanjutkan kodingan disini
	}
	
	//Validasi Pending berdasarkan Nilai Harkat
	public static boolean isPendingValildation(String[] arrHarkat) {
		boolean isPending = false;
		//Lanjutkan kodingan disini
		
		return isPending;
	}
}
