import java.util.Scanner;

public class BEE_1019{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int entrada = sc.nextInt();

        int segundos = entrada%60;
        int minutos = ((entrada - segundos)/60)%60;
        int horas = (entrada - 60*minutos - segundos)/3600;

        System.out.println(horas+":"+minutos+":"+segundos);

        sc.close();
    }
}