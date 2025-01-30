import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] li = new int[10];
        li[0]=s.nextInt();
        li[1]=s.nextInt();

        for (int i=2;i<10;i++){
            li[i]=2*li[i-2]+li[i-1];
        }

        for (int i=0;i<10;i++){
            System.out.print(li[i]+" ");
        }
    }
}