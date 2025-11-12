import java.util.Locale;
import java.util.Scanner;

public class BEE_1012{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        Locale.setDefault(Locale.US); 
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double pi = 3.14159;


        System.out.printf("TRIANGULO: %.3f\n", (a * c / 2));
        System.out.printf("CIRCULO: %.3f\n", (pi * c * c));
        System.out.printf("TRAPEZIO: %.3f\n",((a + b) * c / 2));
        System.out.printf("QUADRADO: %.3f\n",(b * b));
        System.out.printf("RETANGULO: %.3f\n",(a * b));


        sc.close();




    }


}