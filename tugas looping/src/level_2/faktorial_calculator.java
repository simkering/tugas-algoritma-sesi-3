package level_2;
import java.util.Scanner;
public class faktorial_calculator {
    public static void main(String[] args) {
        Scanner imputan = new Scanner(System.in);
        System.err.print("imput nilai N: ");
        int N = imputan.nextInt();
        imputan.close();
        if (N<0) {
            System.out.println("faktorial hanya untuk angka bulat non-negatif");
        } else {
            long faktorial = 1;
            for (int i=1; i<= N; i++) {
                faktorial = faktorial * i;
            }
            System.out.println("hasil: " + N + "!" + "=" + faktorial);
        }
    }

}
