import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int cnt=sc.nextInt();
        
        if (num<0) {
            System.out.print(0);
        }
        else{
            for (int i=0; i<cnt; i++) {
                System.out.print(num);
            }
        }
    }
}