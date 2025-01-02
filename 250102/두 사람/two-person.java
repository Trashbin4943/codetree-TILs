import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Aa = sc.nextInt();
        char Ag = sc.next().charAt(0);
        int Ba = sc.nextInt();
        char Bg = sc.next().charAt(0);


        if (Aa>=19 && Ag=='M' || Ba>=19 && Bg=='M') {
            System.out.println(1);
        }

        else {
            System.out.println(0);
        }

    }
}