package level_4;
import java.util.Scanner;
public class Pascal_Triangle {
    public static void main(String[] args) {
        Scanner imputan = new Scanner(System.in);
        System.out.print("imput nilai N: ");
        int N = imputan.nextInt();
        int[][] pascal = new int[N][N];
        System.out.println("output: ");
        imputan.close();
        for (int i=0; i<N; i++) {
            for (int a = 0; a<=i; a++){
                if (a == 0 || a == i) {
                    pascal [i][a] = 1;
                } else {
                    pascal [i][a] = pascal [i - 1][a -1] + pascal [i - 1][a];
                }
                System.out.print(pascal[i][a] + " ");
            }
            System.out.println();
        }
    }

}
