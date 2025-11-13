import java.util.Locale;
import java.util.Scanner;

public class BEE_1178 {
    public static void main(String[] args) {
     Locale.setDefault(Locale.US);
     Scanner sc = new Scanner(System.in);
     double [] v = new double[100];
     
     double x = sc.nextDouble();

     v[0] = x;

     for (int i = 1; i < v.length; i++){
        v[i] = v[i - 1] / 2;
     }

     for (int i = 0; i < v.length; i++){
        System.out.printf("N[%d] = %.4f\n", i, v[i]);
     }

     sc.close();
    }
}
