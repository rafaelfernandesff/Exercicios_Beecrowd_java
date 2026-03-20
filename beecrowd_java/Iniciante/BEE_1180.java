import java.util.Scanner;

public class BEE_1180 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int posicao = 0;

        int tamanhoVetor = sc.nextInt();
        int [] vet = new int[tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i ++) {
            vet[i] = sc.nextInt();
        }

        int menorValor = vet[0];

        for (int i = 0; i < tamanhoVetor; i ++) {
            if (vet[i] < menorValor) {
                menorValor = vet[i];
                posicao = i;
            }
        }

        System.out.println("Menor valor: " + menorValor);
        System.out.println("Posicao: " + posicao);

        sc.close();
    }
}
