import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cnt=0;

        for (int i=1;i<=10;i++) {
            int num = s.nextInt();
            if (num%2==1) {
                cnt+=1;
            }
        }

        System.out.print(cnt);
    }
}

