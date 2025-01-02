import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        if (m>=3000) {
            System.out.println("book");
        }

        else if (m>=1000) {
            System.out.println("mask");     
        }

        else if (m>=500) {
            System.out.println("pen");
        }
        else {
            System.out.println("no");
        }
    }
}