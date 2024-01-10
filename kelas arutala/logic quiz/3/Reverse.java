import java.util.Scanner;


public class Reverse {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String input = key.nextLine();
        
        char[] array = input.toCharArray();
        int end = array.length-1;
        for(int i = 0; i <end; i++, end--){
            char temp = array[i];
            array[i] = array[end];
            array[end] = temp;
        }
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i]);
        }
    }
}
