import java.util.Locale;
import java.util.Scanner;

public class BEE_1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int MaiorAB = (a + b + Math.abs(a-b)) / 2;
        int Maior = (MaiorAB + c + Math.abs(MaiorAB - c)) / 2;

        System.out.printf("%d eh o maior\n", (Maior));

        sc.close();

    }

}
