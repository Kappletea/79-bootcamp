import java.util.Scanner;

public class RythmGame {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int perfectCount, greatCount, goodCount,missCount, totalScore,totalMaxScore, fullCombo;
        double percentage;
        String playerName = key.next();
        perfectCount = key.nextInt();
        greatCount = key.nextInt();
        goodCount = key.nextInt();
        missCount = key.nextInt();
        totalScore = calculateScore(perfectCount, greatCount, goodCount, missCount);
        fullCombo = perfectCount + greatCount+ goodCount+missCount;
        totalMaxScore = 0;
        if(fullCombo==100){
            totalMaxScore = calculateTotalMaxScore(100, 0, 0);
        }else if(fullCombo == 80){
            totalMaxScore = calculateTotalMaxScore(0, 80, 0);
        }else if (fullCombo == 60){
            totalMaxScore = calculateTotalMaxScore(0, 0, 60);
        }
        percentage = (double)totalScore/totalMaxScore*100;
        String rank = getRank(percentage);
        printResult(playerName, totalScore, totalMaxScore, rank);
    }


    public static int calculateScore(int perfectCount, int greatCount, int goodCount, int missCount){
        int result =0;
        result = (perfectCount*100) + (greatCount*80) + (goodCount*60) + (missCount*0);
        return result;
    }

    public static int calculateTotalMaxScore(int maxPerfect, int maxGreat, int maxGood){
        int result =0;
        result = (maxPerfect*100) + (maxGreat*80) + (maxGood*60);
        return result;
    }

    public static String getRank(double percentage){
        String result = "";
        if(percentage >=90){
            result  = "S (Super)";
        }else if (percentage >=80){
            result = "A (Amazing)";
        }else if (percentage >=70){
            result = "B (Briliant)";
        }else if (percentage >=60){
            result = "C (Cool)";
        }else if (percentage <60){
            result = "D (Decent)";
        }
        return result;
    }

    public static void printResult(String playerName, int totalScore, int totalMaxScore, String rank){
        System.out.println(totalScore);
        System.out.print(playerName+ " peringkat "+ rank);
    }
    
}
