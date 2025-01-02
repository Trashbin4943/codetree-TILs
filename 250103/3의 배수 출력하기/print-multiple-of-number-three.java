import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i=3;

        Scanner s = new Scanner (System.in);
        int n=s.nextInt();

        while (i<=n) {
            System.out.print(i+" ");
            i+=3;
        }

    }
}