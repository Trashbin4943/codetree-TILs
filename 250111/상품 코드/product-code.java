import java.util.Scanner;

class Goods {
    String name;
    int code;

    public Goods(String name,int code) {
        this.name=name;
        this.code=code;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int code = sc.nextInt();

        Goods g1= new Goods("codetree",50);
        Goods g2= new Goods(name,code);

        System.out.println("product "+g1.code+" is "+g1.name);
        System.out.println("product "+g2.code+" is "+g2.name);
    }
}