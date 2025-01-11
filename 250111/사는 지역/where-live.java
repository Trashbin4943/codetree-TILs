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
        
        int lastIdx=0;
        for (int i=0; i<n; i++) {
            if (p[i].name.compareTo(p[lastIdx].name)>0) {
                lastIdx=i;
            }
        }
        
        System.out.println("name "+p[lastIdx].name);
        System.out.println("addr "+p[lastIdx].address);
        System.out.println("city "+p[lastIdx].region);
    }
}