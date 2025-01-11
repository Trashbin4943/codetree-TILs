import java.util.Scanner;

class Disassemble {
    String code;
    char color;
    int second;

    public Disassemble(String code, char color, int second) {
        this.code=code;
        this.color=color;
        this.second=second;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code=sc.next();
        char color=sc.next().charAt(0);
        int second=sc.nextInt();
        
        Disassemble dis = new Disassemble(code,color,second);
        
        System.out.println("code : "+ dis.code);
        System.out.println("color : "+ dis.color);
        System.out.println("second : "+ dis.second);
    }
}