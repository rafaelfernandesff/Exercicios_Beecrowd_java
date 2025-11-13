import java.util.Scanner;

public class BEE_1177 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] n = new int[1000];
        int t = sc.nextInt();
        sc.close();
        
        for(int i = 0;i < n.length; i++){
            n[i] = i % t;
        }


        for(int i = 0; i < n.length; i++){
            System.out.println("N[" + i +"] = " + n[i]);
        }
    }
}
