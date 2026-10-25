package level_2;

public class mencari_nilai_teritinggi_dan_terendah {
    public static void main(String[] args) {
        int suhu[]={29,32,27,35,31,26,34};
        int suhuTertinggi=suhu[0];
        int suhuTerendah=suhu[0];
        for (int A : suhu){
            if (A > suhuTertinggi) {
                suhuTertinggi=A;
            }
            if (A < suhuTerendah) {
                suhuTerendah=A;
            }   
        }
        System.out.println("suhu tertinggi aialah: " + suhuTertinggi+"°");
        System.out.println("suhu terendah ialah: " + suhuTerendah+"°");
        for (int i=suhu.length-1; i>=0; i--){
            System.out.println("indeks ke-"+i+" memiliki suhu: "+suhu[i]+"°");
        }
        int selisih=suhuTertinggi-suhuTerendah;
        System.out.println("selisih suhu tertinggi dan terendah ialah: "+ selisih + "°");
    }

}
