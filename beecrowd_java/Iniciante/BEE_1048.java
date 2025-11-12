import java.util.Scanner;
import java.util.Locale;

public class BEE_1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        double reajuste = 0;
        int percentual = 0;

        double salario = sc.nextDouble();

        if (salario >= 0 && salario <= 400.00) {
            reajuste += 0.15 * salario;
            salario += reajuste;
            percentual += 15;
        } else if (salario >= 400.01 && salario <= 800.00) {
            reajuste += 0.12 * salario;
            salario += reajuste;
            percentual += 12;
        } else if (salario >= 800.01 && salario <= 1200.00) {
            reajuste += 0.10 * salario;
            salario += reajuste;
            percentual += 10;
        }   else if (salario >= 1200.01 && salario <= 2000.00) {
            reajuste += 0.07 * salario;
            salario += reajuste;
            percentual += 7;
        } else {
            reajuste += 0.04 * salario;
            salario += reajuste;
            percentual += 4;
        }

        System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %d %%\n", salario, reajuste, percentual);

        sc.close();
    }
}
