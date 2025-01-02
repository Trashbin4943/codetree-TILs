public class Main {
    public static void main(String[] args) {
        int cnt=0;
        for (int i=1; i<=10; i++) {
            if (i==1 || i==7) {
                cnt++;
            }
            else {
                continue;
            }
        }
        System.out.print(cnt);
    }
}