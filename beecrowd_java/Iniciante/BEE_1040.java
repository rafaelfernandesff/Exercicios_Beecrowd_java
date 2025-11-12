import java.util.Locale;
import java.util.Scanner;

public class BEE_1040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double n1 =  sc.nextDouble();
        double n2 =  sc.nextDouble();
        double n3 =  sc.nextDouble();
        double n4 =  sc.nextDouble();
        double notaEx;

        double media = ((n1*2) + (n2*3) + (n3*4) + n4)/10;

        media = Math.floor(media * 10) / 10.0;
        double mediaFinal;

        if (media >= 7){

            System.out.printf("Media: %.1f\nAluno aprovado.\n", media);
        } else if (media < 5){

            System.out.printf("Media: %.1f\nAluno reprovado.\n", media);
        } else if(media >= 5 && media <= 6.9){
            notaEx = sc.nextDouble();
            mediaFinal = (notaEx + media) / 2;
            mediaFinal = Math.floor(mediaFinal*10)/10;

            if (mediaFinal >= 5){

                System.out.printf("Media: %.1f\nAluno em exame.\n", media);
                System.out.printf("Nota do exame: %.1f\nAluno aprovado.\n", notaEx);
                System.out.printf("Media final: %.1f\n", mediaFinal);
            }
            else {

                System.out.printf("Media: %.1f\nAluno em exame.\n", media);
                System.out.printf("Nota do exame: %.1f\nAluno reprovado.\n", notaEx);
                System.out.printf("Media final: %.1f\n", mediaFinal);

            }
        }

        sc.close();

    }
    
}
