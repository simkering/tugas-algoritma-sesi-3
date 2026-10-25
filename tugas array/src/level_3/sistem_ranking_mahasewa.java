package level_3;

public class sistem_ranking_mahasewa {
    public static void main(String[] args) {
        int mahasiswa[]={78,90,65,90,85,72,95,85};
        int N=mahasiswa.length;
        for(int i=0; i<N; i++){
            for(int a=i+1;a<N; a++){
                if (mahasiswa[i]<mahasiswa[a]) {
                    int nilai=mahasiswa[i];
                    mahasiswa[i]=mahasiswa[a];
                    mahasiswa[a]=nilai;
                }
            }
        }
        System.out.print("nilai: ");
        for(int i=0; i<N; i++){
            if (i==0) {
                System.out.print(mahasiswa[i]);
            } else{
                System.out.print(","+ mahasiswa[i]);
            }
        }
        System.out.println();
        int nilaiTertinggi=-1;
        int simpan=0;
        for(int i=0; i<N; i++){
            if (mahasiswa[i]!=nilaiTertinggi) {
                System.out.println("nilai tertinggi ialah: "+ mahasiswa[i]);
                nilaiTertinggi=mahasiswa[i];
                simpan++;
                if (simpan==3) {
                    break;
                }
            }
        }
        int rank =1;
        for(int i=0; i<N; i++){
            if (i> 0 && mahasiswa[i]!= mahasiswa[i-1]) {
                rank=i+1;
            }
            System.out.println("nilai: "+mahasiswa[i]+ " peringkat: " + rank);
        }
    }
}
    


