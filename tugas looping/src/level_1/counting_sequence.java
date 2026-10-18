package level_1;
import java.util.Scanner;

public class counting_sequence {
    public static void main(String[] args) {
        Scanner imputan = new Scanner(System.in);
        System.err.print("masukan nilai N: ");
        int N = imputan.nextInt();
        int H = N + 1;
        imputan.close();
        for (int i=1; i<= N; i++) {
            H = H - 1;
            System.out.print(H + " ");
        }
        System.out.println();
        System.out.println("start!!!");
    } 

}
