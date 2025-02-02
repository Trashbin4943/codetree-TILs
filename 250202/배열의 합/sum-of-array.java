import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] sq=new int[4][4];
        int sum;

        for (int i=0;i<4;i++){
            sum=0;
            for (int j=0;j<4;j++){
                sq[i][j]=sc.nextInt();
                sum+=sq[i][j];
            }
            System.out.println(sum);
        }
    }
}