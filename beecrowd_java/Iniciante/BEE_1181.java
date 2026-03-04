import java.util.Scanner;
import java.util.Locale;

public class BEE_1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int l = sc.nextInt();
        sc.nextLine();
        char t = sc.next().charAt(0);
        double soma = 0.0;
        double media;
        
        double [][] vet = new double[12][12];

        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length; j++) {
                vet[i][j] = sc.nextDouble();
            }
        }
  

        for (int i = 0; i < vet.length; i ++) {
                soma += vet[l][i];
            }

        if (t == 'S') {
            System.out.printf("%.1f\n", soma);
        } else {
            media = soma / vet[l].length;
            System.out.printf("%.1f\n", media);
        }

        sc.close();
       
    }

}
