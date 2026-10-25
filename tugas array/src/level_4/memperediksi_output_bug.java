package level_4;

public class memperediksi_output_bug {
    public static void main(String[] args) {
        // Data awal dari kasus soal nomor 15
        int[] data = {1, 2, 3, 4, 5};
        int n = data.length;

        System.out.println("=== PROGRAM ANALISIS BUG SIMETRIS ===");
        
        // Memproses modifikasi elemen array setengah simetris balik
        for (int i = 0; i < n; i++) {
            data[i] = data[i] + data[n - 1 - i];
        }

        // Mencetak hasil akhir menggunakan Arrays.toString()
        System.out.print("Output Program: ");
        System.out.println(java.util.Arrays.toString(data));
    }
}

///1. Output dari program di atas setelah di-run adalah: [6, 6, 6, 10, 11].
///2. Program TIDAK menghasilkan pasangan nilai yang simetris penuh (seperti [6, 6, 6, 6, 6]) karena adanya tumpang tindih perubahan nilai.
///3. Perubahan pada elemen awal memengaruhi elemen berikutnya akibat data asli di indeks 0 dan 1 sudah berubah (ditimpa) sebelum sempat dibaca oleh perulangan indeks akhir (indeks 3 dan 4).
///4. Rancang perbaikan yang tepat agar simetris murni adalah dengan menyimpan nilai awal ke array cadangan (clone), atau menghentikan batas perulangan cukup sampai setengah panjang array saja (i < n / 2).
