import java.util.Scanner;
public class WujudBenda {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int suhu;
        suhu = key.nextInt();
        if(suhu >=0 && suhu <=100){
            System.out.println("berwujud cair");
        }else{
            System.out.println("berwujud non cair");
        }
    }
}
