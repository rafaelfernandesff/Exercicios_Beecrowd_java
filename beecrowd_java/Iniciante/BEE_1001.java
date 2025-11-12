import java.util.Scanner;

public class BEE_1001 {
    public static void main(String[] arg){

        Scanner ler = new Scanner(System.in);
        int x, y;
       
        x = ler.nextInt();
        y = ler.nextInt();

        System.out.printf( "X =  %d\n", (x + y));

        ler.close();

    }

}
