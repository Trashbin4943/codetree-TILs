import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p[]=new int[n];
        int margin=0;

        for (int i=1;i<=n;i++){
            p[i-1]=sc.nextInt();
        }

        for (int j=0;j<n;j++){
            for (int k=j+1;k<n;k++){
                if (p[j]>p[k]){
                    continue;
                }
                else {
                    int m=p[k]-p[j];
                    if (m>margin){
                        margin=m;
                    }
                }
            }
        }
        System.out.println(margin);
    }
}