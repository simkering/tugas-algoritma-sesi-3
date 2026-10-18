package level_2;
import java.util.Scanner;
public class count_and_sum_of_digits {
    public static void main(String[] args) {
        Scanner imputan = new Scanner(System.in);
        System.out.print("imput nilai N: ");
        long N = imputan.nextLong();
        long temp = Math.abs(N);
        int count = 0;
        long sum = 0;
        imputan.close();
        if (temp == 0) {
            count = 1;
            sum = 0;
        } else {
            while (temp > 0) {
                long digit = temp % 10;
                sum = sum + digit;
                count++;
                temp = temp / 10;
                
            }

        }
        System.out.println("output; ");
        System.out.println("number of digit:" + count);
        System.out.println("sum of digit: " + sum);

    }

}
