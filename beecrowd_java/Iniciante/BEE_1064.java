import java.util.Locale;
import java.util.Scanner;

public class BEE_1064 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double [] entradas = new double[6];
        double valoPositivo = 0;
        int contPosi = 0;

        for (int i = 0; i < entradas.length; i ++){
            entradas[i] = sc.nextDouble();
            if (entradas[i] > 0) {
                valoPositivo += entradas[i];
                contPosi ++;
            }
        }

        sc.close();

        System.out.println(contPosi + " valores positivos");
        System.out.printf("%.1f\n", valoPositivo / contPosi);
    }
}
