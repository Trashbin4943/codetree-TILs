import java.util.Scanner;

class Spy {
    String secretCode;
    char meetingpoint;
    int time;

    public Spy(String secretCode, char meetingpoint, int time) {
        this.secretCode = secretCode;
        this.meetingpoint = meetingpoint;
        this.time=time;
    }
};


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String scode;
        char mpoint;
        int time;

        scode=sc.next();
        mpoint=sc.next().charAt(0);
        time=sc.nextInt();

        Spy sp = new Spy(scode,mpoint,time);

        System.out.println("secret code : " + sp.secretCode);
        System.out.println("meeting point : " + sp.meetingpoint);
        System.out.println("time : " + sp.time);
    }

}    

