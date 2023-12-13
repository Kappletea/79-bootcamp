import java.util.Scanner;

public class CalculateMoneySpent {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String name;
        int moneySpent = 0;
        int total = 0;
        int totalDay = 0;
        double average;
        System.out.println("hey, what is your name?");
        name = keyboard.next();

        System.out.println("How much money did you spend at the club on Monday");
        moneySpent = keyboard.nextInt();
        total = total + moneySpent;
        totalDay = totalDay + 1;


        System.out.println("How much money did you spend at the club on Tuesday");
        moneySpent = keyboard.nextInt();
        total = total + moneySpent;
        totalDay = totalDay + 1;

        System.out.println("How much money did you spend at the club on Wednesday");
        moneySpent = keyboard.nextInt();
        total = total + moneySpent;
        totalDay = totalDay + 1;

        System.out.println("How much money did you spend at the club on Thursday");
        moneySpent = keyboard.nextInt();
        total = total + moneySpent;
        totalDay = totalDay + 1;

        System.out.println("How much money did you spend at the club on Friday");
        moneySpent = keyboard.nextInt();
        total = total + moneySpent;
        totalDay = totalDay + 1;

        System.out.println("How much money did you spend at the club on Saturday");
        moneySpent = keyboard.nextInt();
        total = total + moneySpent;
        totalDay = totalDay + 1;
        
        System.out.println("How much money did you spend at the club on Sunday");
        moneySpent = keyboard.nextInt();
        total = total + moneySpent;
        totalDay = totalDay + 1;
        average = (double) total/totalDay;

        System.out.println("Calculation Results: ");
        System.out.println("Hi, " + name);
        System.out.println("Your total expenditure at the club this week is: $" + total);
        System.out.println("Your total day average spend: " + average);
    }
}
