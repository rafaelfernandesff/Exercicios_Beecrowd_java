import java.util.Locale;
import java.util.Scanner;

public class BEE_1078 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= 10; i ++) {
            System.out.println(i + " x " + n + " = " + (n * i));
        }


    }

}
