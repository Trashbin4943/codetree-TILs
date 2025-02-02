import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] sq = new int[10][10];
        int n = sc.nextInt();

        for (int i=0;i<n;i++){
            sq[i][0]=1;
            sq[0][i]=1;
        }

        for (int i=1; i<n; i++) {
            for (int j=1; j<n; j++) {
                sq[i][j]=sq[i][j-1]+sq[i-1][j]+sq[i-1][j-1];
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(sq[i][j]+" ");
            }
            System.out.println();
        }
    }
}