import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 5; // Minimal 5 data mahasiswa

        String[] nama = new String[n];
        double[] tugas = new double[n];
        double[] uts = new double[n];
        double[] uas = new double[n];
        double[] total = new double[n];
        double[] rataRata = new double[n];

        System.out.println("===== INPUT DATA NILAI MAHASISWA =====");
        for (int i = 0; i < n; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1));
            System.out.print("Nama  : ");
            nama[i] = scanner.nextLine();
            System.out.print("Tugas : ");
            tugas[i] = scanner.nextDouble();
            System.out.print("UTS   : ");
            uts[i] = scanner.nextDouble();
            System.out.print("UAS   : ");
            uas[i] = scanner.nextDouble();
            scanner.nextLine(); // membersihkan buffer

            // Hitung nilai total dan rata-rata
            total[i] = tugas[i] + uts[i] + uas[i];
            rataRata[i] = total[i] / 3.0;
        }

        // Cari Nilai Maksimum dan Minimum berdasarkan nilai total
        double maxTotal = total[0];
        double minTotal = total[0];
        String namaMax = nama[0];
        String namaMin = nama[0];

        double sumTugas = 0, sumUTS = 0, sumUAS = 0, sumTotalKeseluruhan = 0;

        for (int i = 0; i < n; i++) {
            if (total[i] > maxTotal) {
                maxTotal = total[i];
                namaMax = nama[i];
            }
            if (total[i] < minTotal) {
                minTotal = total[i];
                namaMin = nama[i];
            }
            sumTugas += tugas[i];
            sumUTS += uts[i];
            sumUAS += uas[i];
            sumTotalKeseluruhan += total[i];
        }

        // Tampilkan Tabel Rekap
        System.out.println("\n==========================================================================");
        System.out.printf("%-15s %-10s %-10s %-10s %-12s %-10s\n", "Nama", "Tugas", "UTS", "UAS", "Total", "Rata-rata");
        System.out.println("==========================================================================");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-15s %-10.2f %-10.2f %-10.2f %-12.2f %-10.2f\n", 
                              nama[i], tugas[i], uts[i], uas[i], total[i], rataRata[i]);
        }
        System.out.println("==========================================================================");

        // Statistik
        System.out.println("\n--- STATISTIK KELAS ---");
        System.out.printf("Nilai Total Tertinggi : %.2f (%s)\n", maxTotal, namaMax);
        System.out.printf("Nilai Total Terendah  : %.2f (%s)\n", minTotal, namaMin);
        System.out.printf("Rata-rata Kelas       : %.2f\n", (sumTotalKeseluruhan / (n * 3.0)));

        // Persentase Komponen terhadap akumulasi nilai
        System.out.println("\n--- PERSENTASE KONTRIBUSI SETIAP KOMPONEN ---");
        System.out.printf("Kontribusi Tugas : %.2f%%\n", (sumTugas / sumTotalKeseluruhan) * 100);
        System.out.printf("Kontribusi UTS   : %.2f%%\n", (sumUTS / sumTotalKeseluruhan) * 100);
        System.out.printf("Kontribusi UAS   : %.2f%%\n", (sumUAS / sumTotalKeseluruhan) * 100);

        scanner.close();
    }
}