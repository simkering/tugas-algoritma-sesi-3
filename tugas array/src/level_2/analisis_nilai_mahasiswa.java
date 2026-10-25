package level_2;

public class analisis_nilai_mahasiswa {
    public static void main(String[] args) {
        int nilai[]={75,80,65,90,55,85,70,95};
        int total=0;
        int mahasiswa_anti_remedial=0;
        double persentase_nahasiswa_lulus=0;
        for (int i=0; i<nilai.length; i++){
            total+=nilai[i];
        }
        double rata_rata = total / nilai.length;
        System.err.println("rata-rata nilai mahasiswa ialah: " + rata_rata);
        System.out.println("nilai mahasiswa yg ada di atas rata-rata: ");
        for (int i=0; i<nilai.length; i++){
            if (nilai[i]>rata_rata) {
                System.out.print(nilai[i]+",");
            }
        }
        for (int i=0; i<nilai.length; i++){
            if (nilai[i]>=70) {
                mahasiswa_anti_remedial++;
            }
        }
        System.out.println();
        System.out.println("jumlah mahasiswa dengan nilai di atas kkm: " + mahasiswa_anti_remedial);
        persentase_nahasiswa_lulus =persentase_nahasiswa_lulus + ((double)mahasiswa_anti_remedial/nilai.length) * 100;
        System.out.print("persentase mahasiswa yg lulus ialah: "+ persentase_nahasiswa_lulus);
    }

}
