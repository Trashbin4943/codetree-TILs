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
            if (a==0){
                break;
            }
            a=a/b;
            remn[a%b]+=1;
        }

        for (int i=1;i<=b;i++){
            sumval+=remn[i-1]*remn[i-1];
        }
        System.out.print(sumval);
    }
}