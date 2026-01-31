import java.util.Scanner;

public class BEE_1101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt(); 
        
        while ((m != 0) && (n != 0)) {
            int menor = Math.min(m,n);
            int maior = Math.max(m,n);

            int soma = 0;

            for (int i = menor; i <= maior; i ++) {
                System.out.print(i + " ");
                soma += i;

                System.out.println("Sum=" + soma);
            }

            m = sc.nextInt();
            n = sc.nextInt();
            
        }



        sc.close();
    }

}
