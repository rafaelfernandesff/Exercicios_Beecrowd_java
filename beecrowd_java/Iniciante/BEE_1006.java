import java.util.Scanner;

public class BEE_1006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        System.out.printf("MEDIA = %.1f\n", ((a * 2 + b * 3 + c * 5) / 10));

        sc.close();

    }

}
