import java.util.Scanner;

public class IpkAndYudisium {

	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		String[] arrNamaModule;
		String[] arrHarkat;
		int [] arrSks;
		int [] arrScore;
		//array menyimpan nilai harkat tergantung simbol harkat
		int[] arrNilaiHarkat ={4, 3, 2, 1, 0};
		
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
		for(int i = 0; i<banyakModule;i++){
			arrNamaModule[i] = String.valueOf(input.nextLine());
			arrSks[i] = Integer.valueOf(input.nextLine());
			arrHarkat[i] = String.valueOf(input.nextLine());
			arrScore[i] = convertHarkat(arrHarkat[i], arrNilaiHarkat); 
			arrScore[i] = calculateHarkatPerModule(arrScore[i], arrSks[i]);
		}
		
		
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
		for(int i =0; i<arrValue.length;i++){
			total += arrValue[i];
		}
		return total;
	}
	
	//Konversi Harkat ke Nilai
	public static int convertHarkat(String harkat, int[] arrNilaiHarkat) {
		int value = 0;
		switch(harkat){
			case "A":
			value = arrNilaiHarkat[0];
			break;
			case "B":
			value = arrNilaiHarkat[1];
			break;
			case "C":
			value = arrNilaiHarkat[2];
			break;
			case "D":
			value = arrNilaiHarkat[3];
			break;
			case "E":
			value = arrNilaiHarkat[4];
			break;
		}
		return value;
	}
	
	//Menantukan Yudisium
	public static String getYudisium(boolean isPending, double ipk) {
		String statusYudisium = "";
		if(isPending == true || ipk < 2){
			statusYudisium = "Pending";
		}else if(ipk >= 3.5){
			statusYudisium = "Cum Laude";
		}else if(ipk >= 2.75 && ipk < 3.5){
			statusYudisium = "Sangat Memuaskan";
		}else if(ipk >=2.00 && ipk<2.75){
			statusYudisium = "Memuaskan";
		}
		return statusYudisium;
	}
	
	//nilai harkat * sks per module . maksudnya harkat yang sudah diconvert di kali dengan total sks per modul
	public static int calculateHarkatPerModule(int arrScore, int arrSks){
		int result = 0;
		result = arrScore * arrSks;
		return result;
	}
	
	//Menghitung IPK
	public static double calculateIpk(double totalSks, double totalScore) {
		double ipk = 0;
		ipk = totalScore/totalSks;
		return ipk;
	}
	
	//Print Hasil
	public static void printHasil(double ipk, double totalSks, String statusYudisium, String[] arrModule, String[] arrHarkat) {
		int number =1;
		
		System.out.println("Yudisium: "+statusYudisium);
		System.out.print("IPK: ");
		System.out.printf("%.2f", ipk);
		System.out.print("\n");
		System.out.printf("Total SKS: %.1f", totalSks);
		System.out.print("\n");
		System.out.println("Total Module: "+ arrModule.length);
		for(int i=0; i<arrModule.length; i++){
			System.out.println((number+i) +". " + arrModule[i] + " (" +  arrHarkat[i] + ")");
		}
		
		//Lanjutkan kodingan disini
	}
	
	//Validasi Pending berdasarkan Nilai Harkat
	public static boolean isPendingValildation(String[] arrHarkat) {
		boolean isPending = false;
		//Lanjutkan kodingan disini
		for(int i =0; i<arrHarkat.length;i++){
			if(arrHarkat[i].equalsIgnoreCase("E")){
				isPending = true;
			}else{
				isPending = false;
			}
		}
		return isPending;
	}
}
