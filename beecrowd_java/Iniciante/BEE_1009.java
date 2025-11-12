import java.util.Scanner;

public class BEE_1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        double b, c;

        b = sc.nextDouble();
        c = sc.nextDouble();

        System.out.printf("TOTAL = R$ %.2f\n", (b + c * 0.15));


        sc.close();
    }

}
