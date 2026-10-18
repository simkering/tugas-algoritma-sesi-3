package level_3;
import java.util.Scanner;
public class multipication_grid {
    public static void main(String[] args) {
        Scanner imputan = new Scanner(System.in);
        System.out.print("imput nilai N: ");
        int N = imputan.nextInt();
        System.out.println("output: ");
        imputan.close();
        for (int i = 1; i<=N; i++) {
            for (int a =1; a <= N; a++) {
                System.out.print((i * a) + "\t");
            }
            System.out.println();
        }
    
    
    }

}
