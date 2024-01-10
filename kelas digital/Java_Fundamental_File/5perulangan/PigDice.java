import java.util.Scanner;


public class PigDice {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int scoreCom, scoreP, roll, turnTotal;
        String  pAgain = "";
        scoreCom = 0;
        scoreP = 0;
        do{
            if(scoreP<100){
                turnTotal = 0;
                System.out.println("computer has "+scoreCom+" points.");

                do {
                    roll = 1+ (int)(Math.random()*6);
                    System.out.println("computer rolled "+ roll+ ".");
                    if(roll ==1){
                        System.out.println("thats ends its turn.");
                        turnTotal=0;
                    }else{
                        turnTotal += roll;
                        System.out.println("computer has "+turnTotal+" points so far this round.");
                        if(turnTotal <10){
                            System.out.println("computer will roll again");
                        }
                    }
                } while (roll!=1 && turnTotal<10);
                scoreCom += turnTotal;
                System.out.println("computer ends the round with "+ scoreCom+ " points.");
            }

            turnTotal=0;
            System.out.println("you have "+scoreP+" points.");
            do {
                roll= 1+(int)(Math.random()*6);
                System.out.println("you roll "+ roll+ ".");
                if(roll ==1){
                    System.out.println("thats ends its turn.");
                    turnTotal=0;
                }else{
                    turnTotal +=roll;
                    System.out.println("you have "+turnTotal+" points so far this round.");
                    System.out.println("would you like to (roll) again or (hold)?");
                    pAgain=keyboard.next();
                    if(turnTotal <10){
                        System.out.println("roll again");
                    }
                }
            } while (roll !=1 && pAgain.equalsIgnoreCase("roll"));
            scoreP+=turnTotal;
            System.out.println("you end the round with "+scoreP+" points.");

        }while(scoreCom<50 && scoreP<50);

        if (scoreP > scoreCom) {
            System.out.println("Humanity win!!" + scoreP);
            System.out.println("computer: " +scoreCom);
        } else {
            System.out.println("computer win." + scoreCom);
            System.out.println("humanity: " + scoreP);
        }
    }
}
