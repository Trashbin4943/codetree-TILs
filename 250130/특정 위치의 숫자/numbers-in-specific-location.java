import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a[]=new int[10];
        for (int i=1;i<=10;i++){
            a[i-1]=sc.nextInt();
        }

        System.out.println(a[2]+a[4]+a[9]);
    }
}