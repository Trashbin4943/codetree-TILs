import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int cnt =0;
        for (int i=0;i<5;i++) {
            int num = s.nextInt();
            if (num%2==0) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}