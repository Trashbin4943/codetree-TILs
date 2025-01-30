import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int clas =0;
        int hall =0;
        int toil =0;

        for (int i=0; i<=n; i++){
            if (i==0){
                continue;
            }
            else if (i%12==0){
                toil+=1;
            }
            else if (i%3==0) {
                hall+=1;
            }
            else if (i%2==0) {
                clas+=1;
            }
        }
        System.out.print(clas+" "+hall+" "+toil);
    }
}