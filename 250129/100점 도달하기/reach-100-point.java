import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();

        for (int i=num; i<=100; i++) {
            if (i<60)
                System.out.print("F ");
            else if (i<70)
                System.out.print("D ");
            else if (i<80)
                System.out.print("C ");
            else if (i<90)
                System.out.print("B ");
            else
                System.out.print("A ");
        }
    }
}