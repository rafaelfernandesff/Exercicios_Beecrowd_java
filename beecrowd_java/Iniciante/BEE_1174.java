import java.util.Locale;
import java.util.Scanner;

public class BEE_1174 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int indice = 0;
        double[] vet = new double[100];
        for (int i = 0; i < vet.length; i ++) {
            vet[i] = sc.nextDouble();
        }

        while (indice < vet.length) {
            if (vet[indice] <= 10) {
                System.out.printf("A[%d] = %.1f\n", indice, vet[indice]);
            }

            indice ++;
        }


        sc.close();
    }

}
