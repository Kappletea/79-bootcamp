// Konversi Celcius ke Fahrenheit
//Buatlah (lengkapilah)  program untuk mengonversi suhu dalam satuan Celcius menjadi suhu dalam satuan Fahrenheit.

import java.util.Scanner;
public class No5 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        double inputCelcius = Double.parseDouble(key.next());
        double rumusFarenheit = 0;
        double total = 0;
        if(inputCelcius > -100 && inputCelcius<=100){
            rumusFarenheit = inputCelcius * 1.8 + 32;
            total = rumusFarenheit;
            System.out.printf("%.2f",total);
        }
    }
}
