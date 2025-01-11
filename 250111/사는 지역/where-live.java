import java.util.Scanner;

class Ppl{
    String name;
    String address;
    String region;

    public Ppl(String name, String address, String region){
        this.name=name;
        this.address=address;
        this.region=region;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Ppl [] p = new Ppl[n];

        for (int i=0; i<n; i++) {
            String name = sc.next();
            String address = sc.next();
            String region = sc.next();
            p[i]=new Ppl(name,address,region);
        }
        
        String pn=p[n-1].name;
        String pa=p[n-1].address;
        String pr=p[n-1].region;

        System.out.println("name "+pn);
        System.out.println("addr "+pa);
        System.out.println("city "+pr);
    }
}