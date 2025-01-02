public class Main {
    public static void main(String[] args) {
        int cnt=0;
        for (int i=1; i<=10; i++) {
            if (i%2==0 || i%3==0 || i%5==0) {
                continue;
            }
            else {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}