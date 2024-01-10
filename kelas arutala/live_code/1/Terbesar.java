import java.util.Scanner;

public class Terbesar {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int x,y,z;
        x = key.nextInt();
        y = key.nextInt();
        z = key.nextInt();

        
        if((x>=-30 && x<= 30) || (y>=-30 && y<= 30) ||(z>=-30 && z<= 30)){
            if(x > y && x > z){
                System.out.println(x);
            }else if(y > x && y > z){
                System.out.println(y);
            } else{
                System.out.println(z);
            }
        }else{
            System.out.println("out of bound");
        }
    }
}
