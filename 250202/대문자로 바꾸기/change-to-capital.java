import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i=0;i<5;i++){
            for(int j=0;j<3;j++){
                char input = sc.next().charAt(0);
                int asc = (int)input;
                if ((97<=asc)&&(asc<=122)){
                    System.out.print((char)(asc-32)+" ");
                }
            }
            System.out.println();
        }
    }
}