import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int cnt3=0;
        int cnt5=0;

        for (int i=1; i<=10; i++) {
            int num = sc.nextInt();
            if (num%3==0) {
                cnt3+=1;
            }
            if (num%5==0) {
                cnt5+=1;
            }
        }
        System.out.print(cnt3+" "+cnt5);
    }
}