import java.util.Scanner;


class Logininfo {
        String ID;
        int Level;

        public Logininfo() {
            this.ID="codetree";
            this.Level=10;
        }

        public Logininfo (String ID, int Level) {
            this.ID=ID;
            this.Level=Level;
        }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ID = sc.next();
        int Level = sc.nextInt();

        Logininfo User1 = new Logininfo();
        System.out.println("user "+ User1.ID +" lv "+ User1.Level);

        Logininfo User2 = new Logininfo(ID, Level);
        System.out.println("user "+User2.ID+" lv "+User2.Level);

    }
}