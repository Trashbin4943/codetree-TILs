import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Am= sc.nextInt();
        int Ae= sc.nextInt();
        int Bm= sc.nextInt();
        int Be= sc.nextInt();

        if (Am<Bm || (Am==Bm && Ae<Be)) {
            System.out.println("B");
        }

        else {
            System.out.println("A");
        }
    }
}