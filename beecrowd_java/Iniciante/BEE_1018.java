import java.util.Scanner;


public class BEE_1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada;
        entrada = sc.nextInt();


        int notas100 = entrada / 100;
        int notas50 = ((entrada - 100*notas100) % 100) / 50;
        int notas20 = ((entrada - 100*notas100 - 50*notas50) % 50) / 20;
        int notas10 = ((entrada - 100*notas100 - 50*notas50 - 20*notas20) % 20) / 10;
        int notas5 = ((entrada - 100*notas100 - 50*notas50 - 20*notas20 - 10*notas10) % 10 ) / 5;
        int notas2 = ((entrada - 100*notas100 - 50*notas50 - 20*notas20 - 10*notas10 - 5*notas5) % 5) / 2;
        int notas1 = ((entrada - 100*notas100 - 50*notas50 - 20*notas20 - 10*notas10 - 5*notas5 - 2*notas2) % 2) / 1;

        System.out.println(entrada);
        System.out.printf("%d nota(s) de R$ 100,00\n", (notas100));
        System.out.printf("%d nota(s) de R$ 50,00\n", (notas50));
        System.out.printf("%d nota(s) de R$ 20,00\n", (notas20));
        System.out.printf("%d nota(s) de R$ 10,00\n", (notas10));
        System.out.printf("%d nota(s) de R$ 5,00\n", (notas5));
        System.out.printf("%d nota(s) de R$ 2,00\n", (notas2));
        System.out.printf("%d nota(s) de R$ 1,00\n", (notas1));


        sc.close();

    }



}
