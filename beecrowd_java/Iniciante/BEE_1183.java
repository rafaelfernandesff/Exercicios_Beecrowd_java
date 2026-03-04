import java.util.Scanner;
import java.util.Locale;

public class BEE_1183 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        char c = sc.next().charAt(0);
        double[][] mat = new double[12][12];
        double soma = 0.0;
        double media;
        int cont = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < mat.length; i ++) {
            for (int j = 0; j < mat.length; j ++) {
                if (i < j) {
                    soma += mat[i][j];
                    cont ++;
                }
            }
        }

        if (c == 'S') {
            System.out.printf("%.1f\n", soma);
        } else {
            media = soma / cont;
            System.out.printf("%.1f\n", media);
        }


        sc.close();

    } 
}
