import java.util.Scanner;

public class BEE_1008 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        double c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextDouble();


        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n", a, (b * c) );

        sc.close();
    }
}
