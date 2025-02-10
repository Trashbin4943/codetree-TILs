import java.util.Scanner;

public class Main {

    public static void printHelloWorld(int n){
        for (int i=0;i<n;i++){
            System.out.println("HelloWorld");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printHelloWorld(n);
    }
}