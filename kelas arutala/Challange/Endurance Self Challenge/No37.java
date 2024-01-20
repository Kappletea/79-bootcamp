// Rhythm Game

// Table of Content : 

// Variable, Boolean Expression, IF(IF, Else, Else IF), Switch-Case, Looping (FOR, WHILE, DO-WHILE), Array, Function.

// Deskripsi Soal :

// Stella adalah seorang player dari game "Rhythm Master" yang merupakan sebuah game rhythm populer di PlayStore. Sebagai player yang aktif, Stella selalu ingin tahu berapa skor dan peringkat yang dia peroleh setiap kali menyelesaikan lagu di game tersebut.

// Buatlah sebuah Program Aplikasi yang dapat menghitung skor dan menentukan peringkat pemain dalam game "Rhythm Master" dengan ketentuan sebagai berikut:

//     "Perfect" (tepat waktu): 100 poin

//     "Great" (agak tepat waktu): 80 poin

//     "Good" (sedikit tepat waktu): 60 poin

//     "Miss" (salah atau terlambat): 0 poin


// Peringkat dalam game ini diberikan berdasarkan total skor yang diperoleh, dengan ketentuan sebagai berikut:

//     "S" (Super) jika total skor >= 90% dari total maksimal skor yang bisa dicapai.

//     "A" (Amazing) jika total skor >= 80% dari total maksimal skor yang bisa dicapai.

//     "B" (Brilliant) jika total skor >= 70% dari total maksimal skor yang bisa dicapai.

//     "C" (Cool) jika total skor >= 60% dari total maksimal skor yang bisa dicapai.

//     "D" (Decent) jika total skor < 60% dari total maksimal skor yang bisa dicapai.


// Total skor maksimal yang dapat diperoleh dalam setiap lagu adalah 10.000 poin, dan dapat diperoleh jika player berhasil menyelesaikan lagu dengan kondisi 100% perfect.

// List Function utama yang harus ada:

//     calculateScore(int perfectCount, int greatCount, int goodCount, int missCount)

// Function untuk menghitung skor berdasarkan jumlah ketepatan.

//     calculateTotalMaxScore(int maxPerfect, int maxGreat, int maxGood)

// Function untuk menghitung total maksimal skor yang bisa dicapai pada lagu tertentu. (Max score yang dapat dicapai yaitu 100% Perfect = 10000 poin)

//     getRank(double percentage)

// Function untuk mendapatkan peringkat berdasarkan persentase skor yang diperoleh.

//     printResult(String playerName, int totalScore, int totalMaxScore, String rank)

// Function untuk menampilkan hasil perhitungan skor dan peringkat pemain.
// Ketentuan input :
// - Baris pertama berisi Nama Pemain
// - Baris ke-2 hingga ke-4 berturut turut merupakan banyaknya poin "Perfect", "Great", "Good", dan "Miss" dengan total jumlah poin tersebut 100.

// Ketentuan output:
// - Baris pertama total poin yang didapat
// - Baris kedua peringkat pemain

// Input:
// Sintia
// 50
// 25
// 20
// 5

// Output
// 8200
// Sintia peringkat A (Amazing)

// For example:
// Test 	Input 	Result

// 1

	

// Sintia
// 50
// 25
// 20
// 5

	

// 8200
// Sintia peringkat A (Amazing)

a
public class No37 {
    
}
