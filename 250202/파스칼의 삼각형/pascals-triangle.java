import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] s = new int[15][15];
        int n = sc.nextInt();

        for (int i=0;i<n;i++){
            s[i][0]=1;
            s[i][i]=1;
        }

        for (int i=1; i<n; i++){
            for (int j=1; j<n; j++){
                s[i][j]=s[i-1][j-1]+s[i-1][j];
            }
        }

        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print(s[i][j]+" ");
            }
            System.out.println();
        } 
    }
}