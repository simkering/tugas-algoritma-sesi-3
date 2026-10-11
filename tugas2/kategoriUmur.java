package tugas2;
import java.util.Scanner;
public class kategoriUmur {
    public static void main(String[] args) {
        Scanner imputan = new Scanner(System.in);
        System.out.println("berapa umur anda? ");
        double umur = imputan.nextInt();
        imputan.close();
        if (umur <= 5) {
            System.out.println("balita ");
        } else if (umur > 5 && umur <= 12) {
            System.out.println("anak ");
        } else if (umur > 12 && umur <=17) {
            System.out.println("remaja");
        } else if (umur > 17 && umur <= 59) {
            System.out.println("dewasa ");
        } else {
            System.out.println("lansia ");
        }
    }

}
