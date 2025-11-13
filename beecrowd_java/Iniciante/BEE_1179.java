import java.util.Scanner;

public class BEE_1179 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int [] par = new int[5];
     int [] impar = new int[5];
     int contpar = 0, contimpar = 0;

     for(int i = 0; i < 15;i ++){
        int x = sc.nextInt();

        if (x % 2 == 0) {
            par[contpar] = x;
            contpar ++;
        }
        else{
            impar[contimpar] = x;
            contimpar ++;
        }

        if (contpar == 5){
            for (int j = 0; j < 5; j++){
                System.out.printf("par[%d] = %d\n", j, par[j]);
            }
            contpar = 0;
        }

        if (contimpar == 5){
            for (int j = 0; j < 5; j++){
                System.out.printf("impar[%d] = %d\n", j, impar[j]);
            }
            contimpar = 0;    
        }
     }

     for (int j = 0; j < contimpar; j++){
        System.out.printf("impar[%d] = %d\n", j, impar[j]);
     }


     for (int j = 0; j < contpar; j++){
        System.out.printf("par[%d] = %d\n", j, par[j]);
     }

     sc.close();
    }
}
