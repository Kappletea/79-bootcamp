import java.util.Scanner;

public class Alay {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String input = key.nextLine();
        char[] huruf = new char[50];

        huruf = input.toCharArray();
        for(int i=0; i<huruf.length; i++){
           char kata = huruf[i];
            if(kata == 'a' || kata == 'A'){
                huruf[i]='4';
            }else if(kata == 'I' || kata == 'i'){
                huruf[i]='1';
            }else if(kata == 'Z' || kata == 'z'){
                huruf[i]='2';
            }else if(kata == 'E' || kata == 'e'){
                huruf[i]='3';
            }else if(kata == 'G' || kata == 'g'){
                huruf[i]='6';
            }else if(kata == 'J' || kata == 'j'){
                huruf[i]='7';
            }else if(kata == 'B' || kata == 'b'){
                huruf[i]='8';
            }
        }
        
        for(int i = 0; i< huruf.length;i++){
            System.out.print(huruf[i]);
        }
    }
}
