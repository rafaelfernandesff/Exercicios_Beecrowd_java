import java.util.Scanner;

public class BEE_1004 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int a, b;

        a = ler.nextInt();
        b = ler.nextInt();

        System.out.printf("PROD = %d\n", (a * b));
        
        ler.close();
    }


}
