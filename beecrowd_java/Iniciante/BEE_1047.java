import java.util.Scanner;

public class BEE_1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horaInicial, minutoInicial, horaFinal, minutoFinal;
        
        horaInicial = sc.nextInt();
        minutoInicial = sc.nextInt();
        horaFinal = sc.nextInt();
        minutoFinal = sc.nextInt();

        sc.close();

        int inicio = horaInicial * 60 + minutoInicial;
        int fim = horaFinal * 60 + minutoFinal;
        int duracao = fim - inicio;

        if (duracao <= 0) {
            duracao += 24 * 60;
        }

        int horas = duracao / 60;
        int minutos = duracao % 60;

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horas, minutos);
    }
}
