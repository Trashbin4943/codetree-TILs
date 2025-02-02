import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] num = new int[n];

        for (int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }

        for (int j=1;j<=q;j++){
            int questcode = sc.nextInt();

            if (questcode==1){
                int idx = sc.nextInt();
                System.out.println(num[idx-1]);
            }

            else if (questcode==2){
                int b = sc.nextInt();
                int id=0;

                for (int i=0;i<n;i++){
                    if (num[i]==b){
                        id=i;
                        break;
                    }
                }

                if (id==0){
                    System.out.println(id);
                }

                else {
                    System.out.println(id+1);
                }

            }

            else if (questcode==3){
                int s = sc.nextInt();
                int e = sc.nextInt();

                for (int i=s;i<=e;i++){
                    System.out.print(num[i-1]+" ");
                }
                System.out.println();
            }

        }
    }
}