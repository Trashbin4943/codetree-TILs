import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        for (int i=a;i<=b;i+=2) {
            System.out.print(i+" ");
        }
    }
}