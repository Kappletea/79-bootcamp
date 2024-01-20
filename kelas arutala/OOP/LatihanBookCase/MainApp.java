package LatihanBookCase;


import java.util.Scanner;
public class MainApp{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Book");
        System.out.println("2. Author");
        System.out.println("3. Publisher");
        System.out.println("0. Exit");

        int inputMenu = Integer.valueOf(input.nextLine());

        switch (inputMenu) {
            case 3:
                Publisher inputPublisher = new Publisher();
                inputPublisher.getPublisherName("naon");
                break;
        
            default:
                break;
        }
    }
}