package level_4;
import java.util.Scanner;
public class find_all_prime_numbers {
    public static void main(String[] args) {
        Scanner imputan = new Scanner(System.in);
        System.err.print("imput nilai N: ");
        int N = imputan.nextInt();
        System.out.print("output: ");
        imputan.close();
        for (int i=2; i<=N; i++) {
            boolean isPrime = true;
            for (int a=2; a * a <=i; a++) {
                if (i % a == 0) {
                    isPrime = false;
                    break;
                    
                }
            }
        if (isPrime) {
            System.out.print(i+" ");
            
        }

        }
        System.out.println();
    }

}
