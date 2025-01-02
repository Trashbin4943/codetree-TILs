import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int least;

        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a<=b && a<=c) {
            least = a;
        }

        else if (b<=a && b<=c) {
            least = b;
        }

        else {
            least = c;
        }

        if (a==least) {
            System.out.print(1+" ");
        }
        else {
            System.out.print(0+" ");
        }

        if (a==b && b==c) {
            System.out.println(1);
        } 
        else {
            System.out.println(0);
        }

    }
}