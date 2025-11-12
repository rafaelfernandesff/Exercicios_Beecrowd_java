import java.util.Scanner;

public class BEE_1002 {

    public static void main(String[] arg){

        double n = 3.14159;
        double r;
        Scanner ler = new Scanner(System.in);
        r = ler.nextDouble();

        System.out.printf("A=%.4f\n", (n * r * r));


        ler.close();


        
    }

}
