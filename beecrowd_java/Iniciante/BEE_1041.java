import java.util.Locale;
import java.util.Scanner;

public class BEE_1041 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double cordX = sc.nextDouble();
        double cordY = sc.nextDouble();

        if (cordX > 0 && cordY > 0) {
            System.out.println("Q1");
        } else if (cordX < 0 && cordY > 0){
            System.out.println("Q2");
        } else if (cordX < 0 && cordY < 0){
            System.out.println("Q3");
        } else if (cordX > 0 && cordY < 0){
            System.out.println("Q4");
        } else if (cordX == 0 && cordY == 0) {
            System.out.println("Origem");
        } else if (cordX == 0 && cordY != 0){
            System.out.println("Eixo Y");
        } else if (cordX != 0 && cordY == 0){
            System.out.println("Eixo X");
        }

        sc.close();

    }
}
