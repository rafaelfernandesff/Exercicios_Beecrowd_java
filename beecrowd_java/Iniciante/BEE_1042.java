import java.util.Scanner;
import java.util.Arrays;

public class BEE_1042{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] entradas = sc.nextLine().split(" ");
        int[] numeros = new int[entradas.length];

        for (int i = 0; i < entradas.length; i++){
           numeros[i] = Integer.parseInt(entradas[i]);
        }
        
        int[] original = Arrays.copyOf(numeros, numeros.length);

        Arrays.sort(numeros);

        for(int n : numeros){
            System.out.println(n);
        }

        System.out.println("");

         for(int n : original){
            System.out.println(n);
        }

        sc.close();
    }
}