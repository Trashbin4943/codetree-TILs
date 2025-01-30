import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int[] remn;
        remn= new int[b];
        int sumval=0;

        for (int i=1;i<=b;i++){
            remn[i-1]=0;
        }


        while (true){
            if (a<=1){
                break;
            }
            remn[a%b]++;
            a=a/b;
        }

        for (int i=1;i<=b;i++){
            System.out.println("나머지가"+" "+(i-1)+" "+remn[i-1]);
            sumval+=remn[i-1]*remn[i-1];
        }
        System.out.print(sumval);
    }
}