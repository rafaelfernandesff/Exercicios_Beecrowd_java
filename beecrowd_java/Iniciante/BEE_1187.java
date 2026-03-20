import java.util.Locale;
import java.util.Scanner;

public class BEE_1187 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double [][] mat = new double[12][12];
        double soma = 0;
        double cont = 0;

        char operacao = sc.next().charAt(0);
        for (int i = 0; i < mat.length; i ++) {
            for (int j = 0; j < mat.length; j ++) {
                mat[i][j] = sc.nextDouble();

                if (j > i && j < (mat.length - 1 - i) ) {
                    soma += mat[i][j];
                    cont ++;
                }
            }
        }

        switch (operacao) {
            case 'S':
                System.out.printf("%.1f\n", soma);
                break;
        
            case 'M':
                System.out.printf("%.1f\n", soma / cont);
                break;
        }

        sc.close();
    }

}
