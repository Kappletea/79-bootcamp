import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int x, y, z;
        x = key.nextInt();
        y = key.nextInt();
        z = key.nextInt();
        int[] array = {x,y,z};

        if ((x >= -300 && x <= 300) || (y >= -300 && y <= 300) || (z >= -300 && z <= 300)) {
            for(int i = 0; i<array.length;i++){
                if(array[array.length-1]>array[i]){
                    int temp = array[i];
                    array[i] = array[array.length-1];
                    array[array.length-1] = temp;
                }
            }
            for(int i = 0; i<array.length; i++){
                System.out.print(array[i] + " ");
            }
        }
    }
}
