import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt=0;
        int sum=0;

        for (int i=a; i<=b; i++){
            if (i%5==0 || i%7==0) {
                sum+=i;
                cnt++;
            }
        }
        double avv = (double)sum/cnt;
        System.out.print(sum+" ");
        System.out.print(Math.round(avv*10)/10.0);
        
    }
}