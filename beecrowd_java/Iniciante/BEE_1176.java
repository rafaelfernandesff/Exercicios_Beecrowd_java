import java.util.Scanner;

public class BEE_1176 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long [] fibonaci = new long[60];
        fibonaci[0] = 0;
        fibonaci[1] = 1;

        for(int i = 2;i < 60; i++){
            fibonaci[i] = fibonaci[i - 1] + fibonaci[i - 2];
        }

        
        int t = sc.nextInt();
        int [] vetindice = new int[t];

        for (int i = 0;i < t; i++){
            vetindice[i] = sc.nextInt();
        }

        sc.close();

        for (int i = 0; i < t; i++){
            System.out.println("Fib(" + vetindice[i] + ") = " + fibonaci[vetindice[i]]);
        }

    }
}
