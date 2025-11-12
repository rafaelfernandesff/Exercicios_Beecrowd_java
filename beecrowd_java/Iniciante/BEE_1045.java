/* import java.util.Scanner;

public class BEE_1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] entradas = sc.nextLine().replace(",", ".").split(" ");
        double a = Double.parseDouble(entradas[0]);
        double b = Double.parseDouble(entradas[1]);
        double c = Double.parseDouble(entradas[2]);

        // FIQUEI COM PREGUIÇA DE FAZER

      
        if (a == b && a == c){
            System.out.println("TRIANGULO EQUILATERO");
        } else if (a == b || a == c || b == c){
            System.out.println("TRIANGULO ISOSCELES");
        } else if (a * a < ((b * b) + (c * c))){
            System.out.println("TRIANGULO ACUTANGULO");
        } else if (a * a > ((b * b) + (c * c))){
            System.out.println("TRIANGULO OBTUSANGULO");
        } else if (a * a == ((b * b) + (c * c))){
            System.out.println("TRIANGULO RETANGULO");
        } else if (a >= (b + c)){
            System.out.println("NAO FORMA UM TRIANGULO");
        }

        sc.close(); 

    }
}
*/