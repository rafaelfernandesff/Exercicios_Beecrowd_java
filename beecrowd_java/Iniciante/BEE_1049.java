
import java.util.Scanner;

public class BEE_1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palavraUm, palavraDois, palavraTres;

        palavraUm = sc.nextLine();
        palavraDois = sc.nextLine();
        palavraTres = sc.nextLine();

        sc.close();

        switch (palavraUm) {
            case "vertebrado":
                switch (palavraDois) {
                    case "ave":
                        switch (palavraTres) {
                            case "carnivoro":
                                System.out.println("aguia");
                                break;
                            case "onivoro":
                                System.out.println("pomba");
                                break;
                        }
                        break;

                    case "mamifero":
                        switch (palavraTres) {
                            case "onivoro":
                                System.out.println("homem");
                                break;
                            case "herbivoro":
                                System.out.println("vaca");
                                break;
                        }
                        break;
                }
                break;

            case "invertebrado":
                switch (palavraDois) {
                    case "inseto":
                        switch (palavraTres) {
                            case "hematofago":
                                System.out.println("pulga");
                                break;
                            case "herbivoro":
                                System.out.println("lagarta");
                                break;
                        }
                        break;

                    case "anelideo":
                        switch (palavraTres) {
                            case "hematofago":
                                System.out.println("sanguessuga");
                                break;
                            case "onivoro":
                                System.out.println("minhoca");
                                break;
                        }
                        break;
                }
                break;
        }
    }
}
