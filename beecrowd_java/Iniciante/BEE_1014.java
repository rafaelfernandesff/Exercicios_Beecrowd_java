import java.util.Scanner;

public class BEE_1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distancia = sc.nextInt();
        double combustivelgasto =  sc.nextDouble();

        System.out.printf("%.3f km/l\n", (distancia/combustivelgasto) );

        sc.close();

    }
}
