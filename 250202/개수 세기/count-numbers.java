import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] lang = new int[n];
        int cnt = 0;

        for (int i=0;i<n;i++){
            lang[i]=sc.nextInt();
        }

        for (int j=0;j<n;j++){
            if (lang[j]==m){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}