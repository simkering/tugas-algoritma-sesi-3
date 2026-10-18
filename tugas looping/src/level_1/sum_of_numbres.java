package level_1;
import java.util.Scanner;
public class sum_of_numbres {
    public static void main(String[] args) {
        Scanner imputan = new Scanner(System.in);
        System.out.print("masukan nilai N: ");
        int N = imputan.nextInt();
        int hasil = 0;
        imputan.close();
        for (int i = 1; i <= N; i++) {
            hasil = hasil + i;

        }
        System.out.print("hasil= " + hasil);
    }

}
