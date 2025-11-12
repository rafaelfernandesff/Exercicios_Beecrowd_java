import java.util.Locale;
import java.util.Scanner;

public class BEE_1010 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int int2a = sc.nextInt();
        double decimal1 = sc.nextInt();

        String[] linha2 = sc.nextLine().replace(",", ".").split(" ");
        int int2b = Integer.parseInt(linha2[1]);
        double decimal2 = Double.parseDouble(linha2[2]);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", (int2a * decimal1 + int2b * decimal2));

        sc.close();

    }

}
