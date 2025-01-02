import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int p= sc.nextInt();

        int g;
        g = p==100?0:1;

        if (g==0) {
            System.out.println("pass");
        }
        else {
            System.out.println("failure");
        }
    }
}