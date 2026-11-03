import java.util.Scanner;

public class SimulasiALU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== SIMULASI ARITHMETIC LOGIC UNIT (ALU) =====");
        System.out.print("Masukkan Operand A (integer): ");
        int a = scanner.nextInt();
        System.out.print("Masukkan Operand B (integer): ");
        int b = scanner.nextInt();

        System.out.println("\nNilai Input:");
        System.out.printf("Operand A : %d (Biner: %s)\n", a, Integer.toBinaryString(a));
        System.out.printf("Operand B : %d (Biner: %s)\n", b, Integer.toBinaryString(b));

        System.out.println("\n--- Hasil Operasi ALU ---");
        // Operasi Aritmatika
        int add = a + b;
        int sub = a - b;

        // Operasi Logika Bitwise
        int and = a & b;
        int or  = a | b;
        int xor = a ^ b;

        tampilkanHasil("1. ADD (Penjumlahan)", add);
        tampilkanHasil("2. SUB (Pengurangan)", sub);
        tampilkanHasil("3. AND (Logika AND)", and);
        tampilkanHasil("4. OR  (Logika OR)", or);
        tampilkanHasil("5. XOR (Logika XOR)", xor);

        scanner.close();
    }

    private static void tampilkanHasil(String operasi, int hasil) {
        System.out.printf("%-22s -> Desimal: %-6d | Biner: %s\n", 
                          operasi, hasil, Integer.toBinaryString(hasil));
    }
}