import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = new char[]{'L','E','B','R','O','S'};
        int idx = -1;
        char f = sc.next().charAt(0);

        for (int i=0;i<6;i++){
            if (s[i]==f) {
                idx=i;
            }
        }

        if (idx==-1) {
            System.out.println("None");
        }
        else {
            System.out.println(idx);
        }
    }
}