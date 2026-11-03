import java.util.Scanner;

public class KalkulatorAritmatika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== KALKULATOR ARITMATIKA =====");
        
        System.out.print("Masukkan bilangan pertama : ");
        double bil1 = scanner.nextDouble();
        
        System.out.print("Masukkan bilangan kedua : ");
        double bil2 = scanner.nextDouble();

        System.out.println("\nPilih operasi:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Modulus");

        System.out.print("\nPilihan: ");
        int pilihan = scanner.nextInt();

        System.out.println();
        switch (pilihan) {
            case 1:
                System.out.println("Hasil: " + formatHasil(bil1 + bil2));
                break;
            case 2:
                System.out.println("Hasil: " + formatHasil(bil1 - bil2));
                break;
            case 3:
                System.out.println("Hasil: " + formatHasil(bil1 * bil2));
                break;
            case 4:
                if (bil2 != 0) {
                    System.out.println("Hasil: " + formatHasil(bil1 / bil2));
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak dapat dilakukan!");
                }
                break;
            case 5:
                if (bil2 != 0) {
                    System.out.println("Hasil: " + formatHasil(bil1 % bil2));
                } else {
                    System.out.println("Error: Modulus dengan nol tidak dapat dilakukan!");
                }
                break;
            default:
                System.out.println("Error: Pilihan operasi tidak valid!");
        }

        scanner.close();
    }

    // Format output agar bilangan bulat tidak memunculkan .0 di belakangnya
    private static String formatHasil(double val) {
        if (val == (long) val) {
            return String.format("%d", (long) val);
        } else {
            return String.format("%s", val);
        }
    }
}