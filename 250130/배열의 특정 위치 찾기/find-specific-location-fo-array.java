import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int sum2=0;
        int sum3=0;

        for (int i=1;i<=10;i++){
            a[i-1]=sc.nextInt();
        }

        for (int i=1;i<=10;i++){
            if (i%2==0){
                sum2+=a[i-1];
            }
            if (i%3==0){
                sum3+=a[i-1];
            }
        }

        double avg=((sum3/3)*10)/10.0;
        System.out.print(sum2+" "+avg);

    }
}