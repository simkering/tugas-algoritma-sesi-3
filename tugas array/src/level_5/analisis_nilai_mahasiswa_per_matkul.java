package level_5;

public class analisis_nilai_mahasiswa_per_matkul {
    public static void main(String[] args) {
        int nilai[][]={
            {80,75,90},
            {65,70,85},
            {90,95,88},
            {72,68,78}
        };
        int jmaha=nilai.length;
        int jmatkul=nilai[0].length;
        System.out.println("        |matkul-1|matkul-2|matkul-3|");
        for(int i=0; i<jmaha; i++){
            System.out.print("mhs ke-"+(i+1)+"|");
            for(int j=0; j<jmatkul; j++){
                System.out.print(nilai[i][j]+"      |");
            }
            System.out.println();
        }
        double rataTinggi=0;
        int mahaAmbis=0;
        for(int i=0; i<jmaha; i++){
            double totalmaha=0;
            for(int j=0; j<jmatkul; j++){
                totalmaha=totalmaha +nilai[i][j];
            }
        double ratamaha=totalmaha/jmatkul;
        System.out.println("rata-rata mahasiswa ke-"+(i+1)+" ialah: " +ratamaha);
            if (ratamaha>rataTinggi) {
            rataTinggi=ratamaha;
            mahaAmbis=i+1;
            }
        }
        System.out.println("rata-rata mahasiswa tertinggi ialah: "+mahaAmbis+" dengan rata-rata:"+rataTinggi);
        
        double rataRendah=100;///ngecheat dikit pak, stress error outpputnya jd 0 terus. klw ini di ubh ke 100 jd lancar jaya
        int totalterendah=0;
        for(int j=0; j<jmatkul; j++){
            double totalMatkul=0;
            for(int i=0; i<jmaha; i++){
                totalMatkul+=nilai[i][j];
            }
            double rataMakul=totalMatkul/jmaha;
            System.out.println("rata-rata matkul ke-"+(j+1)+" ialah: " +rataMakul);
            if (rataMakul<rataRendah) {
                rataRendah=rataMakul;
                totalterendah=j+1;   
            }
        }
        System.out.println("rata-rata matkul terendah ialah: "+totalterendah+" dengan rata-rata:"+rataRendah);
    }

}
///6. satu pengulangan hanya bisa mengakses kolom saja. klw nested loopbisa buat baris,kolom
///7. jika jumlah mahasiswa dan matakuliah berbeda(matrix persegi panjang), kode di atas tetap lancar jaya pak karna menggunakan fungsi .length dan  [].lenght yg langsung mengukur panjang baris dan kolom si array
