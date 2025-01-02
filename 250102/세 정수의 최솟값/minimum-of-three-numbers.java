import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int least=0;
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a<b && a<c) {
            least = a;
        }

        else if (b<a && b<c) {
            least = b;
        }

        else if (c<a && c<b) {
            least = c;
        }

        System.out.println(least);
    }
}